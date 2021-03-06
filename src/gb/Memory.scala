package gb
import java.io._

class Memory (gpu: Gpu, cpu: Cpu, romFilename : String) {
  
  var inBios = false
  
  val rom 			= loadRom(romFilename)
  val bios			= loadBios()
  val workingRam 	= new Array[Int](8192)
  val externalRam 	= new Array[Int](8192)
  val zeroPageRam 	= new Array[Int](128)
  
  val gpuVram 		= new Array[Int](8192)
  val gpuOam 		= new Array[Int](8192)
  
  def loadRom(filename: String) : Array[Int] = {
    val is = new FileInputStream(filename)
    Stream.continually(is.read).takeWhile(-1 !=).toArray
  }
  
  def readByte8(address : Int) : Int = address & 0xF000 match {
    case 0x0000 if inBios && address < 0x0100 => bios(address)
    case 0x0000 if inBios && cpu.pc == 0x0100 => inBios = false; rom(address)
    case 0x0000 => rom(address)
    case 0x1000 | 0x2000 | 0x3000 => rom(address)  
    case 0x4000 | 0x5000 | 0x6000 | 0x7000 => rom(address)  
    //TODO: GPU ram stuff
    case 0x8000 | 0x9000 => gpuVram(address & 0x1FFF) 
    case 0xA000 | 0xB000 => externalRam(address & 0x1FFF)
    case 0xC000 | 0xD000 => workingRam(address & 0x1FFF)   
    case 0xE000 => workingRam(address & 0x1FFF)
    case 0xF000 => (address & 0x0F00) match { 
    
    	case 0x000 | 0x000 | 0x100 | 0x200 | 
	         0x300 | 0x400 | 0x500 | 0x600 | 
	         0x700 | 0x800 | 0x900 | 0xA00 |
	         0xB00 | 0xC00 | 0xD00 => workingRam(address & 0x1FFF)      
	    //TODO: GPU ram stuff     
    	case 0xE00 if ((address & 0xFF) < 0xA0) => gpuOam(address & 0xFF)
    	case 0xE00 => 0
    	//TODO: IO stuff
    	case 0xF00 if address == 0xFFFF => 1 //ie register
    	case 0xF00 if address >= 0xFF7F => zeroPageRam(address & 0x07F)
    	case 0xF00 => (address & 0xF0) match {
    	  //TODO: IO stuff
    	  //case 0x00 => 1
    	  //case 0x10 | 0x20 | 0x30 => 1
    	  //TODO: GPU readByte stuff
    	  case 0x40 | 0x50 | 0x60 | 070 => gpu.readByte8(address)
    	  //case _ => println("TEST"); 1
    	  case _ => notImplemented; 0
    	}
    case _ =>  0
    }
  }
  
  def readByte8Signed(address : Int) = {
    val x = readByte8(address)
    (x & 0x7F) - (x & 0x80)
  }
  
   //Helper function that just reads next Int and concatenates them.
  //eg. Int 1 = 0x4f and Int 2 = 0x13 would give 0x134f
  def readByte16(address : Int) : Int = {
    (readByte8(address) + (readByte8(address+1) << 8))
  }
  
  
  def writeByte8(address : Int, value: Int) = address & 0xF000 match {
    
    //TODO
    case 0x0000 | 0x1000 => 1 //turn exram on
    
    //TODO
    case 0x2000 | 0x3000 => 1 //handle rom bank switch
    
    //TODO
    case 0x4000 | 0x5000 => 1 //handle rom bank switch
    
    //TODO
    case 0x6000 | 0x7000 => 1 //handle rom bank switch
    
    case 0x8000 | 0x9000 => gpuVram(address & 0x1FFF) = value ; gpuUpdateTile(address & 0x1FFF, value)
    						
    case 0xA000 | 0xB000 => externalRam(address & 0x1FFF) = value
    
    case 0xC000 | 0xD000 | 0xE000 => workingRam(address & 0x1FFF) = value  

    case 0xF000 => (address & 0x0F00) match { 
      
      case 0x000 | 0x000 | 0x100 | 0x200 | 
           0x300 | 0x400 | 0x500 | 0x600 | 
           0x700 | 0x800 | 0x900 | 0xA00 |
           0xB00 | 0xC00 | 0xD00 => workingRam(address & 0x1FFF) = value 
           
      case 0xE00 if (address & 0xFF) < 0xA0 => gpuOam(address & 0xFF) = value
      
      case 0xF00 if address == 0xFFFF => 1
      case 0xF00 if address >= 0xFF7F => zeroPageRam(address & 0x7F) = value
      case 0xF00 => (address & 0xF0) match {
        case 0x10 | 0x20 | 0x30 => 1
        case 0x40 | 0x50 | 0x60 | 0x70 => gpu.writeByte8(address, value)
        case _ => 0
      }
    }
    case _ => println("Error in" + this.getClass.getName + "with address: " + address)
  }
  
