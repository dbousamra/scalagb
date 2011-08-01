package gb

class Cpu(romFilename : String, DEBUG_MODE : Boolean) {
  
  var registers : Registers = new Registers
  var opcodes : Opcodes = new Opcodes(this)
  var gpu : Gpu = new Gpu(memory)
  var memory : Memory = new Memory(gpu, this, romFilename)
  
  
  def reset() = {
    registers.resetRegisters()
  }

  def run() = {
    val opcode = memory.readByte8(registers.pc)
    registers.pc += 1
    
    opcodes.execute(opcode)
    registers.pc &= 0xFFFF //prevent overflow
    if (DEBUG_MODE) {
      println(debugTraces2(opcode))
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
        " F=" + registers.f.toBinaryString +
        " F=" + registers.f.toHexString
  }	
  
  def debugTraces2(opcode : Int) = { 
    "PC = " + registers.pc.toHexString + " Just executed=" + opcode.toHexString +
    " AF: " + registers.a.toHexString + "" + registers.f.toHexString +
    " BC: " + registers.b.toHexString + "" + registers.c.toHexString +
    " HL: " + registers.h.toHexString + "" + registers.l.toHexString +
    " DE: " + registers.d.toHexString + "" + registers.e.toHexString + 
    " SP: " + registers.sp.toHexString + "" +
    " PC: " + registers.pc.toHexString
    
  }
  
}