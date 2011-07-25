package gb

class Opcodes() {

  def execute(opcode : Int, cpu : Cpu) = opcode match {
    
    case 0x00 => NOP_00(opcode, cpu)
    case 0xC3 => JP_NN_C3(opcode, cpu)
    case 0xAF => XOR_A_AF(opcode, cpu)
    case 0x21 => LD_NN_21(opcode, cpu)
    case 0x0E => LD_C_0E(opcode, cpu)
    //case _ => println("Opcode undefined")
  }
  
  //TODO
  def JP_NN_C3(opcode : Int, cpu : Cpu) = {
    cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc, cpu)
  }
  
  //TODO
  def LD_C_0E(opcode : Int, cpu : Cpu) = {
    cpu.registers.pc += 1
  }
  
  //TODO
  def LD_NN_21(opcode : Int, cpu : Cpu) = {
    cpu.registers.pc += 2
  }
  
  def NOP_00(opcode : Int, cpu : Cpu) = {
    cpu.registers.lastInstrClockm = 1
    cpu.registers.lastInstrClockt = 4
  }
  
  //TODO
   def XOR_A_AF(opcode : Int, cpu : Cpu) = {
    cpu.registers.lastInstrClockm = 1
    cpu.registers.lastInstrClockt = 4
  }
}