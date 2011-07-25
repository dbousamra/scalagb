package gb

class Cpu(romFilename : String) {
  
  var memory : Memory = new Memory(romFilename)
  var registers : Registers = new Registers()
  var opcodes: Opcodes = new Opcodes()
  
  var DEBUG_MODE = true
  
  def reset() = {
    registers.resetRegisters()
  }
  
  def run() = {
    while (true) {
	    val opcode = memory.readByte8(this, registers.pc)
	    registers.pc = (registers.pc + 1) & 0xFFFF //prevent overflow
	    opcodes.execute(opcode, this)
	    if (DEBUG_MODE) {
	      println(debugTraces(opcode))
	    }
    }  
  }
  
  def debugTraces(opcode : Int) = {
    "PC = " + registers.pc + " Just executed=" + opcode + " \tSP=" + registers.sp + 
        " A=" + registers.a + 
        " B=" + registers.b + 
        " C=" + registers.c +
        " D=" + registers.d + 
        " E=" + registers.e +
        " H=" + registers.h + 
        " F=" + registers.f.toBinaryString
  }
  
}