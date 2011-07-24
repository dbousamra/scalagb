package gb

class Cpu(romFilename : String) {
  
  var registers : Registers = new Registers()
  var memory : Memory = new Memory(romFilename)
  
  def reset() = {
    registers.resetRegisters()
  }
  
  def run() = {
    while (true) {
    val opcode = memory.readByte8(registers.pc + 1, this)
    //perform instruction
    //prevent overrun of memory - not sure if needed on GB. Might have to be ron size not 0xFFFF
    registers.pc &= 0xFFFF
    registers.clockM += registers.lastInstrClockm
    registers.clockT += registers.lastInstrClockt
    registers.pc += 1
    println(registers.pc)
    println(opcode)
    }
    
  }
  
}