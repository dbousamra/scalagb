package gb
import Register._
class Cpu(romFilename : String, DEBUG_MODE : Boolean) {
  
  var clockT, clockM : Register = new Register
  var a, b, c, d, e, h, l, f : Register = new Register
  var reserve_a, reserve_b, reserve_c : Register = new Register
  var reserve_d, reserve_e, reserve_h, reserve_l, reserve_f : Register = new Register
  var pc : Register = new Register
  var sp : Register = new Register
  var halt : Register = new Register
  var interruptable = true
  
  var opcodes : Opcodes = new Opcodes(this)
  var gpu : Gpu = new Gpu(memory)
  var memory : Memory = new Memory(gpu, this, romFilename)
  
  
  def reset() = {
    resetRegisters()
  }
  
  def resetRegisters() = {
    a := 0x01; b := 0x00 ; c := 0x13
    d := 0x00; e := 0xD8 ; h := 0x01
    f := 0xB0; l := 0x4d ; pc := 0x0100
    sp := 0xFFFE; halt := 0
  }
  
  def carryOccurred(register : Register) : Boolean = {
    (register > 0xFF)  | (register < 0x00)
  }
  
  //if the result of the operation is zero
  def zeroOccurred(register : Register) : Boolean = {
    (register & 0xFF) == 0 
  }
  
   //if the result of the lower nibble was more then 15
  def halfCarryOccurred(register1Prior : Register, register1 : Register, register2 : Register) : Boolean = {
   ((register1 ^ register2 ^ register1Prior) & 0x10) != 0
  }

  def run() = {
    val opcode = memory.readByte8(pc)
    pc += 1
    
    opcodes.execute(opcode)
    pc &= 0xFFFF //prevent overflow
    if (DEBUG_MODE) {
      println(debugTraces2(opcode))
    }
  }


  def debugTraces2(opcode : Int) = { 
    "PC = " + pc.getHexString + " Just executed=" + opcode.toHexString +
    " AF: " + a.getHexString + "" + f.getHexString +
    " BC: " + b.getHexString + "" + c.getHexString +
    " HL: " + h.getHexString + "" + l.getHexString +
    " DE: " + d.getHexString + "" + e.getHexString + 
    " SP: " + sp.getHexString + "" +
    " PC: " + pc.getHexString
    
  }
  
}