package gb
import Register._

class Opcodes(cpu: Cpu) {
  import cpu._
  trait Op { val offset: Int }
  case object |-| extends Op { override val offset = -1 }
  case object |+| extends Op { override val offset = 1 }

  def execute(opcode: Int) = {

    def HandleCB(opcode: Int) = {
      var i=memory.readByte8(pc)
      pc += 1
      pc &= 65535
      cb(i)
    }
    
    opcode match {

      case 0xCB => HandleCB(opcode)
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
      case 0x3D => DEC_n(a)
      case 0x05 => DEC_n(b)
      case 0x0D => DEC_n(c)
      case 0x15 => DEC_n(d)
      case 0x1D => DEC_n(e)
      case 0x25 => DEC_n(h)
      case 0x2D => DEC_n(l)
      case 0x35 => DEC_n16(h, l)
      case 0x09 => ADD_HL_n(h, l, b, c)
      case 0x19 => ADD_HL_n(h, l, d, e)
      case 0x29 => ADD_HL_n(h, l, h, l)
      case 0x39 => ADD_HL_nSP(h, l, sp)
      case 0xE8 => ADDSP_n(sp, pc)     
      case 0x03 => 1 //INC nn: page 92 of http://meatfighter.com/gameboy/GBCPUman.pdf
      case 0x13 => 1
      case 0x23 => 1
      case 0x33 => 1      
      case 0x0B => 1 //DEC nn: page 93 of http://meatfighter.com/gameboy/GBCPUman.pdf
      case 0x1B => 1
      case 0x2B => 1
      case 0x3B => 1    
      case 0x27 => 1 //DAA a: page 95     
      case 0x2F => 1 //CPL a: page 95
      case 0x3F => 1 //CCD carryflag: page 96
      case 0x37 => 1 //SCF set carry flag: page 96
      case 0x00 => NOP      
      case 0xF3 => DI
      case 0xFB => EI

    }
  }
  
