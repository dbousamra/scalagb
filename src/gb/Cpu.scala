package gb
import Register._
class Cpu(romFilename : String, DEBUG_MODE : Boolean) {
  
  var clockT, clockM : Register = new Register
  var a : Register = new Register(name = "a")
  var b : Register = new Register(name = "b")
  var c : Register = new Register(name = "c")
  var d : Register = new Register(name = "d")
  var e : Register = new Register(name = "e")
  var h : Register = new Register(name = "h")
  var l : Register = new Register(name = "l")
  var f : Register = new Register(name = "f")
  var reserve_a, reserve_b, reserve_c : Register = new Register
  var reserve_d, reserve_e, reserve_h, reserve_l, reserve_f : Register = new Register
  var pc : Register = new Register(name = "pc")
  var sp : Register = new Register(name = "sp")
  var halt : Register = new Register(name = "halt")
  var interruptable = true
  var currentOpcode = 0
  
  var opcodes : Opcodes = new Opcodes(this)
  var gpu : Gpu = new Gpu(memory)
  var memory : Memory = new Memory(gpu, this, romFilename)
  
  var stackTrace = List[String]()
  
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
    
    currentOpcode = memory.readByte8(pc)
    
    
    if (DEBUG_MODE) {
      println(debugTraces(currentOpcode))
      stackTrace = debugTraces(currentOpcode) :: stackTrace
      
    }
    pc += 1
    opcodes.execute(currentOpcode)
    pc &= 0xFFFF //prevent overflow
    
    
    
  }


  def debugTraces(opcode : Int) = { 
    "PC = " + pc.getHexString + " Just executed=" + opcode.toHexString +
    " AF: " + a.getHexString + " " + f.getHexString +
    " BC: " + b.getHexString + " " + c.getHexString +
    " HL: " + (h ++ l).getHexString +
    " DE: " + d.getHexString + " " + e.getHexString + 
    " SP: " + sp.getHexString + " " +
    " PC: " + pc.getHexString
    
  }
  
}