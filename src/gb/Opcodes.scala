package gb

class Opcodes() {

  def execute(opcode : Int, cpu : Cpu) = opcode match {
    
    case 0x00 => NOP_00(opcode, cpu)
    case 0xC3 => JP_nn_C3(opcode, cpu)
    case 0xAF => XOR_A_AF(opcode, cpu)
    //case _ => println("Opcode undefined")
    
  }
  
  def JP_nn_C3(opcode : Int, cpu : Cpu) = {
    cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc, cpu)
    println("Executed: JP_nn_C3")
  }
  
  def NOP_00(opcode : Int, cpu : Cpu) = {
    cpu.registers.lastInstrClockm = 1
    cpu.registers.lastInstrClockt = 4
    println("Executed: NOP_00")
  }
  
   def XOR_A_AF(opcode : Int, cpu : Cpu) = {
    cpu.registers.lastInstrClockm = 1
    cpu.registers.lastInstrClockt = 4
    println("Executed: XOR_A")
  }
}