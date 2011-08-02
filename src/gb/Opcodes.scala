package gb
import Register._

class Opcodes(cpu: Cpu) {
  import cpu._
  trait Op { val offset: Int }
  case object |-| extends Op { override val offset = -1 }
  case object |+| extends Op { override val offset = 1 }

  def execute(opcode: Int) = {

    opcode match {

      case 0x06 => LD_nn_n(b)
      case 0x0E => LD_nn_n(c)
      case 0x16 => LD_nn_n(d)
      case 0x1E => LD_nn_n(e)
      case 0x26 => LD_nn_n(h)
      case 0x2E => LD_nn_n(l)

      case 0x7F => LD_r1_r(a, a)
      case 0x78 => LD_r1_r(a, b)
      case 0x79 => LD_r1_r(a, c)
      case 0x7A => LD_r1_r(a, d)
      case 0x7B => LD_r1_r(a, e)
      case 0x7C => LD_r1_r(a, h)
      case 0x7D => LD_r1_r(a, l)

      case 0x7E => LD_r1_r16read(a, h, l)

      case 0x40 => LD_r1_r(b, b)
      case 0x41 => LD_r1_r(b, c)
      case 0x42 => LD_r1_r(b, d)
      case 0x43 => LD_r1_r(b, e)
      case 0x44 => LD_r1_r(b, h)
      case 0x45 => LD_r1_r(b, l)

      case 0x46 => LD_r1_r16read(b, h, l)

      case 0x48 => LD_r1_r(c, b)
      case 0x49 => LD_r1_r(c, c)
      case 0x4A => LD_r1_r(c, d)
      case 0x4B => LD_r1_r(c, e)
      case 0x4C => LD_r1_r(c, h)
      case 0x4D => LD_r1_r(c, l)

      case 0x4E => LD_r1_r16read(c, h, l)

      case 0x50 => LD_r1_r(d, b)
      case 0x51 => LD_r1_r(d, c)
      case 0x52 => LD_r1_r(d, d)
      case 0x53 => LD_r1_r(d, e)
      case 0x54 => LD_r1_r(d, h)
      case 0x55 => LD_r1_r(d, l)

      case 0x56 => LD_r1_r16read(d, h, l)

      case 0x58 => LD_r1_r(e, b)
      case 0x59 => LD_r1_r(e, c)
      case 0x5A => LD_r1_r(e, d)
      case 0x5B => LD_r1_r(e, e)
      case 0x5C => LD_r1_r(e, h)
      case 0x5D => LD_r1_r(e, l)

      case 0x5E => LD_r1_r16read(e, h, l)

      case 0x60 => LD_r1_r(h, b)
      case 0x61 => LD_r1_r(h, c)
      case 0x62 => LD_r1_r(h, d)
      case 0x63 => LD_r1_r(h, e)
      case 0x64 => LD_r1_r(h, h)
      case 0x65 => LD_r1_r(h, l)

      case 0x66 => LD_r1_r16read(h, h, l)

      case 0x68 => LD_r1_r(l, b)
      case 0x69 => LD_r1_r(l, c)
      case 0x6A => LD_r1_r(l, d)
      case 0x6B => LD_r1_r(l, e)
      case 0x6C => LD_r1_r(l, h)
      case 0x6D => LD_r1_r(l, l)

      case 0x6E => LD_r1_r16read(l, h, l)

      case 0x70 => LD_r1_r16write(l, h, b)
      case 0x71 => LD_r1_r16write(l, h, c)
      case 0x72 => LD_r1_r16write(l, h, d)
      case 0x73 => LD_r1_r16write(l, h, e)
      case 0x74 => LD_r1_r16write(l, h, h)
      case 0x75 => LD_r1_r16write(l, h, l)
      case 0x36 => LDHLmn_write(h, l)

      case 0x0A => LD_r1_r16read(a, b, c)
      case 0x1A => LD_r1_r16read(a, d, e)
      case 0xFA => LD_r1_r16read(a, h, l)
      case 0x3E => LD_nn_n(a)

      case 0x47 => LD_r1_r(b, a)
      case 0x4F => LD_r1_r(c, a)
      case 0x57 => LD_r1_r(d, a)
      case 0x5F => LD_r1_r(e, a)
      case 0x67 => LD_r1_r(h, a)
      case 0x6F => LD_r1_r(l, a)
      case 0x02 => LD_r1_r16write(c, b, a)
      case 0x12 => LD_r1_r16write(e, d, a)
      case 0x77 => LD_r1_r16write(l, h, a)
      case 0xEA => LD_n_A16Write(pc, a)
      case 0xF2 => LD_A_C(a, c)

      case 0x3A => LDD_A_HLRead(a, h, l, -1)
      case 0x32 => LDD_HL_A(h, l, a, |-|)
      case 0x2A => LDD_A_HLRead(a, h, l, +1)
      case 0x22 => LDD_HL_A(h, l, a, |+|)

      case 0xE0 => LDH_n_A(pc, a)
      case 0xF0 => LDH_A_n(a, pc)

      case 0x01 => LD_n_n(c, b, pc)
      case 0x11 => LD_n_n(e, d, pc)
      case 0x21 => LD_n_n(l, h, pc)
      case 0x31 => LD_n_nSP(sp, pc)

      case 0xF9 => LD_SP_HL(h, l, sp) //TODO: No implemented
      case 0x08 => LD_n_A16Write(pc, sp) //TODO: Possibly incorrect.

      case 0xF5 => PUSH_nn(sp, a, f)
      case 0xC5 => PUSH_nn(sp, b, c)
      case 0xD5 => PUSH_nn(sp, d, e)
      case 0xE5 => PUSH_nn(sp, h, l)

      case 0xF1 => POP_nn(sp, f, a)
      case 0xC1 => POP_nn(sp, c, b)
      case 0xD1 => POP_nn(sp, e, d)
      case 0xE1 => POP_nn(sp, l, h)

      case 0x87 => ADD_A_n(a, a)
      case 0x80 => ADD_A_n(b, a)
      case 0x81 => ADD_A_n(c, a)
      case 0x82 => ADD_A_n(d, a)
      case 0x83 => ADD_A_n(e, a)
      case 0x84 => ADD_A_n(h, a)
      case 0x85 => ADD_A_n(l, a)
      case 0x86 => ADD_A_n16Read(h, l, a)
      case 0xC6 => ADD_A_n16ReadN(pc, a)

      case 0x8F => ADC_A_nA(a, a)
      case 0x88 => ADC_A_n(a, b)
      case 0x89 => ADC_A_n(a, c)
      case 0x8A => ADC_A_n(a, d)
      case 0x8B => ADC_A_n(a, e)
      case 0x8C => ADC_A_n(a, h)
      case 0x8D => ADC_A_n(a, l)
      case 0x8E => ADC_A_n16(a, h, l)
      case 0xCE => ADC_A_n16PC(pc, a)

      case 0x97 => SUB_n(a, a)
      case 0x90 => SUB_n(b, a)
      case 0x91 => SUB_n(c, a)
      case 0x92 => SUB_n(d, a)
      case 0x93 => SUB_n(e, a)
      case 0x94 => SUB_n(h, a)
      case 0x95 => SUB_n(l, a)
      case 0x96 => SUB_n16(h, l, a)
      case 0xD6 => SUB_n16PC(pc, a)

      case 0x9F => SBC_A_n_a(a) //TODO: May not work
      case 0x98 => SBC_A_n(b, a)
      case 0x99 => SBC_A_n(c, a)
      case 0x9A => SBC_A_n(d, a)
      case 0x9B => SBC_A_n(e, a)
      case 0x9C => SBC_A_n(h, a)
      case 0x9D => SBC_A_n(l, a)
      case 0x9E => SBC_A_n16(h, l, a)

      case 0xA7 => 1
      case 0xA0 => AND_n(a, b)
      case 0xA1 => AND_n(a, c)
      case 0xA2 => AND_n(a, d)
      case 0xA3 => AND_n(a, e)
      case 0xA4 => AND_n(a, h)
      case 0xA5 => AND_n(a, l)
      case 0xA6 => AND_n16(a, h, l)
      case 0xE6 => AND_n8(a, pc)

      case 0xB7 => OR_n(a, a)
      case 0xB0 => OR_n(a, b)
      case 0xB1 => OR_n(a, c)
      case 0xB2 => OR_n(a, d)
      case 0xB3 => OR_n(a, e)
      case 0xB4 => OR_n(a, h)
      case 0xB5 => OR_n(a, l)
      case 0xB6 => OR_n16(a, h, l)
      case 0xF6 => OR_n8(a, pc)

      case 0xAF => XOR_n(a, a)
      case 0xA8 => XOR_n(b, a)
      case 0xA9 => XOR_n(c, a)
      case 0xAA => XOR_n(d, a)
      case 0xAB => XOR_n(e, a)
      case 0xAC => XOR_n(h, a)
      case 0xAD => XOR_n(l, a)
      case 0xAE => XOR_n16(a, h, l)
      case 0xEE => XOR_n8(a, pc)

      case 0xBF => CP_n(a, a)
      case 0xB8 => CP_n(b, a)
      case 0xB9 => CP_n(c, a)
      case 0xBA => CP_n(d, a)
      case 0xBB => CP_n(e, a)
      case 0xBC => CP_n(h, a)
      case 0xBD => CP_n(l, a)
      case 0xBE => CP_n16(a, h, l)
      case 0xFE => CP_n8(a, pc)
      
      case 0x3C => INC_n(a)
      case 0x04 => INC_n(b)
      case 0x0C => INC_n(c)
      case 0x14 => INC_n(d)
      case 0x1C => INC_n(e)
      case 0x24 => INC_n(h)
      case 0x2C => INC_n(l)
      case 0x34 => INC_n16(h, l)
      

    }
  }

