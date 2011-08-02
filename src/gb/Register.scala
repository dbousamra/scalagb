package gb

class Register(private var value:Int = 0) {

  def setFlag(x: Boolean, f: Int) = if (x) value |= f else value &= ~f

  def zeroFlag_=(x: Boolean) = setFlag(x, 0x80)
  def subFlag_=(x: Boolean) = setFlag(x, 0x40)
  def halfCarryFlag_=(x: Boolean) = setFlag(x, 0x20)
  def carryFlag_=(x: Boolean) = setFlag(x, 0x10)  
  
  def zeroFlag : Boolean = (value & 0x80) != 0
  def subFlag : Boolean = (value & 0x40) != 0
  def halfCarryFlag : Boolean = (value & 0x40) != 0 
  def carryFlag : Boolean = (value & 0x40) != 0 

  def getHexString() : String = value.toHexString
  
  def +(i:Int) = new Register(value + i)
  def :=(i:Int) = value = i
  def +=(i:Int) = value += i
  def -=(i:Int) = value -= i
  def ==(i:Int) = value == i
  def <<(i:Int) = value << i
  def >>(i:Int) = value >> i
  def &=(i:Int) = value &= i
  def |=(i:Int) = value |= i
  def ^=(i:Int) = value ^= i
  
}

object Register {
	implicit def reg2int(r:Register):Int = r.value
	implicit def bool2int(b:Boolean):Int = if (b) 1 else 0
	
	
}