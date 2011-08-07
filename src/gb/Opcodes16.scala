package gb
import Register._

class Opcodes16(cpu: Cpu) {

  import cpu._

  def cb(opcode: Int) = opcode match {
    case 0x0 => RLC_n(b)
    case 0x1 => RLC_n(c)
    case 0x2 => RLC_n(d)
    case 0x3 => RLC_n(e)
    case 0x4 => RLC_n(h)
    case 0x5 => RLC_n(l)
    case 0x6 => RLC_n16(h ++ l) //not sure if i can use RLC_n or if I need my 16 bit method
    case 0x7 => RLC_n(a)
    case 0x8 => RRC_n(b)
    case 0x9 => RRC_n(c)
    case 0xa => RRC_n(d)
    case 0xb => RRC_n(e)
    case 0xc => RRC_n(h)
    case 0xd => RRC_n(l)
    case 0xe => RRC_n16(h ++ l) //not sure if i can use RRC_n or if I need my 16 bit method
    case 0xf => RRC_n(a)
    case 0x10 => RL_n(b)
    case 0x11 => RL_n(c)
    case 0x12 => RL_n(d)
    case 0x13 => RL_n(e)
    case 0x14 => RL_n(h)
    case 0x15 => RL_n(l)
    case 0x16 => RL_n16(h ++ l) //not sure if i can use RL_n or if I need my 16 bit method
    case 0x17 => RL_n(a)
    case 0x18 => RRn(b)
    case 0x19 => RRn(c)
    case 0x1a => RRn(d)
    case 0x1b => RRn(e)
    case 0x1c => RRn(h)
    case 0x1d => RRn(l)
    case 0x1e => RRn16(h ++ l) //not sure if i can use RRn or if I need my 16 bit method
    case 0x1f => RRn(a)
    case 0x20 => SLA_n(b)
    case 0x21 => SLA_n(c)
    case 0x22 => SLA_n(d)
    case 0x23 => SLA_n(e)
    case 0x24 => SLA_n(h)
    case 0x25 => SLA_n(l)
    case 0x26 => SLA_n16(h ++ l)
    case 0x27 => SLA_n(a)
    case 0x28 => SRA_n(b)
    case 0x29 => SRA_n(c)
    case 0x2a => SRA_n(d)
    case 0x2b => SRA_n(e)
    case 0x2c => SRA_n(h)
    case 0x2d => SRA_n(l)
    case 0x2e => SRA_n16(h ++ l)
    case 0x2f => SRA_n(a)
    case 0x30 => SWAP_n(b)
    case 0x31 => SWAP_n(c)
    case 0x32 => SWAP_n(d)
    case 0x33 => SWAP_n(e)
    case 0x34 => SWAP_n(h)
    case 0x35 => SWAP_n(l)
    case 0x36 => SWAP_n16(h ++ l)
    case 0x37 => SWAP_n(a)
    case 0x38 => SRL_n(b)
    case 0x39 => SRL_n(c)
    case 0x3a => SRL_n(d)
    case 0x3b => SRL_n(e)
    case 0x3c => SRL_n(h)
    case 0x3d => SRL_n(l)
    case 0x3e => SRL_n16(h ++ l)
    case 0x3f => SRL_n(a)
    case 0x40 => BIT_b_r(b, 0x01)
    case 0x41 => BIT_b_r(c, 0x01)
    case 0x42 => BIT_b_r(d, 0x01)
    case 0x43 => BIT_b_r(e, 0x01)
    case 0x44 => BIT_b_r(h, 0x01)
    case 0x45 => BIT_b_r(l, 0x01)
    case 0x46 => BIT_b_r16(h ++ l, 0x01)
    case 0x47 => BIT_b_r(a, 0x01)

    case 0x48 => BIT_b_r(b, 0x02)
    case 0x49 => BIT_b_r(c, 0x02)
    case 0x4a => BIT_b_r(d, 0x02)
    case 0x4b => BIT_b_r(e, 0x02)
    case 0x4c => BIT_b_r(h, 0x02)
    case 0x4d => BIT_b_r(l, 0x02)
    case 0x4e => BIT_b_r16(h ++ l, 0x02)
    case 0x4f => BIT_b_r(a, 0x02)

    case 0x50 => BIT_b_r(b, 0x04)
    case 0x51 => BIT_b_r(c, 0x04)
    case 0x52 => BIT_b_r(d, 0x04)
    case 0x53 => BIT_b_r(e, 0x04)
    case 0x54 => BIT_b_r(h, 0x04)
    case 0x55 => BIT_b_r(l, 0x04)
    case 0x56 => BIT_b_r16(h ++ l, 0x04)
    case 0x57 => BIT_b_r(a, 0x04)

    case 0x58 => BIT_b_r(b, 0x08)
    case 0x59 => BIT_b_r(c, 0x08)
    case 0x5a => BIT_b_r(d, 0x08)
    case 0x5b => BIT_b_r(e, 0x08)
    case 0x5c => BIT_b_r(h, 0x08)
    case 0x5d => BIT_b_r(l, 0x08)
    case 0x5e => BIT_b_r16(h ++ l, 0x08)
    case 0x5f => BIT_b_r(a, 0x08)

    case 0x60 => BIT_b_r(b, 0x10)
    case 0x61 => BIT_b_r(c, 0x10)
    case 0x62 => BIT_b_r(d, 0x10)
    case 0x63 => BIT_b_r(e, 0x10)
    case 0x64 => BIT_b_r(h, 0x10)
    case 0x65 => BIT_b_r(l, 0x10)
    case 0x66 => BIT_b_r16(h ++ l, 0x10)
    case 0x67 => BIT_b_r(a, 0x10)

    case 0x68 => BIT_b_r(b, 0x20)
    case 0x69 => BIT_b_r(c, 0x20)
    case 0x6a => BIT_b_r(d, 0x20)
    case 0x6b => BIT_b_r(e, 0x20)
    case 0x6c => BIT_b_r(h, 0x20)
    case 0x6d => BIT_b_r(l, 0x20)
    case 0x6e => BIT_b_r16(h ++ l, 0x20)
    case 0x6f => BIT_b_r(a, 0x20)

    case 0x70 => BIT_b_r(b, 0x40)
    case 0x71 => BIT_b_r(c, 0x40)
    case 0x72 => BIT_b_r(d, 0x40)
    case 0x73 => BIT_b_r(e, 0x40)
    case 0x74 => BIT_b_r(h, 0x40)
    case 0x75 => BIT_b_r(l, 0x40)
    case 0x76 => BIT_b_r16(h ++ l, 0x40)
    case 0x77 => BIT_b_r(a, 0x40)

    case 0x78 => BIT_b_r(b, 0x80)
    case 0x79 => BIT_b_r(c, 0x80)
    case 0x7a => BIT_b_r(d, 0x80)
    case 0x7b => BIT_b_r(e, 0x80)
    case 0x7c => BIT_b_r(h, 0x80)
    case 0x7d => BIT_b_r(l, 0x80)
    case 0x7e => BIT_b_r16(h ++ l, 0x80)
    case 0x7f => BIT_b_r(a, 0x80)

    case 0x80 => RES_b_r(b, 0xFE)
    case 0x81 => RES_b_r(c, 0xFE)
    case 0x82 => RES_b_r(d, 0xFE)
    case 0x83 => RES_b_r(e, 0xFE)
    case 0x84 => RES_b_r(h, 0xFE)
    case 0x85 => RES_b_r(l, 0xFE)
    case 0x86 => RES_b_r16(h ++ l, 0xFE)
    case 0x87 => RES_b_r(a, 0xFE)

    case 0x88 => RES_b_r(b, 0xFD)
    case 0x89 => RES_b_r(c, 0xFD)
    case 0x8a => RES_b_r(d, 0xFD)
    case 0x8b => RES_b_r(e, 0xFD)
    case 0x8c => RES_b_r(h, 0xFD)
    case 0x8d => RES_b_r(l, 0xFD)
    case 0x8e => RES_b_r16(h ++ l, 0xFD)
    case 0x8f => RES_b_r(a, 0xFD)

    case 0x90 => RES_b_r(b, 0xFB)
    case 0x91 => RES_b_r(c, 0xFB)
    case 0x92 => RES_b_r(d, 0xFB)
    case 0x93 => RES_b_r(e, 0xFB)
    case 0x94 => RES_b_r(h, 0xFB)
    case 0x95 => RES_b_r(l, 0xFB)
    case 0x96 => RES_b_r16(h ++ l, 0xFB)
    case 0x97 => RES_b_r(a, 0xFB)

    case 0x98 => RES_b_r(b, 0xF7)
    case 0x99 => RES_b_r(c, 0xF7)
    case 0x9a => RES_b_r(d, 0xF7)
    case 0x9b => RES_b_r(e, 0xF7)
    case 0x9c => RES_b_r(h, 0xF7)
    case 0x9d => RES_b_r(l, 0xF7)
    case 0x9e => RES_b_r16(h ++ l, 0xF7)
    case 0x9f => RES_b_r(a, 0xF7)

    case 0xa0 => RES_b_r(b, 0xEF)
    case 0xa1 => RES_b_r(c, 0xEF)
    case 0xa2 => RES_b_r(d, 0xEF)
    case 0xa3 => RES_b_r(e, 0xEF)
    case 0xa4 => RES_b_r(h, 0xEF)
    case 0xa5 => RES_b_r(l, 0xEF)
    case 0xa6 => RES_b_r16(h ++ l, 0xEF)
    case 0xa7 => RES_b_r(a, 0xEF)

    case 0xa8 => RES_b_r(b, 0xDF)
    case 0xa9 => RES_b_r(c, 0xDF)
    case 0xaa => RES_b_r(d, 0xDF)
    case 0xab => RES_b_r(e, 0xDF)
    case 0xac => RES_b_r(h, 0xDF)
    case 0xad => RES_b_r(l, 0xDF)
    case 0xae => RES_b_r16(h ++ l, 0xDF)
    case 0xaf => RES_b_r(a, 0xDF)

    case 0xb0 => RES_b_r(b, 0xBF)
    case 0xb1 => RES_b_r(c, 0xBF)
    case 0xb2 => RES_b_r(d, 0xBF)
    case 0xb3 => RES_b_r(e, 0xBF)
    case 0xb4 => RES_b_r(h, 0xBF)
    case 0xb5 => RES_b_r(l, 0xBF)
    case 0xb6 => RES_b_r16(h ++ l, 0xBF)
    case 0xb7 => RES_b_r(a, 0xBF)

    case 0xb8 => RES_b_r(b, 0x7F)
    case 0xb9 => RES_b_r(c, 0x7F)
    case 0xba => RES_b_r(d, 0x7F)
    case 0xbb => RES_b_r(e, 0x7F)
    case 0xbc => RES_b_r(h, 0x7F)
    case 0xbd => RES_b_r(l, 0x7F)
    case 0xbe => RES_b_r16(h ++ l, 0x7F)
    case 0xbf => RES_b_r(a, 0x7F)

    case 0xc0 => SET_b_r(b, 0x01)
    case 0xc1 => SET_b_r(c, 0x01)
    case 0xc2 => SET_b_r(d, 0x01)
    case 0xc3 => SET_b_r(e, 0x01)
    case 0xc4 => SET_b_r(h, 0x01)
    case 0xc5 => SET_b_r(l, 0x01)
    case 0xc6 => SET_b_r16(h ++ l, 0x01)
    case 0xc7 => SET_b_r(a, 0x01)

    case 0xc8 => SET_b_r(b, 0x02)
    case 0xc9 => SET_b_r(c, 0x02)
    case 0xca => SET_b_r(d, 0x02)
    case 0xcb => SET_b_r(e, 0x02)
    case 0xcc => SET_b_r(h, 0x02)
    case 0xcd => SET_b_r(l, 0x02)
    case 0xce => SET_b_r16(h ++ l, 0x02)
    case 0xcf => SET_b_r(a, 0x02)

    case 0xd0 => SET_b_r(b, 0x04)
    case 0xd1 => SET_b_r(c, 0x04)
    case 0xd2 => SET_b_r(d, 0x04)
    case 0xd3 => SET_b_r(e, 0x04)
    case 0xd4 => SET_b_r(h, 0x04)
    case 0xd5 => SET_b_r(l, 0x04)
    case 0xd6 => SET_b_r16(h ++ l, 0x04)
    case 0xd7 => SET_b_r(a, 0x04)

    case 0xd8 => SET_b_r(b, 0x08)
    case 0xd9 => SET_b_r(c, 0x08)
    case 0xda => SET_b_r(d, 0x08)
    case 0xdb => SET_b_r(e, 0x08)
    case 0xdc => SET_b_r(h, 0x08)
    case 0xdd => SET_b_r(l, 0x08)
    case 0xde => SET_b_r16(h ++ l, 0x08)
    case 0xdf => SET_b_r(a, 0x08)

    case 0xe0 => SET_b_r(b, 0x10)
    case 0xe1 => SET_b_r(c, 0x10)
    case 0xe2 => SET_b_r(d, 0x10)
    case 0xe3 => SET_b_r(e, 0x10)
    case 0xe4 => SET_b_r(h, 0x10)
    case 0xe5 => SET_b_r(l, 0x10)
    case 0xe6 => SET_b_r16(h ++ l, 0x10)
    case 0xe7 => SET_b_r(a, 0x10)

    case 0xe8 => SET_b_r(b, 0x20)
    case 0xe9 => SET_b_r(c, 0x20)
    case 0xea => SET_b_r(d, 0x20)
    case 0xeb => SET_b_r(e, 0x20)
    case 0xec => SET_b_r(h, 0x20)
    case 0xed => SET_b_r(l, 0x20)
    case 0xee => SET_b_r16(h ++ l, 0x20)
    case 0xef => SET_b_r(a, 0x20)

    case 0xf0 => SET_b_r(b, 0x40)
    case 0xf1 => SET_b_r(c, 0x40)
    case 0xf2 => SET_b_r(d, 0x40)
    case 0xf3 => SET_b_r(e, 0x40)
    case 0xf4 => SET_b_r(h, 0x40)
    case 0xf5 => SET_b_r(l, 0x40)
    case 0xf6 => SET_b_r16(h ++ l, 0x40)
    case 0xf7 => SET_b_r(a, 0x40)

    case 0xf8 => SET_b_r(b, 0x80)
    case 0xf9 => SET_b_r(c, 0x80)
    case 0xfa => SET_b_r(d, 0x80)
    case 0xfb => SET_b_r(e, 0x80)
    case 0xfc => SET_b_r(h, 0x80)
    case 0xfd => SET_b_r(l, 0x80)
    case 0xfe => SET_b_r16(h ++ l, 0x80)
    case 0xff => SET_b_r(a, 0x80)

    case _ => println("No CP opcode found")
  }

