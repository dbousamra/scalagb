package gb
import Mode._
import java.awt.Color

class Palette() {

  var bg = new Array[Int](8192)
  var object0 = new Array[Int](8192)
  var object1 = new Array[Int](8192)

  def writePalette(address: Int, palette: Array[Int]) = address match {
    case 0 => palette(address) = 0xFF
    case 1 => palette(address) = 0xC0
    case 2 => palette(address) = 0x60
    case 3 => palette(address) = 0x00
    case _ => println("Error in" + this.getClass.getName + "with address: " + address)
  }
}

class Gpu(memory: Memory, cpu: Cpu) {

  var currentLine, currentScan: Int = 0
  var lineMode: Int = 2
  var modeClocks: Int = 0
  var yScreenLine, xScreenLine: Int = 0
  var raster: Int = 0
  var lcdStatus: Int = 0
  var writeLcd = false

  var bgTileBase, bgMapBase, bgOn, winTileBase: Int = 0
  var objectSize: Int = 0
  var objStatus: Int = 0
  var objDataSorted = new Array[Int](8192)
  var bgStatus: Int = 0

  var vram = new Array[Int](8192)
  val reg = new Array[Int](65535)
  var oam = new Array[Int](160)
  var tileMap = Array.ofDim[Int](512, 8, 8)
  var scanRow = new Array[Int](160)

  var palette = new Palette
  var tempLcd = new Array[Int](160 * 144 * 4)
  var lcd = Array.ofDim[Color](160, 144)

  def resetAndInitalize() = {

    //reset VRAM, OAM and scanRow
    vram transform (_ => 0)
    oam transform (_ => 0)
    scanRow transform (_ => 0)

    for (i <- 0 until 4) {
      palette.bg(i) = 255
      palette.object0(i) = 255
      palette.object1(i) = 255
    }

    //reset tileMap
    for (xss <- tileMap; xs <- xss)
      xs transform (_ => 0)

    //reset writeable LCD
    for {
      row <- lcd.indices
      column <- lcd(row).indices
    } lcd(row)(column) = Color.RED
    
    //reset tempLCD
    for (i <- 0 until tempLcd.length) tempLcd(i) = 255
    

    bgTileBase = 0x0000
    bgMapBase = 0x1800
    winTileBase = 0x1800
  }

  def step() = {
    modeClocks += cpu.clockM
    println(modeClocks)
    println("STEP")

    lineMode match {
      case 0x00 => handleHBlank()
      case 0x01 => handleVBlank()
      case 0x02 => handleOAMRead()
      case 0x03 => 3

    }

    def handleHBlank() = {
      if (modeClocks >= H_BLANK.clocksSpent) {
    	  println("Mode clocks " + modeClocks)
        //render screen
        if (currentLine == 143) {
          lineMode = V_BLANK.modeType
          println("RENDER")
          lcd = convertTempLCD(tempLcd)
          writeLcd = true
        } else {
          lineMode = SCANLINE_OAM.modeType
        }

        currentLine += 1
        currentScan += 640
        lineMode = H_BLANK.modeType
      }
    }

    def handleVBlank() = {
      if (modeClocks >= V_BLANK.clocksSpent) {
        modeClocks = 0
        currentLine += 1
        if (currentLine > 153) {
          currentLine = 0
          currentScan = 0
          lineMode = SCANLINE_OAM.modeType
        }
      }
    }

    def handleOAMRead() = {
      if (modeClocks >= SCANLINE_OAM.clocksSpent) {
        modeClocks = 0
        lineMode = SCANLINE_OAM.modeType
      }
    }

    def handleVramRead() = {
      if (modeClocks >= SCANLINE_VRAM.clocksSpent) {
        modeClocks = 0
        lineMode = H_BLANK.modeType

        if (lcdStatus == 1) {
          if (bgOn == 1) {
            var linebase = currentScan;
            var mapbase = bgMapBase + ((((currentLine + yScreenLine) & 255) >> 3) << 5);
            var y = (currentLine + yScreenLine) & 7;
            var x = xScreenLine & 7;
            var t = (xScreenLine >> 3) & 31;
            var pixel = 0
            var w = 160

            if (bgTileBase == 1) {
              var tile = vram(mapbase + t)
              if (tile < 128) tile = 256 + tile
              var tRow = tileMap(tile)(y)

              do {
                scanRow(160 - x) = tRow(x)
                tempLcd(linebase + 3) = palette.bg(tRow(x))
                x += 1
                if (x == 8) {
                  t = (t + 1) & 31
                  x = 0
                  tile = vram(mapbase + t);
                  if (tile < 128) {
                    tile = 256 + tile;
                    tRow = tileMap(tile)(y)
                  }
                }
                linebase += 4;
                w -= 1
              } while (w != 0)
            } else {
              var tRow = tileMap(vram(mapbase + t))(y)

              do {
                scanRow(160 - x) = tRow(x)
                tempLcd(linebase + 3) = palette.bg(tRow(x))
                x += 1
                if (x == 8) {
                  t = (t + 1) & 31;
                  x = 0;
                  tRow = tileMap(vram(mapbase + t))(y);
                }
                linebase += 4;
                w -= 1
              } while (w != 0)

            }
            
            if (bgOn == 1) {
              var cnt = 0;
              if(objectSize == 1)
              {

              }
              else {
                var tilerow = 0
                var obj = 0
                var pal = 0
                var pixel = 0
                var x = 0
                var linebase = currentScan
                
                for (i <- 0 until 40) {
                  //obj = obj[i];
                }
                
                
              }
            }
            
          }

        }

      }
    }
  }