  def writeByte16(address : Int, value : Int) = {
    writeByte8(address, value & 255)
    writeByte8(address + 1, value >> 8)
  }
 
  def loadBios() : Array[Int] = {
  //The gameboy bios. When the GAMEBOY logo drops
    Array(0x31, 0xFE, 0xFF, 0xAF, 0x21, 0xFF, 0x9F, 0x32, 0xCB, 0x7C, 0x20, 0xFB, 0x21, 0x26, 0xFF, 0x0E,
	      0x11, 0x3E, 0x80, 0x32, 0xE2, 0x0C, 0x3E, 0xF3, 0xE2, 0x32, 0x3E, 0x77, 0x77, 0x3E, 0xFC, 0xE0,
	      0x47, 0x11, 0x04, 0x01, 0x21, 0x10, 0x80, 0x1A, 0xCD, 0x95, 0x00, 0xCD, 0x96, 0x00, 0x13, 0x7B,
	      0xFE, 0x34, 0x20, 0xF3, 0x11, 0xD8, 0x00, 0x06, 0x08, 0x1A, 0x13, 0x22, 0x23, 0x05, 0x20, 0xF9,
	      0x3E, 0x19, 0xEA, 0x10, 0x99, 0x21, 0x2F, 0x99, 0x0E, 0x0C, 0x3D, 0x28, 0x08, 0x32, 0x0D, 0x20,
	      0xF9, 0x2E, 0x0F, 0x18, 0xF3, 0x67, 0x3E, 0x64, 0x57, 0xE0, 0x42, 0x3E, 0x91, 0xE0, 0x40, 0x04,
	      0x1E, 0x02, 0x0E, 0x0C, 0xF0, 0x44, 0xFE, 0x90, 0x20, 0xFA, 0x0D, 0x20, 0xF7, 0x1D, 0x20, 0xF2,
	      0x0E, 0x13, 0x24, 0x7C, 0x1E, 0x83, 0xFE, 0x62, 0x28, 0x06, 0x1E, 0xC1, 0xFE, 0x64, 0x20, 0x06,
	      0x7B, 0xE2, 0x0C, 0x3E, 0x87, 0xF2, 0xF0, 0x42, 0x90, 0xE0, 0x42, 0x15, 0x20, 0xD2, 0x05, 0x20,
	      0x4F, 0x16, 0x20, 0x18, 0xCB, 0x4F, 0x06, 0x04, 0xC5, 0xCB, 0x11, 0x17, 0xC1, 0xCB, 0x11, 0x17,
	      //logo starts around here
	      0x05, 0x20, 0xF5, 0x22, 0x23, 0x22, 0x23, 0xC9, 0xCE, 0xED, 0x66, 0x66, 0xCC, 0x0D, 0x00, 0x0B,
	      0x03, 0x73, 0x00, 0x83, 0x00, 0x0C, 0x00, 0x0D, 0x00, 0x08, 0x11, 0x1F, 0x88, 0x89, 0x00, 0x0E,
	      0xDC, 0xCC, 0x6E, 0xE6, 0xDD, 0xDD, 0xD9, 0x99, 0xBB, 0xBB, 0x67, 0x63, 0x6E, 0x0E, 0xEC, 0xCC,
	      0xDD, 0xDC, 0x99, 0x9F, 0xBB, 0xB9, 0x33, 0x3E, 0x3c, 0x42, 0xB9, 0xA5, 0xB9, 0xA5, 0x42, 0x4C,
	      0x21, 0x04, 0x01, 0x11, 0xA8, 0x00, 0x1A, 0x13, 0xBE, 0x20, 0xFE, 0x23, 0x7D, 0xFE, 0x34, 0x20,
	      0xF5, 0x06, 0x19, 0x78, 0x86, 0x23, 0x05, 0x20, 0xFB, 0x86, 0x20, 0xFE, 0x3E, 0x01, 0xE0, 0x50)
	}
  
  
  //TODO
  def gpuUpdateTile(address : Int, value : Int) = {
    //println("GPU UPDATE TILE");
  }
  
  def notImplemented() = {
    0
  }
  
}


