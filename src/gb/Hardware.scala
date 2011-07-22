package gb
import scala.collection.mutable.BitSet

class Registers {
  
  var a, b, c, d, e, h, l, f : BitSet = BitSet()
  
  var instructionPointer : BitSet = BitSet()
  var stackPointer : BitSet = BitSet()
  
  var mClock, tClock : Int = 0
  
  val ZERO_FLAG : BitSet = BitSet(0x80)	
  val SUBTRACT_FLAG : BitSet = BitSet(0x40)
  val HALF_CARRY_FLAG : BitSet = BitSet(0x20)
  val CARRY_FLAG : BitSet = BitSet(0x10)

  
  
  def setFlag(flag: BitSet) = flag match {
    case ZERO_FLAG => f |= ZERO_FLAG
    case SUBTRACT_FLAG => f |= SUBTRACT_FLAG
    case HALF_CARRY_FLAG => f |= HALF_CARRY_FLAG
    case CARRY_FLAG => f |= CARRY_FLAG
  }
  

 
  
  
  
}