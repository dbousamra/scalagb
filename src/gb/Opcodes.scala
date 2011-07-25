package gb

class Opcodes() {

  def execute(opcode: Int, cpu: Cpu) = opcode match {

        //case 0x0 => NOP
        case 0x1 => LDBCnn(opcode, cpu)
        case 0x2 => LDBCmA(opcode, cpu)
        case 0x3 => INCBC(opcode, cpu)
        case 0x4 => INCr_b(opcode, cpu)
        case 0x5 => DECr_b(opcode, cpu)
        case 0x6 => LDrn_b(opcode, cpu)
        //case 0x7 => RLCA(opcode, cpu)
        //case 0x8 => LDmmSP(opcode, cpu)
        case 0x9 => ADDHLBC(opcode, cpu)
        case 0xa => LDABCm(opcode, cpu)
        case 0xb => DECBC(opcode, cpu)
        case 0xc => INCr_c(opcode, cpu)
        case 0xd => DECr_c(opcode, cpu)
        case 0xe => LDrn_c(opcode, cpu)
        //case 0xf => RRCA(opcode, cpu)
        //case 0x10 => DJNZn(opcode, cpu)
        case 0x11 => LDDEnn(opcode, cpu)
        case 0x12 => LDDEmA(opcode, cpu)
        case 0x13 => INCDE(opcode, cpu)
        case 0x14 => INCr_d(opcode, cpu)
        case 0x15 => DECr_d(opcode, cpu)
        case 0x16 => LDrn_d(opcode, cpu)
        //case 0x17 => RLA(opcode, cpu)
        //case 0x18 => JRn(opcode, cpu)
        case 0x19 => ADDHLDE(opcode, cpu)
        case 0x1a => LDADEm(opcode, cpu)
        case 0x1b => DECDE(opcode, cpu)
        case 0x1c => INCr_e(opcode, cpu)
        case 0x1d => DECr_e(opcode, cpu)
        case 0x1e => LDrn_e(opcode, cpu)
        //case 0x1f => RRA(opcode, cpu)
        //case 0x20 => JRNZn(opcode, cpu)
        case 0x21 => LDHLnn(opcode, cpu)
        case 0x22 => LDHLIA(opcode, cpu)
        case 0x23 => INCHL(opcode, cpu)
        case 0x24 => INCr_h(opcode, cpu)
        case 0x25 => DECr_h(opcode, cpu)
        case 0x26 => LDrn_h(opcode, cpu)
        case 0x27 => DAA(opcode, cpu)
        //case 0x28 => JRZn(opcode, cpu)
        case 0x29 => ADDHLHL(opcode, cpu)
        case 0x2a => LDAHLI(opcode, cpu)
        case 0x2b => DECHL(opcode, cpu)
        case 0x2c => INCr_l(opcode, cpu)
        case 0x2d => DECr_l(opcode, cpu)
        case 0x2e => LDrn_l(opcode, cpu)
       // case 0x2f => CPL(opcode, cpu)
        //case 0x30 => JRNCn(opcode, cpu)
        case 0x31 => LDSPnn(opcode, cpu)
        case 0x32 => LDHLDA(opcode, cpu)
        case 0x33 => INCSP(opcode, cpu)
        case 0x34 => INCHLm(opcode, cpu)
        case 0x35 => DECHLm(opcode, cpu)
        case 0x36 => LDHLmn(opcode, cpu)
        //case 0x37 => SCF(opcode, cpu)
        //case 0x38 => JRCn(opcode, cpu)
        case 0x39 => ADDHLSP(opcode, cpu)
        case 0x3a => LDAHLD(opcode, cpu)
        case 0x3b => DECSP(opcode, cpu)
        case 0x3c => INCr_a(opcode, cpu)
        case 0x3d => DECr_a(opcode, cpu)
        case 0x3e => LDrn_a(opcode, cpu)
        //case 0x3f => CCF(opcode, cpu)
        case 0x40 => LDrr_bb(opcode, cpu)
    case 0x41 => LDrr_bc(opcode, cpu)
    case 0x42 => LDrr_bd(opcode, cpu)
    case 0x43 => LDrr_be(opcode, cpu)
    case 0x44 => LDrr_bh(opcode, cpu)
    case 0x45 => LDrr_bl(opcode, cpu)
    case 0x46 => LDrHLm_b(opcode, cpu)
    case 0x47 => LDrr_ba(opcode, cpu)
    case 0x48 => LDrr_cb(opcode, cpu)
    case 0x49 => LDrr_cc(opcode, cpu)
    case 0x4a => LDrr_cd(opcode, cpu)
    case 0x4b => LDrr_ce(opcode, cpu)
    case 0x4c => LDrr_ch(opcode, cpu)
    case 0x4d => LDrr_cl(opcode, cpu)
    case 0x4e => LDrHLm_c(opcode, cpu)
    case 0x4f => LDrr_ca(opcode, cpu)
    case 0x50 => LDrr_db(opcode, cpu)
    case 0x51 => LDrr_dc(opcode, cpu)
    case 0x52 => LDrr_dd(opcode, cpu)
    case 0x53 => LDrr_de(opcode, cpu)
    case 0x54 => LDrr_dh(opcode, cpu)
    case 0x55 => LDrr_dl(opcode, cpu)
    case 0x56 => LDrHLm_d(opcode, cpu)
    case 0x57 => LDrr_da(opcode, cpu)
    case 0x58 => LDrr_eb(opcode, cpu)
    case 0x59 => LDrr_ec(opcode, cpu)
    case 0x5a => LDrr_ed(opcode, cpu)
    case 0x5b => LDrr_ee(opcode, cpu)
    case 0x5c => LDrr_eh(opcode, cpu)
    case 0x5d => LDrr_el(opcode, cpu)
    case 0x5e => LDrHLm_e(opcode, cpu)
    case 0x5f => LDrr_ea(opcode, cpu)
    case 0x60 => LDrr_hb(opcode, cpu)
    case 0x61 => LDrr_hc(opcode, cpu)
    case 0x62 => LDrr_hd(opcode, cpu)
    case 0x63 => LDrr_he(opcode, cpu)
    case 0x64 => LDrr_hh(opcode, cpu)
    case 0x65 => LDrr_hl(opcode, cpu)
    case 0x66 => LDrHLm_h(opcode, cpu)
    case 0x67 => LDrr_ha(opcode, cpu)
    case 0x68 => LDrr_lb(opcode, cpu)
    case 0x69 => LDrr_lc(opcode, cpu)
    case 0x6a => LDrr_ld(opcode, cpu)
    case 0x6b => LDrr_le(opcode, cpu)
    case 0x6c => LDrr_lh(opcode, cpu)
    case 0x6d => LDrr_ll(opcode, cpu)
    case 0x6e => LDrHLm_l(opcode, cpu)
    case 0x6f => LDrr_la(opcode, cpu)
    case 0x70 => LDHLmr_b(opcode, cpu)
    case 0x71 => LDHLmr_c(opcode, cpu)
    case 0x72 => LDHLmr_d(opcode, cpu)
    case 0x73 => LDHLmr_e(opcode, cpu)
    case 0x74 => LDHLmr_h(opcode, cpu)
    case 0x75 => LDHLmr_l(opcode, cpu)
    //case 0x76 => HALT(opcode, cpu)
    case 0x77 => LDHLmr_a(opcode, cpu)
    case 0x78 => LDrr_ab(opcode, cpu)
    case 0x79 => LDrr_ac(opcode, cpu)
    case 0x7a => LDrr_ad(opcode, cpu)
    case 0x7b => LDrr_ae(opcode, cpu)
    case 0x7c => LDrr_ah(opcode, cpu)
    case 0x7d => LDrr_al(opcode, cpu)
    case 0x7e => LDrHLm_a(opcode, cpu)
    case 0x7f => LDrr_aa(opcode, cpu)
    case 0x80 => ADDr_b(opcode, cpu)
    case 0x81 => ADDr_c(opcode, cpu)
    case 0x82 => ADDr_d(opcode, cpu)
    case 0x83 => ADDr_e(opcode, cpu)
    case 0x84 => ADDr_h(opcode, cpu)
    case 0x85 => ADDr_l(opcode, cpu)
    case 0x86 => ADDHL(opcode, cpu)
    case 0x87 => ADDr_a(opcode, cpu)
    case 0x88 => ADCr_b(opcode, cpu)
    case 0x89 => ADCr_c(opcode, cpu)
    case 0x8a => ADCr_d(opcode, cpu)
    case 0x8b => ADCr_e(opcode, cpu)
    case 0x8c => ADCr_h(opcode, cpu)
    case 0x8d => ADCr_l(opcode, cpu)
    case 0x8e => ADCHL(opcode, cpu)
    case 0x8f => ADCr_a(opcode, cpu)
    case 0x90 => SUBr_b(opcode, cpu)
    case 0x91 => SUBr_c(opcode, cpu)
    case 0x92 => SUBr_d(opcode, cpu)
    case 0x93 => SUBr_e(opcode, cpu)
    case 0x94 => SUBr_h(opcode, cpu)
    case 0x95 => SUBr_l(opcode, cpu)
    case 0x96 => SUBHL(opcode, cpu)
    case 0x97 => SUBr_a(opcode, cpu)
    case 0x98 => SBCr_b(opcode, cpu)
    case 0x99 => SBCr_c(opcode, cpu)
    case 0x9a => SBCr_d(opcode, cpu)
    case 0x9b => SBCr_e(opcode, cpu)
    case 0x9c => SBCr_h(opcode, cpu)
    case 0x9d => SBCr_l(opcode, cpu)
    case 0x9e => SBCHL(opcode, cpu)
    case 0x9f => SBCr_a(opcode, cpu)
    case 0xa0 => ANDr_b(opcode, cpu)
    case 0xa1 => ANDr_c(opcode, cpu)
    case 0xa2 => ANDr_d(opcode, cpu)
    case 0xa3 => ANDr_e(opcode, cpu)
    case 0xa4 => ANDr_h(opcode, cpu)
    case 0xa5 => ANDr_l(opcode, cpu)
    case 0xa6 => ANDHL(opcode, cpu)
    case 0xa7 => ANDr_a(opcode, cpu)
    case 0xa8 => XORr_b(opcode, cpu)
    case 0xa9 => XORr_c(opcode, cpu)
    case 0xaa => XORr_d(opcode, cpu)
    case 0xab => XORr_e(opcode, cpu)
    case 0xac => XORr_h(opcode, cpu)
    case 0xad => XORr_l(opcode, cpu)
    case 0xae => XORHL(opcode, cpu)
    case 0xaf => XORr_a(opcode, cpu)
    case 0xb0 => ORr_b(opcode, cpu)
    case 0xb1 => ORr_c(opcode, cpu)
    case 0xb2 => ORr_d(opcode, cpu)
    case 0xb3 => ORr_e(opcode, cpu)
    case 0xb4 => ORr_h(opcode, cpu)
    case 0xb5 => ORr_l(opcode, cpu)
    case 0xb6 => ORHL(opcode, cpu)
    case 0xb7 => ORr_a(opcode, cpu)
    case 0xb8 => CPr_b(opcode, cpu)
    case 0xb9 => CPr_c(opcode, cpu)
    case 0xba => CPr_d(opcode, cpu)
    case 0xbb => CPr_e(opcode, cpu)
    case 0xbc => CPr_h(opcode, cpu)
    case 0xbd => CPr_l(opcode, cpu)
    case 0xbe => CPHL(opcode, cpu)
    case 0xbf => CPr_a(opcode, cpu)
        case 0xc0 => RETNZ(opcode, cpu)
//        case 0xc1 => POPBC(opcode, cpu)
//        case 0xc2 => JPNZnn(opcode, cpu)
//        case 0xc3 => JPnn(opcode, cpu)
//        case 0xc4 => CALLNZnn(opcode, cpu)
//        case 0xc5 => PUSHBC(opcode, cpu)
//        case 0xc6 => ADDn(opcode, cpu)
//        case 0xc7 => RST00(opcode, cpu)
//        case 0xc8 => RETZ(opcode, cpu)
//        case 0xc9 => RET(opcode, cpu)
//        case 0xca => JPZnn(opcode, cpu)
//        case 0xcb => MAPcb(opcode, cpu)
//        case 0xcc => CALLZnn(opcode, cpu)
//        case 0xcd => CALLnn(opcode, cpu)
//        case 0xce => ADCn(opcode, cpu)
//        case 0xcf => RST08(opcode, cpu)
//        case 0xd0 => RETNC(opcode, cpu)
//        case 0xd1 => POPDE(opcode, cpu)
//        case 0xd2 => JPNCnn(opcode, cpu)
//        case 0xd3 => XX(opcode, cpu)
//        case 0xd4 => CALLNCnn(opcode, cpu)
//        case 0xd5 => PUSHDE(opcode, cpu)
//        case 0xd6 => SUBn(opcode, cpu)
//        case 0xd7 => RST10(opcode, cpu)
//        case 0xd8 => RETC(opcode, cpu)
//        case 0xd9 => RETI(opcode, cpu)
//        case 0xda => JPCnn(opcode, cpu)
//        case 0xdb => XX(opcode, cpu)
//        case 0xdc => CALLCnn(opcode, cpu)
//        case 0xdd => XX(opcode, cpu)
//        case 0xde => SBCn(opcode, cpu)
//        case 0xdf => RST18(opcode, cpu)
//        case 0xe0 => LDIOnA(opcode, cpu)
//        case 0xe1 => POPHL(opcode, cpu)
//        case 0xe2 => LDIOCA(opcode, cpu)
//        case 0xe3 => XX(opcode, cpu)
//        case 0xe4 => XX(opcode, cpu)
//        case 0xe5 => PUSHHL(opcode, cpu)
//        case 0xe6 => ANDn(opcode, cpu)
//        case 0xe7 => RST20(opcode, cpu)
//        case 0xe8 => ADDSPn(opcode, cpu)
//        case 0xe9 => JPHL(opcode, cpu)
//        case 0xea => LDmmA(opcode, cpu)
//        case 0xeb => XX(opcode, cpu)
//        case 0xec => XX(opcode, cpu)
//        case 0xed => XX(opcode, cpu)
//        case 0xee => XORn(opcode, cpu)
//        case 0xef => RST28(opcode, cpu)
//        case 0xf0 => LDAIOn(opcode, cpu)
//        case 0xf1 => POPAF(opcode, cpu)
//        case 0xf2 => LDAIOC(opcode, cpu)
//        case 0xf3 => DI(opcode, cpu)
//        case 0xf4 => XX(opcode, cpu)
//        case 0xf5 => PUSHAF(opcode, cpu)
//        case 0xf6 => ORn(opcode, cpu)
//        case 0xf7 => RST30(opcode, cpu)
//        case 0xf8 => LDHLSPn(opcode, cpu)
//        case 0xf9 => XX(opcode, cpu)
//        case 0xfa => LDAmm(opcode, cpu)
//        case 0xfb => EI(opcode, cpu)
//        case 0xfc => XX(opcode, cpu)
//        case 0xfd => XX(opcode, cpu)
//        case 0xfe => CPn(opcode, cpu)
//        case 0xff => RST38
//  }
  def LDrr_bb(opcode: Int, cpu: Cpu) = {

    cpu.registers.b = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1;
  }

  def LDrr_bc(opcode: Int, cpu: Cpu) = {
    cpu.registers.b = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_bd(opcode: Int, cpu: Cpu) = {
    cpu.registers.b = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_be(opcode: Int, cpu: Cpu) = {
    cpu.registers.b = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_bh(opcode: Int, cpu: Cpu) = {
    cpu.registers.b = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_bl(opcode: Int, cpu: Cpu) = {
    cpu.registers.b = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ba(opcode: Int, cpu: Cpu) = {
    cpu.registers.b = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_cb(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_cc(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_cd(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ce(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ch(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_cl(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ca(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_db(opcode: Int, cpu: Cpu) = {
    cpu.registers.d = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_dc(opcode: Int, cpu: Cpu) = {
    cpu.registers.d = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_dd(opcode: Int, cpu: Cpu) = {
    cpu.registers.d = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_de(opcode: Int, cpu: Cpu) = {
    cpu.registers.d = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_dh(opcode: Int, cpu: Cpu) = {
    cpu.registers.d = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_dl(opcode: Int, cpu: Cpu) = {
    cpu.registers.d = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_da(opcode: Int, cpu: Cpu) = {
    cpu.registers.d = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_eb(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ec(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ed(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ee(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_eh(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_el(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ea(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hb(opcode: Int, cpu: Cpu) = {
    cpu.registers.h = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hc(opcode: Int, cpu: Cpu) = {
    cpu.registers.h = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hd(opcode: Int, cpu: Cpu) = {
    cpu.registers.h = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_he(opcode: Int, cpu: Cpu) = {
    cpu.registers.h = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hh(opcode: Int, cpu: Cpu) = {
    cpu.registers.h = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hl(opcode: Int, cpu: Cpu) = {
    cpu.registers.h = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ha(opcode: Int, cpu: Cpu) = {
    cpu.registers.h = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_lb(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_lc(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ld(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_le(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_lh(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ll(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_la(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ab(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ac(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ad(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ae(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ah(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_al(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_aa(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrHLm_b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_b(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.registers.b)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_c(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.registers.c)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_d(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.registers.d)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_e(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.registers.e)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_h(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.registers.h)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_l(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_a(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.registers.a)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmn(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.memory.readByte8(cpu, cpu.registers.pc))
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 3
  }

  def LDBCmA(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.b << 8) + cpu.registers.c, cpu.registers.a)
    cpu.registers.lastInstrClockm = 2
  }

  def LDDEmA(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.d << 8) + cpu.registers.e, cpu.registers.a)
    cpu.registers.lastInstrClockm = 2
  }

  def LDmmA(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, cpu.memory.readByte16(cpu, cpu.registers.pc), cpu.registers.a)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 4
  }

  def LDABCm(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.memory.readByte8(cpu, (cpu.registers.b << 8) + cpu.registers.c)
    cpu.registers.lastInstrClockm = 2
  }

  def LDADEm(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.memory.readByte8(cpu, (cpu.registers.d << 8) + cpu.registers.e)
    cpu.registers.lastInstrClockm = 2
  }

  def LDAmm(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.memory.readByte8(cpu, cpu.memory.readByte16(cpu, cpu.registers.pc))
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 4
  }

  def LDBCnn(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.b = cpu.memory.readByte8(cpu, cpu.registers.pc + 1)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 3
  }

  def LDDEnn(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.d = cpu.memory.readByte8(cpu, cpu.registers.pc + 1)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 3
  }

  def LDHLnn(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.h = cpu.memory.readByte8(cpu, cpu.registers.pc + 1)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 3
  }

  def LDSPnn(opcode: Int, cpu: Cpu) = {
    cpu.registers.sp = cpu.memory.readByte16(cpu, cpu.registers.pc)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 3
  }

  def LDHLmm(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte16(cpu, cpu.registers.pc)
    cpu.registers.pc += 2
    cpu.registers.l = cpu.memory.readByte8(cpu, i)
    cpu.registers.h = cpu.memory.readByte8(cpu, i + 1)
    cpu.registers.lastInstrClockm = 5
  }

  def LDmmHL(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte16(cpu, cpu.registers.pc)
    cpu.registers.pc += 2
    cpu.memory.writeByte16(cpu, i, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 5
  }

  def LDHLIA(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.registers.a)
    cpu.registers.l = (cpu.registers.l + 1) & 255
    if (cpu.registers.l != 0) cpu.registers.h = (cpu.registers.h + 1) & 255
    cpu.registers.lastInstrClockm = 2
  }

  def LDAHLI(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.l = (cpu.registers.l + 1) & 255
    if (cpu.registers.l != 0) cpu.registers.h = (cpu.registers.h + 1) & 255
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLDA(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, cpu.registers.a)
    cpu.registers.l = (cpu.registers.l - 1) & 255
    if (cpu.registers.l == 255) cpu.registers.h = (cpu.registers.h - 1) & 255
    cpu.registers.lastInstrClockm = 2
  }

  def LDAHLD(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.l = (cpu.registers.l - 1) & 255
    if (cpu.registers.l == 255) cpu.registers.h = (cpu.registers.h - 1) & 255
    cpu.registers.lastInstrClockm = 2
  }

  def LDAIOn(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.memory.readByte8(cpu, 0xFF00 + cpu.memory.readByte8(cpu, cpu.registers.pc))
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 3
  }

  def LDIOnA(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, 0xFF00 + cpu.memory.readByte8(cpu, cpu.registers.pc), cpu.registers.a)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 3
  }

  def LDAIOC(opcode: Int, cpu: Cpu) = {
    cpu.registers.a = cpu.memory.readByte8(cpu, 0xFF00 + cpu.registers.c)
    cpu.registers.lastInstrClockm = 2
  }

  def LDIOCA(opcode: Int, cpu: Cpu) = {
    cpu.memory.writeByte8(cpu, 0xFF00 + cpu.registers.c, cpu.registers.a)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLSPn(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, cpu.registers.pc)
    if (i > 127) i = -((~i + 1) & 255)
    cpu.registers.pc += 1
    i += cpu.registers.sp
    cpu.registers.h = (i >> 8) & 255
    cpu.registers.l = i & 255
    cpu.registers.lastInstrClockm = 3
  }

  def SWAPr_b(opcode: Int, cpu: Cpu) = {
    var tr = cpu.registers.b
    cpu.registers.b = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_c(opcode: Int, cpu: Cpu) = {
    var tr = cpu.registers.c
    cpu.registers.c = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_d(opcode: Int, cpu: Cpu) = {
    var tr = cpu.registers.d
    cpu.registers.d = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_e(opcode: Int, cpu: Cpu) = {
    var tr = cpu.registers.e
    cpu.registers.e = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_h(opcode: Int, cpu: Cpu) = {
    var tr = cpu.registers.h
    cpu.registers.h = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_l(opcode: Int, cpu: Cpu) = {
    var tr = cpu.registers.l
    cpu.registers.l = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_a(opcode: Int, cpu: Cpu) = {
    var tr = cpu.registers.a
    cpu.registers.a = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_b(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.b
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.b ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_c(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.c
    //cpu.registers.f=(cpu.registers.a>255)?0x10:0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.c ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_d(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.d
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.b ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_e(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.e
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.e ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_h(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.h
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.h ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_l(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.l
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.l ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_a(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.a
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.b ^ a) & 0x10
    if (x != 0) cpu.registers.a |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADDHL(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l))
    cpu.registers.a += m
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ a ^ m) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def ADDn(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.a += m
    cpu.registers.pc += 1
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ a ^ m) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def ADDHLBC(opcode: Int, cpu: Cpu) = {
    var hl = (cpu.registers.h << 8) + cpu.registers.l
    hl += (cpu.registers.b << 8) + cpu.registers.c
    if (hl > 65535) cpu.registers.f |= 0x10
    else cpu.registers.f &= 0xEF
    cpu.registers.h = (hl >> 8) & 255
    cpu.registers.l = hl & 255
    cpu.registers.lastInstrClockm = 3
  }

  def ADDHLDE(opcode: Int, cpu: Cpu) = {
    var hl = (cpu.registers.h << 8) + cpu.registers.l
    hl += (cpu.registers.d << 8) + cpu.registers.e
    if (hl > 65535) cpu.registers.f |= 0x10
    else cpu.registers.f &= 0xEF
    cpu.registers.h = (hl >> 8) & 255
    cpu.registers.l = hl & 255
    cpu.registers.lastInstrClockm = 3
  }

  def ADDHLHL(opcode: Int, cpu: Cpu) = {
    var hl = (cpu.registers.h << 8) + cpu.registers.l
    hl += (cpu.registers.h << 8) + cpu.registers.l
    if (hl > 65535) cpu.registers.f |= 0x10
    else cpu.registers.f &= 0xEF
    cpu.registers.h = (hl >> 8) & 255
    cpu.registers.l = hl & 255
    cpu.registers.lastInstrClockm = 3
  }

  def ADDHLSP(opcode: Int, cpu: Cpu) = {
    var hl = (cpu.registers.h << 8) + cpu.registers.l
    hl += cpu.registers.sp
    if (hl > 65535) cpu.registers.f |= 0x10
    else cpu.registers.f &= 0xEF
    cpu.registers.h = (hl >> 8) & 255
    cpu.registers.l = hl & 255
    cpu.registers.lastInstrClockm = 3
  }

  def ADDSPn(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.pc))
    if (i > 127) i = -((~i + 1) & 255)
    cpu.registers.pc += 1
    cpu.registers.sp += i
    cpu.registers.lastInstrClockm = 4
  }

  def ADCr_b(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.b
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    //cpu.registers.f=(cpu.registers.a>255)?0x10:0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.b ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_c(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.c
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.c ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_d(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.d
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.d ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_e(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.e
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.e ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_h(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.h
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.b ^ a) & 0x10
    if (x != 0) cpu.registers.h |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_l(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.l
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.l ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_a(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.a
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.a ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def ADCHL(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l))
    cpu.registers.a += m
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val c = (cpu.registers.a ^ m ^ a) & 0x10
    if (c != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def ADCn(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, (cpu.registers.pc))
    cpu.registers.a += m
    cpu.registers.pc += 1
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val c = (cpu.registers.a ^ m ^ a) & 0x10
    if (c != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SUBr_b(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.b
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    //if (cpu.registers.a<0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.b ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_c(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.c
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.c ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_d(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.d
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.d ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_e(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.e
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.e ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_h(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.h
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.h ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_l(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.l
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.l ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_a(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.a
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.a ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SUBHL(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l))
    cpu.registers.a -= m
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val c = (cpu.registers.a ^ m ^ a) & 0x10
    if (c != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SUBn(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, (cpu.registers.pc))
    cpu.registers.a -= m
    cpu.registers.pc += 1
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val c = (cpu.registers.a ^ m ^ a) & 0x10
    if (c != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SBCr_b(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.b
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.b ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_c(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.c
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.c ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_d(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.d
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.d ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_e(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.e
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.e ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_h(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.h
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.h ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_l(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.l
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.l ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_a(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.a
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.a ^ a) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def SBCHL(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l))
    cpu.registers.a -= m
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val c = (cpu.registers.a ^ m ^ a) & 0x10
    if (c != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SBCn(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, (cpu.registers.pc))
    cpu.registers.a -= m
    cpu.registers.pc += 1
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    val c = (cpu.registers.a ^ m ^ a) & 0x10
    if (c != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def CPr_b(opcode: Int, cpu: Cpu) = {
    var i = cpu.registers.a
    i -= cpu.registers.b
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.b ^ i) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_c(opcode: Int, cpu: Cpu) = {
    var i = cpu.registers.a
    i -= cpu.registers.c
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    val x = (cpu.registers.a ^ cpu.registers.c ^ i) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_d(opcode: Int, cpu: Cpu) = {
    var i = cpu.registers.a
    i -= cpu.registers.d
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.d ^ i) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_e(opcode: Int, cpu: Cpu) = {
    var i = cpu.registers.a
    i -= cpu.registers.e
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.e ^ i) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_h(opcode: Int, cpu: Cpu) = {
    var i = cpu.registers.a
    i -= cpu.registers.h
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.h ^ i) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_l(opcode: Int, cpu: Cpu) = {
    var i = cpu.registers.a
    i -= cpu.registers.l
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.l ^ i) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_a(opcode: Int, cpu: Cpu) = {
    var i = cpu.registers.a
    i -= cpu.registers.a
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ cpu.registers.a ^ i) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 1
  }

  def CPHL(opcode: Int, cpu: Cpu) = {
    var i = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l))
    i -= m
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ i ^ m) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def CPn(opcode: Int, cpu: Cpu) = {
    var i = cpu.registers.a
    var m = cpu.memory.readByte8(cpu, (cpu.registers.pc))
    i -= m
    cpu.registers.pc += 1
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    val x = (cpu.registers.a ^ i ^ m) & 0x10
    if (x != 0) cpu.registers.f |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def DAA(opcode: Int, cpu: Cpu) = {
    var a = cpu.registers.a
    if (((cpu.registers.f & 0x20) != 0) || ((cpu.registers.a & 15) > 9)) cpu.registers.a += 6
    cpu.registers.f &= 0xEF
    if (((cpu.registers.f & 0x20) != 0) || (a > 0x99)) {
      cpu.registers.a += 0x60
      cpu.registers.f |= 0x10
    }
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_b(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= cpu.registers.b
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_c(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= cpu.registers.c
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_d(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= cpu.registers.d
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_e(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= cpu.registers.e
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_h(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= cpu.registers.h
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_l(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= cpu.registers.l
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= cpu.registers.a
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDHL(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def ANDn(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def ORr_b(opcode: Int, cpu: Cpu) = {
    cpu.registers.a |= cpu.registers.b
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_c(opcode: Int, cpu: Cpu) = {
    cpu.registers.a |= cpu.registers.c
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_d(opcode: Int, cpu: Cpu) = {
    cpu.registers.a |= cpu.registers.d
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_e(opcode: Int, cpu: Cpu) = {
    cpu.registers.a |= cpu.registers.e
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_h(opcode: Int, cpu: Cpu) = {
    cpu.registers.a |= cpu.registers.h
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_l(opcode: Int, cpu: Cpu) = {
    cpu.registers.a |= cpu.registers.l
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a |= cpu.registers.a
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORHL(opcode: Int, cpu: Cpu) = {
    cpu.registers.a |= cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def ORn(opcode: Int, cpu: Cpu) = {
    cpu.registers.a |= cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def XORr_b(opcode: Int, cpu: Cpu) = {
    cpu.registers.a ^= cpu.registers.b
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_c(opcode: Int, cpu: Cpu) = {
    cpu.registers.a ^= cpu.registers.c
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_d(opcode: Int, cpu: Cpu) = {
    cpu.registers.a ^= cpu.registers.d
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_e(opcode: Int, cpu: Cpu) = {
    cpu.registers.a ^= cpu.registers.e
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_h(opcode: Int, cpu: Cpu) = {
    cpu.registers.a ^= cpu.registers.h
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_l(opcode: Int, cpu: Cpu) = {
    cpu.registers.a ^= cpu.registers.l
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a ^= cpu.registers.a
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORHL(opcode: Int, cpu: Cpu) = {
    cpu.registers.a ^= cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def XORn(opcode: Int, cpu: Cpu) = {
    cpu.registers.a ^= cpu.memory.readByte8(cpu, cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def INCr_b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b += 1
    cpu.registers.b &= 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c += 1
    cpu.registers.c &= 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d += 1
    cpu.registers.d &= 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e += 1
    cpu.registers.e &= 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h += 1
    cpu.registers.h &= 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l += 1
    cpu.registers.l &= 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a += 1
    cpu.registers.a &= 255
    if (cpu.registers.f != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCHLm(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l) + 1
    i &= 255
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    if (i != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 3
  }

  def DECr_b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b -= 1
    cpu.registers.b &= 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c -= 1
    cpu.registers.c &= 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d -= 1
    cpu.registers.d &= 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e -= 1
    cpu.registers.e &= 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h -= 1
    cpu.registers.h &= 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l -= 1
    cpu.registers.l &= 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a -= 1
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECHLm(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l) - 1
    i &= 255
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    if (i != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 3
  }

  def INCBC(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = (cpu.registers.c + 1) & 255
    if (cpu.registers.c != 0) cpu.registers.b = (cpu.registers.b + 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def INCDE(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = (cpu.registers.e + 1) & 255
    if (cpu.registers.e != 0) cpu.registers.d = (cpu.registers.d + 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def INCHL(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = (cpu.registers.l + 1) & 255
    if (cpu.registers.l != 0) cpu.registers.h = (cpu.registers.h + 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def INCSP(opcode: Int, cpu: Cpu) = {
    cpu.registers.sp = (cpu.registers.sp + 1) & 65535
    cpu.registers.lastInstrClockm = 1
  }

  def DECBC(opcode: Int, cpu: Cpu) = {
    cpu.registers.c = (cpu.registers.c - 1) & 255
    if (cpu.registers.c == 255) cpu.registers.b = (cpu.registers.b - 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def DECDE(opcode: Int, cpu: Cpu) = {
    cpu.registers.e = (cpu.registers.e - 1) & 255
    if (cpu.registers.e == 255) cpu.registers.d = (cpu.registers.d - 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def DECHL(opcode: Int, cpu: Cpu) = {
    cpu.registers.l = (cpu.registers.l - 1) & 255
    if (cpu.registers.l == 255) cpu.registers.h = (cpu.registers.h - 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def DECSP(opcode: Int, cpu: Cpu) = {
    cpu.registers.sp = (cpu.registers.sp - 1) & 65535
    cpu.registers.lastInstrClockm = 1
  }

  def BIT0b(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0c(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0d(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0e(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0h(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0l(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0a(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0m(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if (cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l) & 0x01) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }
    cpu.registers.lastInstrClockm = 3
  }

  def RES0b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xFE
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET0b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0c(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0d(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0e(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0h(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0l(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0a(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x01
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT1b(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1c(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1d(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1e(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1h(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1l(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1a(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1m(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l) & 0x02) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }
    cpu.registers.lastInstrClockm = 3
  }

  def RES1b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xFD
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET1b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1c(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1d(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1e(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1h(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1l(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1a(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x02
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT2b(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2c(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2d(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2e(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2h(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2l(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2a(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2m(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if (cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l) & 0x04) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }

    cpu.registers.lastInstrClockm = 3
  }

  def RES2b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xFB
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET2b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2c(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2d(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2e(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2h(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2l(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2a(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x04
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT3b(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3c(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3d(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3e(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3h(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3l(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3a(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3m(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l) & 0x08) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }
    cpu.registers.lastInstrClockm = 3
  }

  def RES3b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xF7
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET3b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3c(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3d(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3e(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3h(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3l(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3a(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x08
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT4b(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4c(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4d(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4e(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4h(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4l(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4a(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4m(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l) & 0x10) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }

    cpu.registers.lastInstrClockm = 3
  }

  def RES4b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xEF
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET4b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4c(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4d(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4e(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4h(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4l(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4a(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x10
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT5b(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5c(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5d(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5e(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5h(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5l(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5a(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5m(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l) & 0x20) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }

    cpu.registers.lastInstrClockm = 3
  }

  def RES5b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xDF
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET5b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5c(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5d(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5e(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5h(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5l(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5a(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x20
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT6b(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6c(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6d(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6e(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6h(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6l(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6a(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6m(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l) & 0x40) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }
    cpu.registers.lastInstrClockm = 3
  }

  def RES6b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xBF
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET6b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6c(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6d(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6e(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6h(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6l(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6a(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x40
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT7b(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7c(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7d(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7e(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7h(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7l(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7a(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7m(opcode: Int, cpu: Cpu) = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(cpu, ((cpu.registers.h << 8) + cpu.registers.l) & 0x80) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }

    cpu.registers.lastInstrClockm = 3
  }

  def RES7b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7c(opcode: Int, cpu: Cpu) = {
    cpu.registers.c &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7d(opcode: Int, cpu: Cpu) = {
    cpu.registers.d &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7e(opcode: Int, cpu: Cpu) = {
    cpu.registers.e &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7h(opcode: Int, cpu: Cpu) = {
    cpu.registers.h &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7l(opcode: Int, cpu: Cpu) = {
    cpu.registers.l &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7a(opcode: Int, cpu: Cpu) = {
    cpu.registers.a &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i &= 0x7F
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET7b(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7c(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7d(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7e(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7h(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7l(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7a(opcode: Int, cpu: Cpu) = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7m(opcode: Int, cpu: Cpu) = {
    var i = cpu.memory.readByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x80
    cpu.memory.writeByte8(cpu, (cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  //  //TODO
  //  def JP_NN_C3(opcode: Int, cpu: Cpu) = {
  //    cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc, cpu)
  //  }
  //
  //  //TODO
  //  def LD_C_0E(opcode: Int, cpu: Cpu) = {
  //    cpu.registers.pc += 1
  //  }
  //
  //  //TODO
  //  def LD_NN_21(opcode: Int, cpu: Cpu) = {
  //    cpu.registers.pc += 2
  //  }
  //
  //  def NOP_00(opcode: Int, cpu: Cpu) = {
  //    cpu.registers.lastInstrClockm = 1
  //    cpu.registers.lastInstrClockt = 4
  //  }
  //
  //  //TODO
  //  def XOR_A_AF(opcode: Int, cpu: Cpu) = {
  //    cpu.registers.lastInstrClockm = 1
  //    cpu.registers.lastInstrClockt = 4
  //  }
  //

}