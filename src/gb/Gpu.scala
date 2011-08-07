package gb

class Palette() {
  
  var bg = new Array[Int](8192)
  var object0 = new Array[Int](8192)
  var object1 = new Array[Int](8192)
  
  def writePalette(address : Int, palette : Array[Int]) = address match {
    case 0 => palette(address) = 0xFF
    case 1 => palette(address) = 0xC0
    case 2 => palette(address) = 0x60
    case 3 => palette(address) = 0x00
    case _ => println("Error in" + this.getClass.getName + "with address: " + address)
  }
}

class Gpu(memory : Memory) {
  
  var currentLine, currentScan : Int = 0
  var lineMode : Int = 2
  var modeClocks : Int = 0
  var yScreenLine, xScreenLine : Int = 0
  var raster : Int = 0
  var lcdStatus : Int = 0
  
  var bgTileBase, bgMapBase, bgOn : Int = 0
  var objectSize : Int = 0
  var objStatus : Int = 0
  var bgStatus : Int = 0
  
  val reg = new Array[Int](0xFFFF)
  val oam = new Array[Int](8192)
  
  var palette = new Palette
  
  
  def readByte8(address : Int) : Int = {
    println("Trying to match gpu.readByte8 on " + address + " " + (address - 0xFF40))
    (address - 0xFF40) match {
  
    
    case 0x00 => handleGPUReset()
    
    case 0x01 if (currentLine == raster) => 0x4 | lineMode
    case 0x01 => 0 | lineMode
    
    case 0x02 => yScreenLine
    
    case 0x03 => xScreenLine
    
    case 0x04 => currentLine
    
    case 0x05 => raster
    
    case _ =>  reg(address)
  }
}
  
  def writeByte8(address : Int, value : Int) = {
    var x = address - 0xFF40
    reg(x) = value
    x match {
	    case 0x00 => lcdStatus  = if((value & 0x0) != 0) 0x01 else 2
	    			 bgTileBase = if((value & 0x10) != 0) 0x0000 else 0x0800
	    			 bgMapBase  = if((value & 0x08) != 0) 0x1C00 else 0x1800
	    			 objectSize = if((value & 0x04) != 0) 0x01 else 0x00
	    			 bgOn       = if((value & 0x01) != 0) 0x01 else 0x00
	    			 
	    case 0x01 => println("matching 1")
	    case 0x02 => yScreenLine = value
	    
	    case 0x03 => xScreenLine = value
	    
	    case 0x05 => raster = value
	    
	    case 0x06 => var x : Int = 0
	    			 for(i <- 0 to 160) {
	    			   x = memory.readByte8(address)
	    			   oam(i) = x
	    			   writeOam(0xFE00+i, x);
	    			 }
	    case 0x07 => for (i <- 0 to 4) palette.writePalette(((value >> (i * 2)) & 3), palette.bg)
	    case 0x08 => for (i <- 0 to 4) palette.writePalette(((value >> (i * 2)) & 3), palette.bg)
	    case 0x09 => for (i <- 0 to 4) palette.writePalette(((value >> (i * 2)) & 3), palette.bg)
	  }
  }

  def writeOam(address : Int, value : Int) = {
    
  }
  
  
  def handleGPUReset() : Int = {
    var x = 0
    
    if (lcdStatus != 0) x |= 0x80 else x |= 0
    if (bgTileBase == 0x0000) x |= 0x10 else x |= 0
    if (bgMapBase == 0x1C00) x |= 0x08 else x |= 0
    if (objectSize != 0) x |= 0x04 else x |= 0
    if (objStatus != 0) x |= 0x02 else x |= 0
    if (bgStatus != 0) x |= 0x01 else x |= 0
    
    return x
  }


}