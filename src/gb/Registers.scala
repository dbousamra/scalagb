package gb

class Registers {
  
  type Byte = Int
  
  var clockT, clockM : Int = 0
  var a, b, c, d, e, h, l, f : Int = 0
  
  var pc : Byte = 0
  var sp : Byte = 0
  
  var lastInstrClockm, lastInstrClockt : Int = 0
  
  def resetRegisters() = {
    a = 0 ; b = 0 ; c = 0 
    d = 0 ; e = 0 ; h = 0 
    h = 0 ; f = 0 ;
  }
  
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