  def LD_nn_n(register: Register) = {
    register := memory.readByte8(pc)
    pc += 1
  }

  def LD_r1_r(toRegister: Register, fromRegister: Register) = {
    toRegister := fromRegister
  }

  def LD_r1_r16read(toRegister: Register, fromRegister: Register, fromRegister2: Register) = {
    toRegister := memory.readByte8((fromRegister << 8) + fromRegister2)
  }

  def LD_r1_r16write(fromRegister: Register, fromRegister2: Register, valueRegister: Register) = {
    memory.writeByte8((fromRegister2 << 8) + fromRegister, valueRegister)
  }

  def LDHLmn_write(fromRegister: Register, fromRegister2: Register) = {
    memory.writeByte8((fromRegister << 8) + fromRegister2, memory.readByte8(pc))
    pc += 1
  }

  def LD_n_A16Write(fromRegister: Register, valueRegister: Register) = {
    memory.writeByte8(memory.readByte16(pc), valueRegister)
    pc += 2
  }

  def LDD_A_HLRead(toRegister: Register, fromRegister: Register, fromRegister2: Register, op: Int) = {
    toRegister := memory.readByte8((fromRegister << 8) + fromRegister2)
    fromRegister2 := (fromRegister2 + op) & 255
    if (fromRegister2 == 255) fromRegister := (fromRegister - 1) & 255
  }

