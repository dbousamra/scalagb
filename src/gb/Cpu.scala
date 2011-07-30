package gb

class Cpu(romFilename : String, DEBUG_MODE : Boolean) {
  
  var memory : Memory = new Memory(romFilename)
  var registers : Registers = new Registers()
  var opcodes: Opcodes = new Opcodes()
  
  def reset() = {
    registers.resetRegisters()
  }
  
  def run(breakPoint : Int) = {
    var x = 0
    while (x < breakPoint) {
	    val opcode = memory.readByte8(this, registers.pc)
	    registers.pc = (registers.pc + 1) & 0xFFFF //prevent overflow
	    opcodes.execute(opcode, this)
	    if (DEBUG_MODE) {
	    	println(debugTraces(opcode))
	    }
	    x += 1
    }  
  }
  
  def debugTraces(opcode : Int) = {
    "PC = " + registers.pc.toHexString + " Just executed=" + opcode.toHexString + " \tSP=" + registers.sp.toHexString + 
        " A=" + registers.a.toHexString + 
        " B=" + registers.b.toHexString + 
        " C=" + registers.c.toHexString +
        " D=" + registers.d.toHexString + 
        " E=" + registers.e.toHexString +
        " H=" + registers.h.toHexString + 
        " F=" + registers.f.toBinaryString
  }	
  
}