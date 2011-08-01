package gb

class Register() {
  var value = 0
  
  def getFlag(flag : Int) = flag match {
    case 0x80 if (value & 0x80) != 0 => true
    case 0x40 if (value & 0x40) != 0 => true
    case 0x20 if (value & 0x20) != 0 => true
    case 0x10 if (value & 0x10) != 0 => true
  }
  
   def setZeroFlag(x : Boolean) = x match {
    case true  => value |= 0x80
    case false => value &= ~0x80
  }
  
  def setSubFlag(x : Boolean) = x match {
    case true  => value |= 0x40
    case false => value &= ~0x40
  }
  
  def setHalfCarryFlag(x : Boolean) = x match {
    case true  => value |= 0x20
    case false => value &= ~0x20
  }
  
  def setCarryFlag(x : Boolean) = x match {
    case true  => value |= 0x10
    case false => value &= ~0x10
  }
}