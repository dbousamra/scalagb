package gb

class Register(var value:Int = 0) {

  def setFlag(x: Boolean, f: Int) = if (x) value |= f else value &= ~f

  def setZeroFlag(x: Boolean) = setFlag(x, 0x80)
  def setSubFlag(x: Boolean) = setFlag(x, 0x40)
  def setHalfCarryFlag(x: Boolean) = setFlag(x, 0x20)
  def setCarryFlag(x: Boolean) = setFlag(x, 0x10)  
  
  def getZeroFlag() : Boolean = (value & 0x80) != 0
  def getSubFlag() : Boolean = (value & 0x40) != 0
  def getHalfCarryFlag() : Boolean = (value & 0x40) != 0 
  def getCarryFlag() : Boolean = (value & 0x40) != 0 

  def +(i:Int) = new Register(value + i)
  def :=(i:Int) = value = i
  def +=(i:Int) = value += i
  def -=(i:Int) = value -= i
  def ==(i:Int) = value == i
  def <<(i:Int) = value << i
  def &=(i:Int) = value &= i
  def |=(i:Int) = value |= i
  
}

object Register {
	implicit def reg2int(r:Register):Int = r.value
	implicit def bool2int(b:Boolean):Int = if (b) 1 else 0
	
}