package gb

class Registers {
  
  type Byte = Int
  
  var clockT, clockM : Int = 0
  var a, b, c, d, e, h, l, f : Int = 0
  var reserve_a, reserve_b, reserve_c : Int = 0
  var reserve_d, reserve_e, reserve_h, reserve_l, reserve_f : Int = 0
  
  var pc : Byte = 0
  var sp : Byte = 0
  
  var lastInstrClockm, lastInstrClockt : Int = 0
  var ime, halt : Int = 0
  
  def resetRegisters() = {
    a = 0x01; b = 0x00 ; c = 0x13
    d = 0x00; e = 0xD8 ; h = 0x01
    f = 0xB0; l = 0x4d ; pc = 0x0100
    sp = 0xFFFE
  }
  
  def getFlag(flag : Int) = flag match {
    case 0x80 if (f & 0x80) != 0 => true
    case 0x40 if (f & 0x40) != 0 => true
    case 0x20 if (f & 0x20) != 0 => true
    case 0x10 if (f & 0x10) != 0 => true
  }


  def setFlag(flag : String) = flag match {
    case "ZERO"      => f |= 0x80
    case "SUB"       => f |= 0x40
    case "HALFCARRY" => f |= 0x20
    case "CARRY"     => f |= 0x10
  }
  
   def unsetFlag(flag : String) = flag match {
    case "ZERO"	     => f &= ~0x80
    case "SUB" 	 	 => f &= ~0x40
    case "HALFCARRY" => f &= ~0x20
    case "CARRY"     => f &= ~0x10
  } 
   
  //if overflowed, we carry
  def carryOccurred(register : Int) : Boolean = {
    (register > 0xFF)  | (register < 0x00)
  }
  
  //if the result of the operation is zero
  def zeroOccurred(register : Int) : Boolean = {
    (register & 0xFF) == 0 
  }
  
   //if the result of the lower nibble was more then 15
  def halfCarryOccurred(register1Prior : Int, register1 : Int, register2 : Int) : Boolean = {
   ((register1 ^ register2 ^ register1Prior) & 0x10) == 0
  }
}