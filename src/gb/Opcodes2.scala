package gb

class Opcodes2(cpu : Cpu) {

  def execute(opcode : Int) = opcode match {
    
    case 0x06 => LD_nn_n(cpu.b)
	case 0x0E => LD_nn_n(cpu.c)
	case 0x16 => LD_nn_n(cpu.d)
	case 0x1E => LD_nn_n(cpu.e)
	case 0x26 => LD_nn_n(cpu.h)
	case 0x2E => LD_nn_n(cpu.l)
	
	case 0x7F => LD_r1_r(cpu.a, cpu.a)
	case 0x78 => LD_r1_r(cpu.a, cpu.b)
	case 0x79 => LD_r1_r(cpu.a, cpu.c)
	case 0x7A => LD_r1_r(cpu.a, cpu.d)
	case 0x7B => LD_r1_r(cpu.a, cpu.e)
	case 0x7C => LD_r1_r(cpu.a, cpu.h)
	case 0x7D => LD_r1_r(cpu.a, cpu.l)
	
	case 0x7E => LD_r1_r16read(cpu.a, cpu.h, cpu.l)
	
	case 0x40 => LD_r1_r(cpu.b, cpu.b)
	case 0x41 => LD_r1_r(cpu.b, cpu.c)
	case 0x42 => LD_r1_r(cpu.b, cpu.d)
	case 0x43 => LD_r1_r(cpu.b, cpu.e)
	case 0x44 => LD_r1_r(cpu.b, cpu.h)
	case 0x45 => LD_r1_r(cpu.b, cpu.l)
	
	case 0x46 => LD_r1_r16read(cpu.b, cpu.h, cpu.l)
	
	case 0x48 => LD_r1_r(cpu.c, cpu.b)
	case 0x49 => LD_r1_r(cpu.c, cpu.c)
	case 0x4A => LD_r1_r(cpu.c, cpu.d)
	case 0x4B => LD_r1_r(cpu.c, cpu.e)
	case 0x4C => LD_r1_r(cpu.c, cpu.h)
	case 0x4D => LD_r1_r(cpu.c, cpu.l)
	
	case 0x4E => LD_r1_r16read(cpu.c, cpu.h, cpu.l)
	
	case 0x50 => LD_r1_r(cpu.d, cpu.b)
	case 0x51 => LD_r1_r(cpu.d, cpu.c)
	case 0x52 => LD_r1_r(cpu.d, cpu.d)
	case 0x53 => LD_r1_r(cpu.d, cpu.e)
	case 0x54 => LD_r1_r(cpu.d, cpu.h)
	case 0x55 => LD_r1_r(cpu.d, cpu.l)
	
	case 0x56 => LD_r1_r16read(cpu.d, cpu.h, cpu.l)
	
	case 0x58 => LD_r1_r(cpu.e, cpu.b)
	case 0x59 => LD_r1_r(cpu.e, cpu.c)
	case 0x5A => LD_r1_r(cpu.e, cpu.d)
	case 0x5B => LD_r1_r(cpu.e, cpu.e)
	case 0x5C => LD_r1_r(cpu.e, cpu.h)
	case 0x5D => LD_r1_r(cpu.e, cpu.l)
	
	case 0x5E => LD_r1_r16read(cpu.e, cpu.h, cpu.l)
	
	case 0x60 => LD_r1_r(cpu.h, cpu.b)
	case 0x61 => LD_r1_r(cpu.h, cpu.c)
	case 0x62 => LD_r1_r(cpu.h, cpu.d)
	case 0x63 => LD_r1_r(cpu.h, cpu.e)
	case 0x64 => LD_r1_r(cpu.h, cpu.h)
	case 0x65 => LD_r1_r(cpu.h, cpu.l)
	
	case 0x66 => LD_r1_r16read(cpu.h, cpu.h, cpu.l)
	
	case 0x68 => LD_r1_r(cpu.l, cpu.b)
	case 0x69 => LD_r1_r(cpu.l, cpu.c)
	case 0x6A => LD_r1_r(cpu.l, cpu.d)
	case 0x6B => LD_r1_r(cpu.l, cpu.e)
	case 0x6C => LD_r1_r(cpu.l, cpu.h)
	case 0x6D => LD_r1_r(cpu.l, cpu.l)
	
	case 0x6E => LD_r1_r16read(cpu.l, cpu.h, cpu.l)
	
	case 0x70 => LD_r1_r16write(cpu.l, cpu.h, cpu.b)
	case 0x71 => LD_r1_r16write(cpu.l, cpu.h, cpu.c)
	case 0x72 => LD_r1_r16write(cpu.l, cpu.h, cpu.d)
	case 0x73 => LD_r1_r16write(cpu.l, cpu.h, cpu.e)
	case 0x74 => LD_r1_r16write(cpu.l, cpu.h, cpu.h)
	case 0x75 => LD_r1_r16write(cpu.l, cpu.h, cpu.l)
	case 0x36 => LDHLmn_write(cpu.h, cpu.l)
	
	case 0x0A => LD_r1_r16read(cpu.a, cpu.b, cpu.c)
	case 0x1A => LD_r1_r16read(cpu.a, cpu.d, cpu.e)
	case 0xFA => LD_r1_r16read(cpu.a, cpu.h, cpu.l)
	case 0x3E => LD_nn_n(cpu.a)
	
	case 0x47 => LD_r1_r(cpu.b, cpu.a)
	case 0x4F => LD_r1_r(cpu.c, cpu.a)
	case 0x57 => LD_r1_r(cpu.d, cpu.a)
	case 0x5F => LD_r1_r(cpu.e, cpu.a) 
	case 0x67 => LD_r1_r(cpu.h, cpu.a) 
	case 0x6F => LD_r1_r(cpu.l, cpu.a) 
	case 0x02 => LD_r1_r16write(cpu.c, cpu.b, cpu.a)
	case 0x12 => LD_r1_r16write(cpu.e, cpu.d, cpu.a)
	case 0x77 => LD_r1_r16write(cpu.l, cpu.h, cpu.a)
	case 0xEA => LD_n_A16Write(cpu.a)
	case 0xF2 => LD_A_C(cpu.a, cpu.c)
	
	case 0x3A => LDD_A_HLRead(cpu.a, cpu.h, cpu.l, "-")
	case 0x32 => LDD_HL_A(cpu.h, cpu.l, cpu.a,"-")
	case 0x2A => LDD_A_HLRead(cpu.a, cpu.h, cpu.l, "+")
	case 0x22 => LDD_HL_A(cpu.h, cpu.l, cpu.a, "+")
	
	case 0xE0 => LDH_n_A(cpu.pc, cpu.a)
	case 0xF0 => LDH_A_n(cpu.a, cpu.pc)
	case 0x01 => 1
	case 0x11 => 1
	case 0x21 => 1
	case 0x31 => 1
	
	
	
			
  }
  
