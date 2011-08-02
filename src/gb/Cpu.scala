package gb

class Cpu(romFilename : String, DEBUG_MODE : Boolean) {
  
  var clockT, clockM : Register = new Register
  var a, b, c, d, e, h, l, f : Register = new Register
  var reserve_a, reserve_b, reserve_c : Register = new Register
  var reserve_d, reserve_e, reserve_h, reserve_l, reserve_f : Register = new Register
  var pc : Register = new Register
  var sp : Register = new Register
  
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
    sp := 0xFFFE
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
      //println(debugTraces2(opcode))
    }
  }

  
//  def debugTraces(opcode : Int) = {
//    "PC = " + pc.value.toHexString + " Just executed=" + opcode.toHexString + " \tSP=" + registers.sp.toHexString + 
//        " A=" + registers.a.toHexString + 
//        " B=" + registers.b.toHexString + 
//        " C=" + registers.c.toHexString +
//        " D=" + registers.d.toHexString + 
//        " E=" + registers.e.toHexString +
//        " H=" + registers.h.toHexString + 
//        " F=" + registers.f.toBinaryString +
//        " F=" + registers.f.toHexString
//  }	
//  
//  def debugTraces2(opcode : Int) = { 
//    "PC = " + pc.value.toHexString + " Just executed=" + opcode.toHexString +
//    " AF: " + registers.a.toHexString + "" + registers.f.toHexString +
//    " BC: " + registers.b.toHexString + "" + registers.c.toHexString +
//    " HL: " + registers.h.toHexString + "" + registers.l.toHexString +
//    " DE: " + registers.d.toHexString + "" + registers.e.toHexString + 
//    " SP: " + registers.sp.toHexString + "" +
//    " PC: " + pc.value.toHexString
//    
//  }
//  
}