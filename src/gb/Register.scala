package gb

class Register(var value:Int = 0) {
  
  def getFlag(flag : Int) = flag match {
    case 0x80 if (value & 0x80) != 0 => true
    case 0x40 if (value & 0x40) != 0 => true
    case 0x20 if (value & 0x20) != 0 => true
    case 0x10 if (value & 0x10) != 0 => true
  }

  def setFlag(x: Boolean, f: Int) = if (x) value |= f else value &= ~f

  def setZeroFlag(x: Boolean) = setFlag(x, 0x80)
  def setSubFlag(x: Boolean) = setFlag(x, 0x40)
  def setHalfCarryFlag(x: Boolean) = setFlag(x, 0x20)
  def setCarryFlag(x: Boolean) = setFlag(x, 0x10)  

  def +(i:Int) = new Register(value + i)
  def :=(i:Int) = value = i
  def +=(i:Int) = value += i
  def -=(i:Int) = value -= i
  def ==(i:Int) = value == i
  def <<(i:Int) = value << i
  
}

object Register {
	implicit def reg2int(r:Register):Int = r.value
}