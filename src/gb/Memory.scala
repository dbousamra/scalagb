package gb
import java.io._

class Memory (romFilename : String) {
  
  var inBios = false
  
  val rom 			= loadRom(romFilename)
  val bios			= new Array[Int](256)
  val workingRam 	= new Array[Int](8192)
  val externalRam 	= new Array[Int](8192)
  val zeroPageRam 	= new Array[Int](128)
  
  def loadRom(filename: String) : Array[Int] = {
    val is = new FileInputStream(filename)
    Stream.continually(is.read).takeWhile(-1 !=).toArray
  }
  
  def readInt8(address : Int, cpu : Cpu) : Int = address & 0xF000 match {
    case 0x0000 if inBios && address < 0x0100 => bios(address)
    case 0x0000 if inBios && cpu.registers.pc == 0x0100 => inBios = false; rom(address)
    case 0x0000 => rom(address)   
    case 0x1000 | 0x2000 | 0x3000 => rom(address)  
    case 0x4000 | 0x5000 | 0x6000 | 0x7000 => rom(address)  
    //TODO: GPU ram stuff
    case 0x8000 | 0x9000 => 1  
    case 0xA000 | 0xB000 => externalRam(address & 0x1FFF)
    case 0xC000 | 0xD000 => workingRam(address & 0x1FFF)   
    case 0xE000 => workingRam(address & 0x1FFF)
    case 0xF000 => handleWramShadowRead(address) 
  }
  
   //Helper function that just reads next Int and concatenates them.
  //eg. Int 1 = 0x4f and Int 2 = 0x13 would give 0x134f
  def readInt16(address : Int, cpu : Cpu) = {
    readInt8(address, cpu) + (readInt8(address+1, cpu) << 8)
  }
  
  
  def writeInt8(address : Int, cpu : Cpu, value: Int) = address & 0xF000 match {
    case 0x8000 | 0x9000 => 1
    case 0xA000 | 0xB000 => externalRam(address & 0x1FFF) = value
    case 0xC000 | 0xD000 | 0xE000 => workingRam(address & 0x1FFF) = value  
    case 0xF000 => handleWramShadowWrite(address, value)
  }
  
  def writeInt16(address : Int, cpu : Cpu, value : Int) = {
    writeInt8(address, cpu, value & 255)
    writeInt8(address + 1, cpu, value >> 8)
  }
  
  def handleWramShadowRead(address: Int) : Int = address & 0x0F00 match{
    case 0x000 | 0x000 | 0x100 | 0x200 | 
         0x300 | 0x400 | 0x500 | 0x600 | 
         0x700 | 0x800 | 0x900 | 0xA00 |
         0xB00 | 0xC00 | 0xD00 => workingRam(address & 0x1FFF)      
    //TODO: GPU ram stuff     
    case 0xE00 if address < 0xFF7F => 1     
    case 0xF00 if address >= 0xFF7F => zeroPageRam(address & 0x07F)
  }
  
  def handleWramShadowWrite(address: Int, value : Int) = address & 0x0F00 match{
    case 0x000 | 0x000 | 0x100 | 0x200 | 
         0x300 | 0x400 | 0x500 | 0x600 | 
         0x700 | 0x800 | 0x900 | 0xA00 |
         0xB00 | 0xC00 | 0xD00 => workingRam(address & 0x1FFF) = value    
    //TODO: GPU ram stuff     
    case 0xE00 if (address & 0xFF) < 0xA0 => 1
    case 0xF00 if address >= 0xFF7F => zeroPageRam(address & 0x7F) = value
   
  }
  
}