  def LDD_HL_A(toRegister: Register, toRegister2: Register, fromRegister: Register, op: Op) = {
    memory.writeByte8((toRegister << 8) + toRegister2, fromRegister)
    toRegister2 := (toRegister2 + op.offset) & 255
    if (toRegister2 == 255) toRegister := (toRegister - 1) & 255
  }

  def LD_n_n(toRegister: Register, toRegister2: Register, fromRegister: Register) = {
    toRegister := memory.readByte8(fromRegister)
    toRegister2 := memory.readByte8(fromRegister + 1)
    pc += 2
  }

  def LD_SP_HL(fromRegister: Register, fromRegister2: Register, toRegister: Register) = {
    //TODO - not sure how to concatenate H and L into one
  }

  def PUSH_nn(fromRegister: Register, toRegister: Register, toRegister2: Register) = {
    fromRegister -= 1
    memory.writeByte8(fromRegister, toRegister)
    fromRegister -= 1
    memory.writeByte8(fromRegister, toRegister2)
  }

  def POP_nn(fromRegister: Register, toRegister: Register, toRegister2: Register) = {
    toRegister := memory.readByte8(fromRegister)
    fromRegister += 1
    toRegister2 := memory.readByte8(fromRegister)
    fromRegister += 1
  }

  def ADD_A_n(fromRegister: Register, toRegister: Register) = {
    var sum = toRegister + fromRegister
    f.setHalfCarryFlag((sum & 0xF) < (toRegister & 0xF))
    f.setCarryFlag(sum > 0xFF)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(false)

  }

  def ADD_A_n16Read(fromRegister: Register, fromRegister2: Register, toRegister: Register) = {
    var sum = toRegister + memory.readByte8(((fromRegister << 8) + fromRegister2))
    f.setHalfCarryFlag((sum & 0xF) < (toRegister & 0xF))
    f.setCarryFlag(sum > 0xFF)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(false)
  }

