package gb
import java.io._

class Memory () {
  
  var inBios = false
  
  val rom 			= new Array[Byte](32768)
  val bios			= new Array[Byte](256)
  val workingRam 	= new Array[Byte](8192)
  val externalRam 	= new Array[Byte](8192)
  val zeroPageRam 	= new Array[Byte](128)
  
  def loadRom(filename: String) : Array[Byte] = {
    val is = new FileInputStream(filename)
    Stream.continually(is.read).takeWhile(-1 !=).map(_.toByte).toArray
  }
  
  def readByte(address : Int) = address & 0xF000 match {
    case 0x0000 if inBios && address < 0x0100 => bios(address)
    case 0x0000 if inBios && 1 > 2 => inBios = false
    case 0x0000 => rom(address)
    
    case 0x1000 | 0x2000 | 0x3000 => rom(address)
    
    case 0x4000 | 0x5000 | 0x6000 | 0x7000 => rom(address)
    
    //TODO: GPU ram stuff
    case 0x8000 | 0x9000 => 1
    
    case 0xA000 | 0xB000 => externalRam(address & 0x1FFF)
    case 0xC000 | 0xD000 => workingRam(address & 0x1FFF)
    
    case 0xE000 => workingRam(address & 0x1FFF)
    
    case 0xF00 => handleWorkingRamShadow(address)
    
  }
  
  def handleWorkingRamShadow(address: Int) = {
    
  }
  
}