  def LD_nn_n(register : Register) = {
    register.value = cpu.memory.readByte8(cpu.pc.value)
    cpu.pc.value += 1
  }
  
  def LD_r1_r(toRegister : Register, fromRegister : Register) = {
    toRegister.value = fromRegister.value
  }
  
  def LD_r1_r16read(toRegister : Register, fromRegister : Register, fromRegister2 : Register) = {
    toRegister.value = cpu.memory.readByte8((fromRegister.value << 8) + fromRegister2.value)
  }
  
  def LD_r1_r16write(fromRegister : Register, fromRegister2 : Register, valueRegister : Register) = {
	cpu.memory.writeByte8((fromRegister2.value << 8) + fromRegister.value, valueRegister.value)
  }
  
  def LDHLmn_write(fromRegister : Register, fromRegister2 : Register) = {
    cpu.memory.writeByte8((fromRegister.value << 8) + fromRegister2.value, cpu.memory.readByte8(cpu.pc.value))
    cpu.pc.value += 1
  }
  
  def LD_n_A16Write(valueRegister : Register) = {
      cpu.memory.writeByte8(cpu.memory.readByte16(cpu.pc.value), valueRegister.value)
  }
  
  def LDD_A_HLRead(toRegister : Register, fromRegister : Register, fromRegister2 : Register, op : String) = {
    toRegister.value = cpu.memory.readByte8((fromRegister.value << 8) + fromRegister2.value)
    op match {
      case "+" => fromRegister2.value = (fromRegister2.value + 1) & 255
      case "-" => fromRegister2.value = (fromRegister2.value + 1) & 255
    }
    if (fromRegister2.value == 255) fromRegister.value = (fromRegister.value - 1) & 255
  }
  
  def LDD_HL_A(toRegister : Register, toRegister2 : Register, fromRegister : Register, op : String) = {
    cpu.memory.writeByte8((toRegister.value << 8) + toRegister2.value, fromRegister.value)
    op match {
      case "+" => toRegister2.value = (toRegister2.value + 1) & 255
      case "-" => toRegister2.value = (toRegister2.value - 1) & 255
      
    }
    if (toRegister2 == 255) toRegister.value = (toRegister.value - 1) & 255
  }
  
  //Non-Generic opcode functions here:
  
  def LD_A_C(toRegister : Register, fromRegister : Register) = {
    toRegister.value = cpu.memory.readByte8(0xFF00 + fromRegister.value)
  }
  
  def LD_C_A(fromRegister : Register, valueRegister : Register) = {
    cpu.memory.writeByte8(0xFF00 + fromRegister.value, valueRegister.value)
  }
  
  def LDH_n_A(fromRegister : Register, valueRegister : Register) = {
    cpu.memory.writeByte8(0xFF00 + cpu.memory.readByte8(fromRegister.value), valueRegister.value)
    cpu.pc.value += 1
  }
  
  def LDH_A_n(toRegister : Register, fromRegister : Register) = {
    toRegister.value = cpu.memory.readByte8(0xFF00 + cpu.memory.readByte8(fromRegister.value))
    cpu.pc.value += 1
  }
  
}