  def readByte8(address: Int): Int = {
    //println("Trying to match gpu.readByte8 on " + address + " " + (address - 0xFF40))
    (address - 0xFF40) match {

      case 0x00 => handleGPUReset()
      case 0x01 if (currentLine == raster) => 0x4 | lineMode
      case 0x01 => 0 | lineMode
      case 0x02 => yScreenLine
      case 0x03 => xScreenLine
      case 0x04 => currentLine
      case 0x05 => raster
      case _ => reg(address)
    }
  }

  def writeByte8(address: Int, value: Int) = {
    var x = address - 0xFF40
    reg(x) = value
    x match {
      case 0x00 =>
        lcdStatus = if ((value & 0x0) != 0) 0x01 else 2
        bgTileBase = if ((value & 0x10) != 0) 0x0000 else 0x0800
        bgMapBase = if ((value & 0x08) != 0) 0x1C00 else 0x1800
        objectSize = if ((value & 0x04) != 0) 0x01 else 0x00
        bgOn = if ((value & 0x01) != 0) 0x01 else 0x00

      case 0x01 => println("matching 1")
      case 0x02 => yScreenLine = value

      case 0x03 => xScreenLine = value

      case 0x05 => raster = value

      case 0x06 =>
        var x: Int = 0
        for (i <- 0 to 160) {
          x = memory.readByte8(address)
          oam(i) = x
          writeOam(0xFE00 + i, x);
        }
      case 0x07 => for (i <- 0 to 4) palette.writePalette(((value >> (i * 2)) & 3), palette.bg)
      case 0x08 => for (i <- 0 to 4) palette.writePalette(((value >> (i * 2)) & 3), palette.bg)
      case 0x09 => for (i <- 0 to 4) palette.writePalette(((value >> (i * 2)) & 3), palette.bg)
    }
  }

  def writeOam(address: Int, value: Int) = {

  }

  def handleGPUReset(): Int = {
    var x = 0

    if (lcdStatus != 0) x |= 0x80 else x |= 0
    if (bgTileBase == 0x0000) x |= 0x10 else x |= 0
    if (bgMapBase == 0x1C00) x |= 0x08 else x |= 0
    if (objectSize != 0) x |= 0x04 else x |= 0
    if (objStatus != 0) x |= 0x02 else x |= 0
    if (bgStatus != 0) x |= 0x01 else x |= 0

    return x
  }

  def updateTileMap(addr: Int, value: Int) = {
    var address = addr
    var tempAddress = address
    if ((address & 1) != 0) tempAddress -= 1; address -= 1
    var tile = (address >> 4) & 511
    var y = (address >> 1) & 7
    var sx = 0
    for (x <- 0 until 8) {
      sx = 1 << (7 - x)

      //this.tileMap[tile]

    }
  }
  
  def convertTempLCD(tempLcd: Array[Int]): Array[Array[Color]] ={
	val x = Array.ofDim[Color](160, 144)
    for (row <- lcd.indices) {
      for (column <- lcd(row).indices) {
        println(row + " " + column)
        val red = tempLcd(((row*(160*4)) + (column*4)) + 1)
        val blue = tempLcd(((row*(160*4)) + (column*4)) + 2)
        val green = tempLcd(((row*(160*4)) + (column*4)) + 3)
        val alpha = tempLcd(((row*(160*4)) + (column*4)) + 4)
        x(row)(column) = new Color(red, blue, green, alpha)
      }
    } 
    return x
  }
}