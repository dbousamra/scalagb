package gb
import java.io._

class Cpu {
  var Register : Registers = new Registers()
  
}

class MemoryManager (romFileName : String) {
  
  var inBios = false
  
  val rom 			= loadRom(romFileName)
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


class Registers {
  
  type Byte = Int
  var a, b, c, d, e, h, l, f : Int = 0
  
  var instructionPointer : Byte = 0
  var stackPointer : Byte = 0
  
  var mClock, tClock : Int = 0
  
  def getFlag(flag : Int) = flag match {
    case 0x80 if (f & 0x80) != 0 => true
    case 0x40 if (f & 0x40) != 0 => true
    case 0x20 if (f & 0x20) != 0 => true
    case 0x10 if (f & 0x10) != 0 => true
  }

  def setFlag(flag : Int) = flag match {
    case 0x80 => f |= 0x80
    case 0x40 => f |= 0x40
    case 0x20 => f |= 0x20
    case 0x10 => f |= 0x10
  }
  
}