  def ADD_A_n16ReadN(fromRegister: Register, toRegister: Register) = {
    var sum = toRegister + memory.readByte8(fromRegister)
    f.setHalfCarryFlag((sum & 0xF) < (toRegister & 0xF))
    f.setCarryFlag(sum > 0xFF)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(false)
    pc += 1
  }

  def ADC_A_n(fromRegister: Register, toRegister: Register) = {
    var sum = toRegister + fromRegister + f.getCarryFlag()
    f.setHalfCarryFlag(((toRegister & 0xF) + (fromRegister & 0xF) + f.getCarryFlag) > 0xF)
    f.setCarryFlag(sum > 0xFF)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(false)
  }

  def ADC_A_nA(fromRegister: Register, toRegister: Register) = {
    var sum = toRegister + fromRegister + f.getCarryFlag()
    f.setHalfCarryFlag((sum & 0xF) < (toRegister & 0xF))
    f.setCarryFlag(sum > 0xFF)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(false)
  }

  def ADC_A_n16(fromRegister: Register, fromRegister2: Register, toRegister: Register) = {
    var temp = memory.readByte8(((fromRegister << 8) + fromRegister2))
    var sum = toRegister + temp + fromRegister.getCarryFlag()
    f.setHalfCarryFlag((sum & 0xF) < (toRegister & 0xF))
    f.setCarryFlag(sum > 0xFF)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(false)
  }

  def ADC_A_n16PC(fromRegister: Register, toRegister: Register) = {
    var temp = memory.readByte8(fromRegister)
    var sum = toRegister + fromRegister + f.getCarryFlag()
    f.setHalfCarryFlag(((toRegister & 0xF) + (fromRegister & 0xF) + f.getCarryFlag) > 0xF)
    f.setCarryFlag(sum > 0xFF)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(false)
    pc += 1
  }

  def SUB_n(fromRegister: Register, toRegister: Register) = {
    var sum = toRegister - fromRegister;
    f.setHalfCarryFlag((toRegister & 0xF) < (fromRegister & 0xF))
    f.setCarryFlag(sum < 0x00)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(true)
  }

  def SUB_n16(fromRegister: Register, fromRegister2: Register, toRegister: Register) = {
    var temp = memory.readByte8(((fromRegister << 8) + fromRegister2))
    var sum = toRegister - temp;
    f.setHalfCarryFlag((toRegister & 0xF) < (temp & 0xF))
    f.setCarryFlag(sum < 0x00)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(true)
  }

  def SUB_n16PC(fromRegister: Register, toRegister: Register) = {
    var temp = memory.readByte8(fromRegister)
    var sum = toRegister - temp;
    f.setHalfCarryFlag((toRegister & 0xF) < (temp & 0xF))
    f.setCarryFlag(sum < 0x00)
    toRegister := sum & 0xFF
    pc += 1
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(true)
  }

  def SBC_A_n(fromRegister: Register, toRegister: Register) = {
    var sum = toRegister - fromRegister - f.getCarryFlag()
    f.setHalfCarryFlag(((toRegister & 0xF) - (fromRegister & 0xF) - f.getCarryFlag) < 0)
    f.setCarryFlag(sum < 0x00)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(true)
  }

  def SBC_A_n16(fromRegister: Register, fromRegister2: Register, toRegister: Register) = {
    var temp = memory.readByte8(((fromRegister << 8) + fromRegister2))
    var sum = toRegister - temp - f.getCarryFlag
    f.setHalfCarryFlag(((toRegister & 0xF) - (temp & 0xF) - f.getCarryFlag) < 0)
    f.setCarryFlag(sum < 0x00)
    toRegister := sum & 0xFF
    f.setZeroFlag(toRegister == 0)
    f.setSubFlag(true)
  }

  def SBC_A_n_a(toRegister: Register) = {
    if (f.getCarryFlag) {
      f.setZeroFlag(false)
      f.setSubFlag(true)
      f.setHalfCarryFlag(true)
      f.setCarryFlag(true)
    } else {
      f.setZeroFlag(true)
      f.setSubFlag(true)
      f.setHalfCarryFlag(false)
      f.setCarryFlag(false)
      toRegister := 0
    }
  }

  def AND_n(toRegister: Register, fromRegister: Register) = {
    toRegister &= fromRegister;
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag(true)
    f.setCarryFlag(false)
    f.setSubFlag(false)
  }