  def RLC_n(fromRegister: Register) = {
    f.carryFlag = (fromRegister & 0x80) == 0x80
    fromRegister := ((fromRegister << 1) & 0xFF) | f.carryFlag
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def RLC_n16(fromRegister: Register) = {
    var x = memory.readByte8(fromRegister)
    f.carryFlag = (x & 0x80) == 0x80
    x = ((x << 1) & 0xFF) | f.carryFlag
    memory.writeByte8(fromRegister, x)
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = x == 0x00
  }

  def RL_n(fromRegister: Register) = {
    var x = (fromRegister & 0x80) == 0x80
    fromRegister := ((fromRegister << 1) & 0xFF) | f.carryFlag
    f.carryFlag = x
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def RL_n16(fromRegister: Register) = {
    var i = memory.readByte8(fromRegister)
    var x = (i & 0x80) == 0x80
    i = ((i << 1) & 0xFF) | f.carryFlag
    f.carryFlag = x
    memory.writeByte8(fromRegister, i)
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = i == 0x00
  }

  def RRC_n(fromRegister: Register) = {
    f.carryFlag = (fromRegister & 0x01) == 0x01
    fromRegister := (f.carryFlag * 0x80) | (fromRegister >> 1) //times bool by 0x80
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def RRC_n16(fromRegister: Register) = {
    var x = memory.readByte8(fromRegister)
    f.carryFlag = (x & 0x01) == 0x01
    x = (f.carryFlag * 0x80) | (x >> 1)
    memory.writeByte8(fromRegister, x)
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def RRn(fromRegister: Register) = {
    var x = ((fromRegister & 0x01) == 0x01)
    fromRegister := (f.carryFlag * 0x80) | (fromRegister >> 1)
    f.carryFlag = x
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def RRn16(fromRegister: Register) = {
    var x = memory.readByte8(fromRegister)
    var newFCarry = ((x & 0x01) == 0x01)
    x = (f.carryFlag * 0x80) | (x >> 1)
    f.carryFlag = newFCarry
    memory.writeByte8(fromRegister, x)
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def SLA_n(fromRegister: Register) = {
    f.carryFlag = (fromRegister & 0x80) == 0x80
    fromRegister := (fromRegister << 1) & 0xFF
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def SLA_n16(fromRegister: Register) = {
    var x = memory.readByte8(fromRegister)
    f.carryFlag = (x & 0x80) == 0x80
    x = (x << 1) & 0xFF
    memory.writeByte8(fromRegister, x)
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def SRA_n(fromRegister: Register) = {
    f.carryFlag = (fromRegister & 0x01) == 0x01
    fromRegister := (fromRegister & 0x80) | (fromRegister >> 1)
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def SRA_n16(fromRegister: Register) = {
    var x = memory.readByte8(fromRegister)
    f.carryFlag = ((x & 0x01) == 0x01)
    x = (x & 0x80) | (x >> 1)
    memory.writeByte8(fromRegister, x)
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def SRL_n(fromRegister: Register) = {
    f.carryFlag = (fromRegister & 0x01) == 0x01
    fromRegister := fromRegister >> 1
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def SRL_n16(fromRegister: Register) = {
    var x = memory.readByte8(fromRegister)
    f.carryFlag = (fromRegister & 0x01) == 0x01
    x = x >> 1
    memory.writeByte8(fromRegister, x)
    f.halfCarryFlag = false
    f.subFlag = false
    f.zeroFlag = fromRegister == 0x00
  }

  def BIT_b_r(fromRegister: Register, bit: Int) = {
    f.halfCarryFlag = true
    f.subFlag = false
    f.zeroFlag = (fromRegister & bit) == 0
  }

  def BIT_b_r16(fromRegister: Register, bit: Int) = {
    f.halfCarryFlag = true
    f.subFlag = false
    f.zeroFlag = (memory.readByte8(fromRegister) & bit) == 0
  }

  def SET_b_r(fromRegister: Register, bit: Int) = {
    fromRegister |= 0x01
  }

  def SET_b_r16(fromRegister: Register, bit: Int) = {
    memory.writeByte8(fromRegister, memory.readByte8(fromRegister) | 0x01)
  }

  def RES_b_r(fromRegister: Register, bit: Int) = {
    fromRegister &= bit // mask to 254 resetting 0 bit
  }

  def RES_b_r16(fromRegister: Register, bit: Int) = {
    memory.writeByte8(fromRegister, memory.readByte8(fromRegister) & bit) // mask
  }

  def SWAP_n(fromRegister: Register) = {
    fromRegister := ((fromRegister & 0xF) << 4) | (fromRegister >> 4)
    f.zeroFlag = fromRegister == 0
    f.carryFlag = false
    f.halfCarryFlag = false
    f.subFlag = false
  }

  def SWAP_n16(fromRegister: Register) = {
    var x = memory.readByte8(fromRegister)
    x = ((x & 0xF) << 4) | (x >> 4)
    memory.writeByte8(fromRegister, x)
    f.zeroFlag = (x == 0)
    f.carryFlag = false
    f.halfCarryFlag = false
    f.subFlag = false
  }

}