  def cb(opcode : Int) = opcode match {
//    case 0x0 => RLCr_b(opcode, cpu)
//	case 0x1 => RLCr_c(opcode, cpu)
//	case 0x2 => RLCr_d(opcode, cpu)
//	case 0x3 => RLCr_e(opcode, cpu)
//	case 0x4 => RLCr_h(opcode, cpu)
//	case 0x5 => RLCr_l(opcode, cpu)
//	case 0x6 => RLCHL(opcode, cpu)
//	case 0x7 => RLCr_a(opcode, cpu)
//	case 0x8 => RRCr_b(opcode, cpu)
//	case 0x9 => RRCr_c(opcode, cpu)
//	case 0xa => RRCr_d(opcode, cpu)
//	case 0xb => RRCr_e(opcode, cpu)
//	case 0xc => RRCr_h(opcode, cpu)
//	case 0xd => RRCr_l(opcode, cpu)
//	case 0xe => RRCHL(opcode, cpu)
//	case 0xf => RRCr_a(opcode, cpu)
//	case 0x10 => RLr_b(opcode, cpu)
//	case 0x11 => RLr_c(opcode, cpu)
//	case 0x12 => RLr_d(opcode, cpu)
//	case 0x13 => RLr_e(opcode, cpu)
//	case 0x14 => RLr_h(opcode, cpu)
//	case 0x15 => RLr_l(opcode, cpu)
//	case 0x16 => RLHL(opcode, cpu)
//	case 0x17 => RLr_a(opcode, cpu)
//	case 0x18 => RRr_b(opcode, cpu)
//	case 0x19 => RRr_c(opcode, cpu)
//	case 0x1a => RRr_d(opcode, cpu)
//	case 0x1b => RRr_e(opcode, cpu)
//	case 0x1c => RRr_h(opcode, cpu)
//	case 0x1d => RRr_l(opcode, cpu)
//	case 0x1e => RRHL(opcode, cpu)
//	case 0x1f => RRr_a(opcode, cpu)
//	case 0x20 => SLAr_b(opcode, cpu)
//	case 0x21 => SLAr_c(opcode, cpu)
//	case 0x22 => SLAr_d(opcode, cpu)
//	case 0x23 => SLAr_e(opcode, cpu)
//	case 0x24 => SLAr_h(opcode, cpu)
//	case 0x25 => SLAr_l(opcode, cpu)
//	case 0x26 => XX(opcode, cpu)
//	case 0x27 => SLAr_a(opcode, cpu)
//	case 0x28 => SRAr_b(opcode, cpu)
//	case 0x29 => SRAr_c(opcode, cpu)
//	case 0x2a => SRAr_d(opcode, cpu)
//	case 0x2b => SRAr_e(opcode, cpu)
//	case 0x2c => SRAr_h(opcode, cpu)
//	case 0x2d => SRAr_l(opcode, cpu)
//	case 0x2e => XX(opcode, cpu)
//	case 0x2f => SRAr_a(opcode, cpu)
//	case 0x30 => SWAPr_b(opcode, cpu)
//	case 0x31 => SWAPr_c(opcode, cpu)
//	case 0x32 => SWAPr_d(opcode, cpu)
//	case 0x33 => SWAPr_e(opcode, cpu)
//	case 0x34 => SWAPr_h(opcode, cpu)
//	case 0x35 => SWAPr_l(opcode, cpu)
//	case 0x36 => XX(opcode, cpu)
//	case 0x37 => SWAPr_a(opcode, cpu)
//	case 0x38 => SRLr_b(opcode, cpu)
//	case 0x39 => SRLr_c(opcode, cpu)
//	case 0x3a => SRLr_d(opcode, cpu)
//	case 0x3b => SRLr_e(opcode, cpu)
//	case 0x3c => SRLr_h(opcode, cpu)
//	case 0x3d => SRLr_l(opcode, cpu)
//	case 0x3e => XX(opcode, cpu)
//	case 0x3f => SRLr_a(opcode, cpu)
//	case 0x40 => BIT0b(opcode, cpu)
//	case 0x41 => BIT0c(opcode, cpu)
//	case 0x42 => BIT0d(opcode, cpu)
//	case 0x43 => BIT0e(opcode, cpu)
//	case 0x44 => BIT0h(opcode, cpu)
//	case 0x45 => BIT0l(opcode, cpu)
//	case 0x46 => BIT0m(opcode, cpu)
//	case 0x47 => BIT0a(opcode, cpu)
//	case 0x48 => BIT1b(opcode, cpu)
//	case 0x49 => BIT1c(opcode, cpu)
//	case 0x4a => BIT1d(opcode, cpu)
//	case 0x4b => BIT1e(opcode, cpu)
//	case 0x4c => BIT1h(opcode, cpu)
//	case 0x4d => BIT1l(opcode, cpu)
//	case 0x4e => BIT1m(opcode, cpu)
//	case 0x4f => BIT1a(opcode, cpu)
//	case 0x50 => BIT2b(opcode, cpu)
//	case 0x51 => BIT2c(opcode, cpu)
//	case 0x52 => BIT2d(opcode, cpu)
//	case 0x53 => BIT2e(opcode, cpu)
//	case 0x54 => BIT2h(opcode, cpu)
//	case 0x55 => BIT2l(opcode, cpu)
//	case 0x56 => BIT2m(opcode, cpu)
//	case 0x57 => BIT2a(opcode, cpu)
//	case 0x58 => BIT3b(opcode, cpu)
//	case 0x59 => BIT3c(opcode, cpu)
//	case 0x5a => BIT3d(opcode, cpu)
//	case 0x5b => BIT3e(opcode, cpu)
//	case 0x5c => BIT3h(opcode, cpu)
//	case 0x5d => BIT3l(opcode, cpu)
//	case 0x5e => BIT3m(opcode, cpu)
//	case 0x5f => BIT3a(opcode, cpu)
//	case 0x60 => BIT4b(opcode, cpu)
//	case 0x61 => BIT4c(opcode, cpu)
//	case 0x62 => BIT4d(opcode, cpu)
//	case 0x63 => BIT4e(opcode, cpu)
//	case 0x64 => BIT4h(opcode, cpu)
//	case 0x65 => BIT4l(opcode, cpu)
//	case 0x66 => BIT4m(opcode, cpu)
//	case 0x67 => BIT4a(opcode, cpu)
//	case 0x68 => BIT5b(opcode, cpu)
//	case 0x69 => BIT5c(opcode, cpu)
//	case 0x6a => BIT5d(opcode, cpu)
//	case 0x6b => BIT5e(opcode, cpu)
//	case 0x6c => BIT5h(opcode, cpu)
//	case 0x6d => BIT5l(opcode, cpu)
//	case 0x6e => BIT5m(opcode, cpu)
//	case 0x6f => BIT5a(opcode, cpu)
//	case 0x70 => BIT6b(opcode, cpu)
//	case 0x71 => BIT6c(opcode, cpu)
//	case 0x72 => BIT6d(opcode, cpu)
//	case 0x73 => BIT6e(opcode, cpu)
//	case 0x74 => BIT6h(opcode, cpu)
//	case 0x75 => BIT6l(opcode, cpu)
//	case 0x76 => BIT6m(opcode, cpu)
//	case 0x77 => BIT6a(opcode, cpu)
//	case 0x78 => BIT7b(opcode, cpu)
//	case 0x79 => BIT7c(opcode, cpu)
//	case 0x7a => BIT7d(opcode, cpu)
//	case 0x7b => BIT7e(opcode, cpu)
//	case 0x7c => BIT7h(opcode, cpu)
//	case 0x7d => BIT7l(opcode, cpu)
//	case 0x7e => BIT7m(opcode, cpu)
//	case 0x7f => BIT7a(opcode, cpu)
//	case 0x80 => RES0b(opcode, cpu)
//	case 0x81 => RES0c(opcode, cpu)
//	case 0x82 => RES0d(opcode, cpu)
//	case 0x83 => RES0e(opcode, cpu)
//	case 0x84 => RES0h(opcode, cpu)
//	case 0x85 => RES0l(opcode, cpu)
//	case 0x86 => RES0m(opcode, cpu)
//	case 0x87 => RES0a(opcode, cpu)
//	case 0x88 => RES1b(opcode, cpu)
//	case 0x89 => RES1c(opcode, cpu)
//	case 0x8a => RES1d(opcode, cpu)
//	case 0x8b => RES1e(opcode, cpu)
//	case 0x8c => RES1h(opcode, cpu)
//	case 0x8d => RES1l(opcode, cpu)
//	case 0x8e => RES1m(opcode, cpu)
//	case 0x8f => RES1a(opcode, cpu)
//	case 0x90 => RES2b(opcode, cpu)
//	case 0x91 => RES2c(opcode, cpu)
//	case 0x92 => RES2d(opcode, cpu)
//	case 0x93 => RES2e(opcode, cpu)
//	case 0x94 => RES2h(opcode, cpu)
//	case 0x95 => RES2l(opcode, cpu)
//	case 0x96 => RES2m(opcode, cpu)
//	case 0x97 => RES2a(opcode, cpu)
//	case 0x98 => RES3b(opcode, cpu)
//	case 0x99 => RES3c(opcode, cpu)
//	case 0x9a => RES3d(opcode, cpu)
//	case 0x9b => RES3e(opcode, cpu)
//	case 0x9c => RES3h(opcode, cpu)
//	case 0x9d => RES3l(opcode, cpu)
//	case 0x9e => RES3m(opcode, cpu)
//	case 0x9f => RES3a(opcode, cpu)
//	case 0xa0 => RES4b(opcode, cpu)
//	case 0xa1 => RES4c(opcode, cpu)
//	case 0xa2 => RES4d(opcode, cpu)
//	case 0xa3 => RES4e(opcode, cpu)
//	case 0xa4 => RES4h(opcode, cpu)
//	case 0xa5 => RES4l(opcode, cpu)
//	case 0xa6 => RES4m(opcode, cpu)
//	case 0xa7 => RES4a(opcode, cpu)
//	case 0xa8 => RES5b(opcode, cpu)
//	case 0xa9 => RES5c(opcode, cpu)
//	case 0xaa => RES5d(opcode, cpu)
//	case 0xab => RES5e(opcode, cpu)
//	case 0xac => RES5h(opcode, cpu)
//	case 0xad => RES5l(opcode, cpu)
//	case 0xae => RES5m(opcode, cpu)
//	case 0xaf => RES5a(opcode, cpu)
//	case 0xb0 => RES6b(opcode, cpu)
//	case 0xb1 => RES6c(opcode, cpu)
//	case 0xb2 => RES6d(opcode, cpu)
//	case 0xb3 => RES6e(opcode, cpu)
//	case 0xb4 => RES6h(opcode, cpu)
//	case 0xb5 => RES6l(opcode, cpu)
//	case 0xb6 => RES6m(opcode, cpu)
//	case 0xb7 => RES6a(opcode, cpu)
//	case 0xb8 => RES7b(opcode, cpu)
//	case 0xb9 => RES7c(opcode, cpu)
//	case 0xba => RES7d(opcode, cpu)
//	case 0xbb => RES7e(opcode, cpu)
//	case 0xbc => RES7h(opcode, cpu)
//	case 0xbd => RES7l(opcode, cpu)
//	case 0xbe => RES7m(opcode, cpu)
//	case 0xbf => RES7a(opcode, cpu)
//	case 0xc0 => SET0b(opcode, cpu)
//	case 0xc1 => SET0c(opcode, cpu)
//	case 0xc2 => SET0d(opcode, cpu)
//	case 0xc3 => SET0e(opcode, cpu)
//	case 0xc4 => SET0h(opcode, cpu)
//	case 0xc5 => SET0l(opcode, cpu)
//	case 0xc6 => SET0m(opcode, cpu)
//	case 0xc7 => SET0a(opcode, cpu)
//	case 0xc8 => SET1b(opcode, cpu)
//	case 0xc9 => SET1c(opcode, cpu)
//	case 0xca => SET1d(opcode, cpu)
//	case 0xcb => SET1e(opcode, cpu)
//	case 0xcc => SET1h(opcode, cpu)
//	case 0xcd => SET1l(opcode, cpu)
//	case 0xce => SET1m(opcode, cpu)
//	case 0xcf => SET1a(opcode, cpu)
//	case 0xd0 => SET2b(opcode, cpu)
//	case 0xd1 => SET2c(opcode, cpu)
//	case 0xd2 => SET2d(opcode, cpu)
//	case 0xd3 => SET2e(opcode, cpu)
//	case 0xd4 => SET2h(opcode, cpu)
//	case 0xd5 => SET2l(opcode, cpu)
//	case 0xd6 => SET2m(opcode, cpu)
//	case 0xd7 => SET2a(opcode, cpu)
//	case 0xd8 => SET3b(opcode, cpu)
//	case 0xd9 => SET3c(opcode, cpu)
//	case 0xda => SET3d(opcode, cpu)
//	case 0xdb => SET3e(opcode, cpu)
//	case 0xdc => SET3h(opcode, cpu)
//	case 0xdd => SET3l(opcode, cpu)
//	case 0xde => SET3m(opcode, cpu)
//	case 0xdf => SET3a(opcode, cpu)
//	case 0xe0 => SET4b(opcode, cpu)
//	case 0xe1 => SET4c(opcode, cpu)
//	case 0xe2 => SET4d(opcode, cpu)
//	case 0xe3 => SET4e(opcode, cpu)
//	case 0xe4 => SET4h(opcode, cpu)
//	case 0xe5 => SET4l(opcode, cpu)
//	case 0xe6 => SET4m(opcode, cpu)
//	case 0xe7 => SET4a(opcode, cpu)
//	case 0xe8 => SET5b(opcode, cpu)
//	case 0xe9 => SET5c(opcode, cpu)
//	case 0xea => SET5d(opcode, cpu)
//	case 0xeb => SET5e(opcode, cpu)
//	case 0xec => SET5h(opcode, cpu)
//	case 0xed => SET5l(opcode, cpu)
//	case 0xee => SET5m(opcode, cpu)
//	case 0xef => SET5a(opcode, cpu)
//	case 0xf0 => SET6b(opcode, cpu)
//	case 0xf1 => SET6c(opcode, cpu)
//	case 0xf2 => SET6d(opcode, cpu)
//	case 0xf3 => SET6e(opcode, cpu)
//	case 0xf4 => SET6h(opcode, cpu)
//	case 0xf5 => SET6l(opcode, cpu)
//	case 0xf6 => SET6m(opcode, cpu)
//	case 0xf7 => SET6a(opcode, cpu)
//	case 0xf8 => SET7b(opcode, cpu)
//	case 0xf9 => SET7c(opcode, cpu)
//	case 0xfa => SET7d(opcode, cpu)
//	case 0xfb => SET7e(opcode, cpu)
//	case 0xfc => SET7h(opcode, cpu)
//	case 0xfd => SET7l(opcode, cpu)
//	case 0xfe => SET7m(opcode, cpu)
//	case 0xff => SET7a(opcode, cpu)
    case _ => println("No CP opcode found")
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

  def INC_n(toRegister: Register) = {
    toRegister += 1
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag((toRegister & 0xF) == 0)
    f.setSubFlag(false)
  }

  def INC_n16(fromRegister: Register, fromRegister2: Register) = {
    val i = memory.readByte8((fromRegister << 8) + fromRegister2)
    cpu.memory.writeByte8((fromRegister << 8) + fromRegister2, i)
    f.setZeroFlag(i == 0)
    f.setHalfCarryFlag((i & 0xF) == 0)
    f.setSubFlag(false)
  }

  def DEC_n(toRegister: Register) = {
    toRegister -= 1
    f.setZeroFlag(toRegister == 0)
    f.setHalfCarryFlag((toRegister & 0xF) == 0xF)
    f.setSubFlag(true)
  }

  def DEC_n16(fromRegister: Register, fromRegister2: Register) = {
    var i = cpu.memory.readByte8((fromRegister << 8) + fromRegister2) - 1
    cpu.memory.writeByte8((fromRegister << 8) + fromRegister2, i)
    f.setZeroFlag(i == 0)
    f.setHalfCarryFlag((i & 0xF) == 0xF)
    f.setSubFlag(true)
  }

  //TODO: HL, BC, DE are referred to as 16 bit registers occasionally. 
  //Maybe some accessors/mutators that auto combine them so we can perform instructions on them as 16 bit registers as well as 8 bit

  def ADD_HL_n(fromRegister: Register, fromRegister2: Register, toRegister: Register, toRegister2: Register) = {
    var hl = (fromRegister << 8) + fromRegister2
    val bc = (toRegister << 8) + toRegister2
    hl += bc
    fromRegister := (hl >> 8) & 255 //unshift bits
    fromRegister2 := hl & 255
    f.setCarryFlag(hl > 0xFFFF)
    f.setHalfCarryFlag((((fromRegister << 8) + fromRegister2) & 0xFFF) + (bc & 0xFFF) > 0xFFF)
    f.setSubFlag(false)
  }

  def ADD_HL_nSP(fromRegister: Register, fromRegister2: Register, toRegister: Register) = {
    var hl = (fromRegister << 8) + fromRegister2
    hl += sp
    fromRegister := (hl >> 8) & 255 //unshift bits
    fromRegister2 := hl & 255
    f.setCarryFlag(hl > 0xFFFF)
    f.setHalfCarryFlag((((fromRegister << 8) + fromRegister2) & 0xFFF) + (sp & 0xFFF) > 0xFFF)
    f.setSubFlag(false)
  }

  def ADDSP_n(toRegister: Register, fromRegister: Register) = {
    val i = memory.readByte8(fromRegister)
    var j = (toRegister + i) & 0xFFFF
    f.setCarryFlag(((toRegister ^ i ^ j) & 0x100) == 0x100)
    f.setHalfCarryFlag(((toRegister ^ i ^ j) & 0x10) == 0x10)
    f.setZeroFlag(false)
    f.setSubFlag(false)
    sp := j;
    pc += 1
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
  
  def NOP() = {
    //do sfa
  }
  
  def HALT() = {
    halt := 1
  }
  
  def DI() = {
    interruptable = false
  }
  
  def EI() = {
    interruptable = true
  }

}