package gb

class Register(private var _value:Int = 0, val name:String = "Temp") {

  def value = _value
  def value_=(i: Int) = _value = i

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
  def ++(r:Register) = new Register16(this, r)
  
  override def toString = name + ": " + getHexString
}

class Register16(r1: Register, r2: Register) extends Register {
  override def value = (r1 << 8) + r2
  override def value_=(i: Int) = {
    r1 := (i >> 8) & 255 //unshift bits
    r2 := i & 255
  }
}

object Register {
	implicit def reg2int(r:Register):Int = r.value
	implicit def bool2int(b:Boolean):Int = if (b) 1 else 0
	
	
}