  def AND_n16(toRegister: Register, fromRegister: Register, fromRegister2: Register) = {
    toRegister &= memory.readByte8((fromRegister << 8) + fromRegister2)
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag(true)
    f.setCarryFlag(false)
    f.setSubFlag(false)
  }

  //TODO COMBINE ANDS AND ORS HERE BY PASSING IN OPERATOR
  def AND_n8(toRegister: Register, fromRegister: Register) = {
    toRegister &= memory.readByte8(fromRegister)
    pc += 1
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag(true)
    f.setCarryFlag(false)
    f.setSubFlag(false)
  }

  def OR_n(toRegister: Register, fromRegister: Register) = {
    toRegister |= fromRegister
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag(false)
    f.setCarryFlag(false)
    f.setSubFlag(false)
  }

  def OR_n16(toRegister: Register, fromRegister: Register, fromRegister2: Register) = {
    toRegister |= memory.readByte8((fromRegister << 8) + fromRegister2)
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag(false)
    f.setCarryFlag(false)
    f.setSubFlag(false)
  }

  def OR_n8(toRegister: Register, fromRegister: Register) = {
    toRegister |= memory.readByte8(fromRegister)
    pc += 1
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag(false)
    f.setCarryFlag(false)
    f.setSubFlag(false)
  }

  def XOR_n(toRegister: Register, fromRegister: Register) = {
    toRegister ^= fromRegister
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag(false)
    f.setCarryFlag(false)
    f.setSubFlag(false)
  }

  def XOR_n16(toRegister: Register, fromRegister: Register, fromRegister2: Register) = {
    toRegister ^= memory.readByte8((fromRegister << 8) + fromRegister2)
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag(false)
    f.setCarryFlag(false)
    f.setSubFlag(false)
  }

  def XOR_n8(toRegister: Register, fromRegister: Register) = {
    toRegister ^= memory.readByte8(fromRegister)
    pc += 1
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag(false)
    f.setCarryFlag(false)
    f.setSubFlag(false)
  }

  def CP_n(register2: Register, register1: Register) = {
    val sum = register1 - register2;
    f.setHalfCarryFlag((sum & 0xF) > (register1 & 0xF))
    f.setCarryFlag(sum < 0)
    f.setZeroFlag(sum == 0)
    f.setSubFlag(true)
  }

  def CP_n16(fromRegister: Register, fromRegister2: Register, register1: Register) = {
    val sum = register1 - memory.readByte8((fromRegister << 8) + fromRegister2)
    f.setHalfCarryFlag((sum & 0xF) > (register1 & 0xF))
    f.setCarryFlag(sum < 0)
    f.setZeroFlag(sum == 0)
    f.setSubFlag(true)
  }

  def CP_n8(register2: Register, register1: Register) = {
    val sum = register1 - memory.readByte8(register2)
    f.setHalfCarryFlag((sum & 0xF) > (register1 & 0xF))
    f.setCarryFlag(sum < 0)
    f.setZeroFlag(sum == 0)
    pc += 1
    f.setSubFlag(true)
  }
  
  def INC_n(toRegister : Register) = {
    toRegister += 1
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag((toRegister & 0xF) == 0)
    f.setSubFlag(false)
  }
  
  def INC_n16(fromRegister : Register, fromRegister2 : Register) = {
    val i = memory.readByte8((fromRegister << 8) + fromRegister2)
    cpu.memory.writeByte8((fromRegister << 8) + fromRegister2, i)
    f.setZeroFlag(i == 0)
    f.setHalfCarryFlag((i & 0xF) == 0)
    f.setSubFlag(false) 
  }

  //Non-Generic opcode functions here:

  def LD_A_C(toRegister: Register, fromRegister: Register) = {
    toRegister := memory.readByte8(fromRegister + 0xFF00)
  }

  def LD_C_A(fromRegister: Register, valueRegister: Register) = {
    memory.writeByte8(fromRegister + 0xFF00, valueRegister)
  }

  def LDH_n_A(fromRegister: Register, valueRegister: Register) = {
    memory.writeByte8(0xFF00 + memory.readByte8(fromRegister), valueRegister)
    pc += 1
  }

  def LDH_A_n(toRegister: Register, fromRegister: Register) = {
    toRegister := memory.readByte8(0xFF00 + memory.readByte8(fromRegister))
    pc += 1
  }

  def LD_n_nSP(toRegister: Register, fromRegister: Register) = {
    toRegister := memory.readByte16(fromRegister)
    pc += 2
  }

}