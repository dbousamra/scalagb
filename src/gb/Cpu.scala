package gb

class Cpu(romFilename : String) {
  
  var memory : Memory = new Memory(romFilename)
  var registers : Registers = new Registers()
  var opcodes: Opcodes = new Opcodes()
  
  def reset() = {
    registers.resetRegisters()
  }
  
  def run() = {
    while (true) {
	    val opcode = memory.readByte8(registers.pc, this)
	    registers.pc = (registers.pc + 1) & 0xFFFF //prevent overflow
	    opcodes.execute(opcode, this)
	    }
    
  }
  
}