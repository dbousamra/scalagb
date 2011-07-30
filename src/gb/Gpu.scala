package gb

class Gpu {
  
  var currentLine, currentScan : Int = 0
  var lineMode : Int = 2
  var modeClocks : Int = 0
  var yScreenLine, xScreenLine : Int = 0
  var raster : Int = 0
  var lcdStatus : Int = 0
  
  var bgTileBase, bgMapBase, bgOn : Int = 0
  var objectSize : Int = 0
  
  val reg 	= new Array[Int](8192)
  
  
  def readByte8(address : Int) : Int = (address - 0xFF40) match{
    
    case 0x00 => 1
    
    case 0x01 if (currentLine == raster) => 0x4 | lineMode
    case 0x01 => 0 | lineMode
    
    case 0x02 => yScreenLine
    
    case 0x03 => xScreenLine
    
    case 0x04 => currentLine
    
    case 0x05 => raster
    
    case _ =>  reg(address)
  }
  
  def writeByte8(address : Int, value : Int, mmu : Memory) = (address - 0xFF40) match {
    
    case 0x00 => lcdStatus  = if((value & 0x0) != 0) 0x01 else 2
    			 bgTileBase = if((value & 0x10) != 0) 0x0000 else 0x0800
    			 bgMapBase  = if((value & 0x08) != 0) 0x1C00 else 0x1800
    			 objectSize = if((value & 0x04) != 0) 0x01 else 0x00
    			 bgOn       = if((value & 0x01) != 0) 0x01 else 0x00
    			 
    case 0x02 => yScreenLine = value
    
    case 0x03 => xScreenLine = value
    
    case 0x05 => raster = value
    
    case 0x06 => var x : Int = 0
    			 for(i <- 0 to 160) {
    			   x = mmu.readByte8(1, 1)
    			 }
}

      

  }

}