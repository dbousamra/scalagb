package gb

class Opcodes(cpu: Cpu) {

  def execute(opcode : Int) = opcode match {

    case 0x0 => NOP
    case 0x1 => LDBCnn
    case 0x2 => LDBCmA
    case 0x3 => INCBC
    case 0x4 => INCr_b
    case 0x5 => DECr_b
    case 0x6 => LDrn_b
    case 0x7 => RLCA
    case 0x8 => LDmmSP
    case 0x9 => ADDHLBC
    case 0xa => LDABCm
    case 0xb => DECBC
    case 0xc => INCr_c
    case 0xd => DECr_c
    case 0xe => LDrn_c
    case 0xf => RRCA
    case 0x10 => DJNZn
    case 0x11 => LDDEnn
    case 0x12 => LDDEmA
    case 0x13 => INCDE
    case 0x14 => INCr_d
    case 0x15 => DECr_d
    case 0x16 => LDrn_d
    case 0x17 => RLA
    case 0x18 => JRn
    case 0x19 => ADDHLDE
    case 0x1a => LDADEm
    case 0x1b => DECDE
    case 0x1c => INCr_e
    case 0x1d => DECr_e
    case 0x1e => LDrn_e
    case 0x1f => RRA
    case 0x20 => JRNZn
    case 0x21 => LDHLnn
    case 0x22 => LDHLIA
    case 0x23 => INCHL
    case 0x24 => INCr_h
    case 0x25 => DECr_h
    case 0x26 => LDrn_h
    case 0x27 => DAA
    case 0x28 => JRZn
    case 0x29 => ADDHLHL
    case 0x2a => LDAHLI
    case 0x2b => DECHL
    case 0x2c => INCr_l
    case 0x2d => DECr_l
    case 0x2e => LDrn_l
    case 0x2f => CPL
    case 0x30 => JRNCn
    case 0x31 => LDSPnn
    case 0x32 => LDHLDA
    case 0x33 => INCSP
    case 0x34 => INCHLm
    case 0x35 => DECHLm
    case 0x36 => LDHLmn
    case 0x37 => SCF
    case 0x38 => JRCn
    case 0x39 => ADDHLSP
    case 0x3a => LDAHLD
    case 0x3b => DECSP
    case 0x3c => INCr_a
    case 0x3d => DECr_a
    case 0x3e => LDrn_a
    case 0x3f => CCF
    case 0x40 => LDrr_bb
    case 0x41 => LDrr_bc
    case 0x42 => LDrr_bd
    case 0x43 => LDrr_be
    case 0x44 => LDrr_bh
    case 0x45 => LDrr_bl
    case 0x46 => LDrHLm_b
    case 0x47 => LDrr_ba
    case 0x48 => LDrr_cb
    case 0x49 => LDrr_cc
    case 0x4a => LDrr_cd
    case 0x4b => LDrr_ce
    case 0x4c => LDrr_ch
    case 0x4d => LDrr_cl
    case 0x4e => LDrHLm_c
    case 0x4f => LDrr_ca
    case 0x50 => LDrr_db
    case 0x51 => LDrr_dc
    case 0x52 => LDrr_dd
    case 0x53 => LDrr_de
    case 0x54 => LDrr_dh
    case 0x55 => LDrr_dl
    case 0x56 => LDrHLm_d
    case 0x57 => LDrr_da
    case 0x58 => LDrr_eb
    case 0x59 => LDrr_ec
    case 0x5a => LDrr_ed
    case 0x5b => LDrr_ee
    case 0x5c => LDrr_eh
    case 0x5d => LDrr_el
    case 0x5e => LDrHLm_e
    case 0x5f => LDrr_ea
    case 0x60 => LDrr_hb
    case 0x61 => LDrr_hc
    case 0x62 => LDrr_hd
    case 0x63 => LDrr_he
    case 0x64 => LDrr_hh
    case 0x65 => LDrr_hl
    case 0x66 => LDrHLm_h
    case 0x67 => LDrr_ha
    case 0x68 => LDrr_lb
    case 0x69 => LDrr_lc
    case 0x6a => LDrr_ld
    case 0x6b => LDrr_le
    case 0x6c => LDrr_lh
    case 0x6d => LDrr_ll
    case 0x6e => LDrHLm_l
    case 0x6f => LDrr_la
    case 0x70 => LDHLmr_b
    case 0x71 => LDHLmr_c
    case 0x72 => LDHLmr_d
    case 0x73 => LDHLmr_e
    case 0x74 => LDHLmr_h
    case 0x75 => LDHLmr_l
    case 0x76 => HALT
    case 0x77 => LDHLmr_a
    case 0x78 => LDrr_ab
    case 0x79 => LDrr_ac
    case 0x7a => LDrr_ad
    case 0x7b => LDrr_ae
    case 0x7c => LDrr_ah
    case 0x7d => LDrr_al
    case 0x7e => LDrHLm_a
    case 0x7f => LDrr_aa
    case 0x80 => ADDr_b
    case 0x81 => ADDr_c
    case 0x82 => ADDr_d
    case 0x83 => ADDr_e
    case 0x84 => ADDr_h
    case 0x85 => ADDr_l
    case 0x86 => ADDHL
    case 0x87 => ADDr_a
    case 0x88 => ADCr_b
    case 0x89 => ADCr_c
    case 0x8a => ADCr_d
    case 0x8b => ADCr_e
    case 0x8c => ADCr_h
    case 0x8d => ADCr_l
    case 0x8e => ADCHL
    case 0x8f => ADCr_a
    case 0x90 => SUBr_b
    case 0x91 => SUBr_c
    case 0x92 => SUBr_d
    case 0x93 => SUBr_e
    case 0x94 => SUBr_h
    case 0x95 => SUBr_l
    case 0x96 => SUBHL
    case 0x97 => SUBr_a
    case 0x98 => SBCr_b
    case 0x99 => SBCr_c
    case 0x9a => SBCr_d
    case 0x9b => SBCr_e
    case 0x9c => SBCr_h
    case 0x9d => SBCr_l
    case 0x9e => SBCHL
    case 0x9f => SBCr_a
    case 0xa0 => ANDr_b
    case 0xa1 => ANDr_c
    case 0xa2 => ANDr_d
    case 0xa3 => ANDr_e
    case 0xa4 => ANDr_h
    case 0xa5 => ANDr_l
    case 0xa6 => ANDHL
    case 0xa7 => ANDr_a
    case 0xa8 => XORr_b
    case 0xa9 => XORr_c
    case 0xaa => XORr_d
    case 0xab => XORr_e
    case 0xac => XORr_h
    case 0xad => XORr_l
    case 0xae => XORHL
    case 0xaf => XORr_a
    case 0xb0 => ORr_b
    case 0xb1 => ORr_c
    case 0xb2 => ORr_d
    case 0xb3 => ORr_e
    case 0xb4 => ORr_h
    case 0xb5 => ORr_l
    case 0xb6 => ORHL
    case 0xb7 => ORr_a
    case 0xb8 => CPr_b
    case 0xb9 => CPr_c
    case 0xba => CPr_d
    case 0xbb => CPr_e
    case 0xbc => CPr_h
    case 0xbd => CPr_l
    case 0xbe => CPHL
    case 0xbf => CPr_a
    case 0xc0 => RETNZ
    case 0xc1 => POPBC
    case 0xc2 => JPNZnn
    case 0xc3 => JPnn
    case 0xc4 => CALLNZnn
    case 0xc5 => PUSHBC
    case 0xc6 => ADDn
    case 0xc7 => RST00
    case 0xc8 => RETZ
    case 0xc9 => RET
    case 0xca => JPZnn
    case 0xcb => MAPcb
    case 0xcc => CALLZnn
    case 0xcd => CALLnn
    case 0xce => ADCn
    case 0xcf => RST08
    case 0xd0 => RETNC
    case 0xd1 => POPDE
    case 0xd2 => JPNCnn
    case 0xd3 => XX
    case 0xd4 => CALLNCnn
    case 0xd5 => PUSHDE
    case 0xd6 => SUBn
    case 0xd7 => RST10
    case 0xd8 => RETC
    case 0xd9 => RETI
    case 0xda => JPCnn
    case 0xdb => XX
    case 0xdc => CALLCnn
    case 0xdd => XX
    case 0xde => SBCn
    case 0xdf => RST18
    case 0xe0 => LDIOnA
    case 0xe1 => POPHL
    case 0xe2 => LDIOCA
    case 0xe3 => XX
    case 0xe4 => XX
    case 0xe5 => PUSHHL
    case 0xe6 => ANDn
    case 0xe7 => RST20
    case 0xe8 => ADDSPn
    case 0xe9 => JPHL
    case 0xea => LDmmA
    case 0xeb => XX
    case 0xec => XX
    case 0xed => XX
    case 0xee => XORn
    case 0xef => RST28
    case 0xf0 => LDAIOn
    case 0xf1 => POPAF
    case 0xf2 => LDAIOC
    case 0xf3 => DI
    case 0xf4 => XX
    case 0xf5 => PUSHAF
    case 0xf6 => ORn
    case 0xf7 => RST30
    case 0xf8 => LDHLSPn
    case 0xf9 => XX
    case 0xfa => LDAmm
    case 0xfb => EI
    case 0xfc => XX
    case 0xfd => XX
    case 0xfe => CPn
    case 0xff => RST38
  }
  
  def cb(opcode : Int) = opcode match {
    case 0x0 => RLCr_b
	case 0x1 => RLCr_c
	case 0x2 => RLCr_d
	case 0x3 => RLCr_e
	case 0x4 => RLCr_h
	case 0x5 => RLCr_l
	case 0x6 => RLCHL
	case 0x7 => RLCr_a
	case 0x8 => RRCr_b
	case 0x9 => RRCr_c
	case 0xa => RRCr_d
	case 0xb => RRCr_e
	case 0xc => RRCr_h
	case 0xd => RRCr_l
	case 0xe => RRCHL
	case 0xf => RRCr_a
	case 0x10 => RLr_b
	case 0x11 => RLr_c
	case 0x12 => RLr_d
	case 0x13 => RLr_e
	case 0x14 => RLr_h
	case 0x15 => RLr_l
	case 0x16 => RLHL
	case 0x17 => RLr_a
	case 0x18 => RRr_b
	case 0x19 => RRr_c
	case 0x1a => RRr_d
	case 0x1b => RRr_e
	case 0x1c => RRr_h
	case 0x1d => RRr_l
	case 0x1e => RRHL
	case 0x1f => RRr_a
	case 0x20 => SLAr_b
	case 0x21 => SLAr_c
	case 0x22 => SLAr_d
	case 0x23 => SLAr_e
	case 0x24 => SLAr_h
	case 0x25 => SLAr_l
	case 0x26 => XX
	case 0x27 => SLAr_a
	case 0x28 => SRAr_b
	case 0x29 => SRAr_c
	case 0x2a => SRAr_d
	case 0x2b => SRAr_e
	case 0x2c => SRAr_h
	case 0x2d => SRAr_l
	case 0x2e => XX
	case 0x2f => SRAr_a
	case 0x30 => SWAPr_b
	case 0x31 => SWAPr_c
	case 0x32 => SWAPr_d
	case 0x33 => SWAPr_e
	case 0x34 => SWAPr_h
	case 0x35 => SWAPr_l
	case 0x36 => XX
	case 0x37 => SWAPr_a
	case 0x38 => SRLr_b
	case 0x39 => SRLr_c
	case 0x3a => SRLr_d
	case 0x3b => SRLr_e
	case 0x3c => SRLr_h
	case 0x3d => SRLr_l
	case 0x3e => XX
	case 0x3f => SRLr_a
	case 0x40 => BIT0b
	case 0x41 => BIT0c
	case 0x42 => BIT0d
	case 0x43 => BIT0e
	case 0x44 => BIT0h
	case 0x45 => BIT0l
	case 0x46 => BIT0m
	case 0x47 => BIT0a
	case 0x48 => BIT1b
	case 0x49 => BIT1c
	case 0x4a => BIT1d
	case 0x4b => BIT1e
	case 0x4c => BIT1h
	case 0x4d => BIT1l
	case 0x4e => BIT1m
	case 0x4f => BIT1a
	case 0x50 => BIT2b
	case 0x51 => BIT2c
	case 0x52 => BIT2d
	case 0x53 => BIT2e
	case 0x54 => BIT2h
	case 0x55 => BIT2l
	case 0x56 => BIT2m
	case 0x57 => BIT2a
	case 0x58 => BIT3b
	case 0x59 => BIT3c
	case 0x5a => BIT3d
	case 0x5b => BIT3e
	case 0x5c => BIT3h
	case 0x5d => BIT3l
	case 0x5e => BIT3m
	case 0x5f => BIT3a
	case 0x60 => BIT4b
	case 0x61 => BIT4c
	case 0x62 => BIT4d
	case 0x63 => BIT4e
	case 0x64 => BIT4h
	case 0x65 => BIT4l
	case 0x66 => BIT4m
	case 0x67 => BIT4a
	case 0x68 => BIT5b
	case 0x69 => BIT5c
	case 0x6a => BIT5d
	case 0x6b => BIT5e
	case 0x6c => BIT5h
	case 0x6d => BIT5l
	case 0x6e => BIT5m
	case 0x6f => BIT5a
	case 0x70 => BIT6b
	case 0x71 => BIT6c
	case 0x72 => BIT6d
	case 0x73 => BIT6e
	case 0x74 => BIT6h
	case 0x75 => BIT6l
	case 0x76 => BIT6m
	case 0x77 => BIT6a
	case 0x78 => BIT7b
	case 0x79 => BIT7c
	case 0x7a => BIT7d
	case 0x7b => BIT7e
	case 0x7c => BIT7h
	case 0x7d => BIT7l
	case 0x7e => BIT7m
	case 0x7f => BIT7a
	case 0x80 => RES0b
	case 0x81 => RES0c
	case 0x82 => RES0d
	case 0x83 => RES0e
	case 0x84 => RES0h
	case 0x85 => RES0l
	case 0x86 => RES0m
	case 0x87 => RES0a
	case 0x88 => RES1b
	case 0x89 => RES1c
	case 0x8a => RES1d
	case 0x8b => RES1e
	case 0x8c => RES1h
	case 0x8d => RES1l
	case 0x8e => RES1m
	case 0x8f => RES1a
	case 0x90 => RES2b
	case 0x91 => RES2c
	case 0x92 => RES2d
	case 0x93 => RES2e
	case 0x94 => RES2h
	case 0x95 => RES2l
	case 0x96 => RES2m
	case 0x97 => RES2a
	case 0x98 => RES3b
	case 0x99 => RES3c
	case 0x9a => RES3d
	case 0x9b => RES3e
	case 0x9c => RES3h
	case 0x9d => RES3l
	case 0x9e => RES3m
	case 0x9f => RES3a
	case 0xa0 => RES4b
	case 0xa1 => RES4c
	case 0xa2 => RES4d
	case 0xa3 => RES4e
	case 0xa4 => RES4h
	case 0xa5 => RES4l
	case 0xa6 => RES4m
	case 0xa7 => RES4a
	case 0xa8 => RES5b
	case 0xa9 => RES5c
	case 0xaa => RES5d
	case 0xab => RES5e
	case 0xac => RES5h
	case 0xad => RES5l
	case 0xae => RES5m
	case 0xaf => RES5a
	case 0xb0 => RES6b
	case 0xb1 => RES6c
	case 0xb2 => RES6d
	case 0xb3 => RES6e
	case 0xb4 => RES6h
	case 0xb5 => RES6l
	case 0xb6 => RES6m
	case 0xb7 => RES6a
	case 0xb8 => RES7b
	case 0xb9 => RES7c
	case 0xba => RES7d
	case 0xbb => RES7e
	case 0xbc => RES7h
	case 0xbd => RES7l
	case 0xbe => RES7m
	case 0xbf => RES7a
	case 0xc0 => SET0b
	case 0xc1 => SET0c
	case 0xc2 => SET0d
	case 0xc3 => SET0e
	case 0xc4 => SET0h
	case 0xc5 => SET0l
	case 0xc6 => SET0m
	case 0xc7 => SET0a
	case 0xc8 => SET1b
	case 0xc9 => SET1c
	case 0xca => SET1d
	case 0xcb => SET1e
	case 0xcc => SET1h
	case 0xcd => SET1l
	case 0xce => SET1m
	case 0xcf => SET1a
	case 0xd0 => SET2b
	case 0xd1 => SET2c
	case 0xd2 => SET2d
	case 0xd3 => SET2e
	case 0xd4 => SET2h
	case 0xd5 => SET2l
	case 0xd6 => SET2m
	case 0xd7 => SET2a
	case 0xd8 => SET3b
	case 0xd9 => SET3c
	case 0xda => SET3d
	case 0xdb => SET3e
	case 0xdc => SET3h
	case 0xdd => SET3l
	case 0xde => SET3m
	case 0xdf => SET3a
	case 0xe0 => SET4b
	case 0xe1 => SET4c
	case 0xe2 => SET4d
	case 0xe3 => SET4e
	case 0xe4 => SET4h
	case 0xe5 => SET4l
	case 0xe6 => SET4m
	case 0xe7 => SET4a
	case 0xe8 => SET5b
	case 0xe9 => SET5c
	case 0xea => SET5d
	case 0xeb => SET5e
	case 0xec => SET5h
	case 0xed => SET5l
	case 0xee => SET5m
	case 0xef => SET5a
	case 0xf0 => SET6b
	case 0xf1 => SET6c
	case 0xf2 => SET6d
	case 0xf3 => SET6e
	case 0xf4 => SET6h
	case 0xf5 => SET6l
	case 0xf6 => SET6m
	case 0xf7 => SET6a
	case 0xf8 => SET7b
	case 0xf9 => SET7c
	case 0xfa => SET7d
	case 0xfb => SET7e
	case 0xfc => SET7h
	case 0xfd => SET7l
	case 0xfe => SET7m
	case 0xff => SET7a
	  }
  
  def XX() = {
    println("No instruction found")
  }

  def NOP() = {
 cpu.registers.lastInstrClockm=1
}

  def HALT() = {
 cpu.registers.halt=1; cpu.registers.lastInstrClockm=1
}


  def DI() = {
 cpu.registers.ime=0; cpu.registers.lastInstrClockm=1
}

  def EI() = {
 cpu.registers.ime=1; cpu.registers.lastInstrClockm=1
}


  def LDrr_bb() = {

    cpu.registers.b = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1;
  }

  def LDrr_bc() = {
    cpu.registers.b = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_bd() = {
    cpu.registers.b = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_be() = {
    cpu.registers.b = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_bh() = {
    cpu.registers.b = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_bl() = {
    cpu.registers.b = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }
  
  

  def LDrr_ba() = {
    cpu.registers.b = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_cb() = {
    cpu.registers.c = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_cc() = {
    cpu.registers.c = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_cd() = {
    cpu.registers.c = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ce() = {
    cpu.registers.c = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ch() = {
    cpu.registers.c = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_cl() = {
    cpu.registers.c = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ca() = {
    cpu.registers.c = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_db() = {
    cpu.registers.d = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_dc() = {
    cpu.registers.d = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_dd() = {
    cpu.registers.d = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_de() = {
    cpu.registers.d = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_dh() = {
    cpu.registers.d = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_dl() = {
    cpu.registers.d = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_da() = {
    cpu.registers.d = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_eb() = {
    cpu.registers.e = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ec() = {
    cpu.registers.e = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  
  
  def LDrr_ed() = {
    cpu.registers.e = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ee() = {
    cpu.registers.e = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_eh() = {
    cpu.registers.e = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_el() = {
    cpu.registers.e = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ea() = {
    cpu.registers.e = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hb() = {
    cpu.registers.h = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hc() = {
    cpu.registers.h = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hd() = {
    cpu.registers.h = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_he() = {
    cpu.registers.h = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hh() = {
    cpu.registers.h = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_hl() = {
    cpu.registers.h = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ha() = {
    cpu.registers.h = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_lb() = {
    cpu.registers.l = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_lc() = {
    cpu.registers.l = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ld() = {
    cpu.registers.l = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_le() = {
    cpu.registers.l = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_lh() = {
    cpu.registers.l = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ll() = {
    cpu.registers.l = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_la() = {
    cpu.registers.l = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ab() = {
    cpu.registers.a = cpu.registers.b;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ac() = {
    cpu.registers.a = cpu.registers.c;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ad() = {
    cpu.registers.a = cpu.registers.d;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ae() = {
    cpu.registers.a = cpu.registers.e;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_ah() = {
    cpu.registers.a = cpu.registers.h;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_al() = {
    cpu.registers.a = cpu.registers.l;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrr_aa() = {
    cpu.registers.a = cpu.registers.a;
    cpu.registers.lastInstrClockm = 1
  }

  def LDrHLm_b() = {
    cpu.registers.b = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_c() = {
    cpu.registers.c = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_d() = {
    cpu.registers.d = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_e() = {
    cpu.registers.e = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_h() = {
    cpu.registers.h = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_l() = {
    cpu.registers.l = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrHLm_a() = {
    cpu.registers.a = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_b() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.registers.b)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_c() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.registers.c)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_d() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.registers.d)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_e() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.registers.e)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_h() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.registers.h)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_l() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.registers.l)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmr_a() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.registers.a)
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_b() = {
    cpu.registers.b = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_c() = {
    cpu.registers.c = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_d() = {
    cpu.registers.d = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_e() = {
    cpu.registers.e = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_h() = {
    cpu.registers.h = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_l() = {
    cpu.registers.l = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDrn_a() = {
    cpu.registers.a = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLmn() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.memory.readByte8(cpu.registers.pc))
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 3
  }

  def LDBCmA() = {
    cpu.memory.writeByte8((cpu.registers.b << 8) + cpu.registers.c, cpu.registers.a)
    cpu.registers.lastInstrClockm = 2
  }

  def LDDEmA() = {
    cpu.memory.writeByte8((cpu.registers.d << 8) + cpu.registers.e, cpu.registers.a)
    cpu.registers.lastInstrClockm = 2
  }

  def LDmmA() = {
    cpu.memory.writeByte8(cpu.memory.readByte16(cpu.registers.pc), cpu.registers.a)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 4
  }
  
  //TODO: PROBABLY INCORRECT
  def LDmmSP() = {
    cpu.memory.writeByte8(cpu.memory.readByte16(cpu.registers.pc), cpu.registers.sp)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 4
  }
  

  def LDABCm() = {
    cpu.registers.a = cpu.memory.readByte8((cpu.registers.b << 8) + cpu.registers.c)
    cpu.registers.lastInstrClockm = 2
  }

  def LDADEm() = {
    cpu.registers.a = cpu.memory.readByte8((cpu.registers.d << 8) + cpu.registers.e)
    cpu.registers.lastInstrClockm = 2
  }

  def LDAmm() = {
    cpu.registers.a = cpu.memory.readByte8(cpu.memory.readByte16(cpu.registers.pc))
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 4
  }

  def LDBCnn() = {
    cpu.registers.c = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.b = cpu.memory.readByte8(cpu.registers.pc + 1)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 3
  }

  def LDDEnn() = {
    cpu.registers.e = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.d = cpu.memory.readByte8(cpu.registers.pc + 1)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 3
  }

  def LDHLnn() = {
    cpu.registers.l = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.h = cpu.memory.readByte8(cpu.registers.pc + 1)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 3
  }

  def LDSPnn() = {
    cpu.registers.sp = cpu.memory.readByte16(cpu.registers.pc)
    cpu.registers.pc += 2
    cpu.registers.lastInstrClockm = 3
  }

  def LDHLmm() = {
    var i = cpu.memory.readByte16(cpu.registers.pc)
    cpu.registers.pc += 2
    cpu.registers.l = cpu.memory.readByte8(i)
    cpu.registers.h = cpu.memory.readByte8(i + 1)
    cpu.registers.lastInstrClockm = 5
  }

  def LDmmHL() = {
    var i = cpu.memory.readByte16(cpu.registers.pc)
    cpu.registers.pc += 2
    cpu.memory.writeByte16(i, (cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.lastInstrClockm = 5
  }

  def LDHLIA() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.registers.a)
    cpu.registers.l = (cpu.registers.l + 1) & 255
    if (cpu.registers.l != 0) cpu.registers.h = (cpu.registers.h + 1) & 255
    cpu.registers.lastInstrClockm = 2
  }

  def LDAHLI() = {
    cpu.registers.a = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.l = (cpu.registers.l + 1) & 255
    if (cpu.registers.l != 0) cpu.registers.h = (cpu.registers.h + 1) & 255
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLDA() = {
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, cpu.registers.a)
    cpu.registers.l = (cpu.registers.l - 1) & 255
    if (cpu.registers.l == 255) cpu.registers.h = (cpu.registers.h - 1) & 255
    cpu.registers.lastInstrClockm = 2
  }

  def LDAHLD() = {
    cpu.registers.a = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.l = (cpu.registers.l - 1) & 255
    if (cpu.registers.l == 255) cpu.registers.h = (cpu.registers.h - 1) & 255
    cpu.registers.lastInstrClockm = 2
  }

  def LDAIOn() = {
    cpu.registers.a = cpu.memory.readByte8(0xFF00 + cpu.memory.readByte8(cpu.registers.pc))
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 3
  }

  def LDIOnA() = {
    cpu.memory.writeByte8(0xFF00 + cpu.memory.readByte8(cpu.registers.pc), cpu.registers.a)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 3
  }

  def LDAIOC() = {
    cpu.registers.a = cpu.memory.readByte8(0xFF00 + cpu.registers.c)
    cpu.registers.lastInstrClockm = 2
  }

  def LDIOCA() = {
    cpu.memory.writeByte8(0xFF00 + cpu.registers.c, cpu.registers.a)
    cpu.registers.lastInstrClockm = 2
  }

  def LDHLSPn() = {
    var i = cpu.memory.readByte8(cpu.registers.pc)
    if (i > 127) i = -((~i + 1) & 255)
    cpu.registers.pc += 1
    i += cpu.registers.sp
    cpu.registers.h = (i >> 8) & 255
    cpu.registers.l = i & 255
    cpu.registers.unsetFlag("ZERO")
    cpu.registers.unsetFlag("SUB")
    if(cpu.registers.carryOccurred(cpu.registers.sp)) cpu.registers.setFlag("CARRY")
    if(cpu.registers.carryOccurred(cpu.registers.sp)) cpu.registers.setFlag("CARRY")
    cpu.registers.lastInstrClockm = 3
  }

  def SWAPr_b() = {
    var tr = cpu.registers.b
    cpu.registers.b = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_c() = {
    var tr = cpu.registers.c
    cpu.registers.c = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_d() = {
    var tr = cpu.registers.d
    cpu.registers.d = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_e() = {
    var tr = cpu.registers.e
    cpu.registers.e = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_h() = {
    var tr = cpu.registers.h
    cpu.registers.h = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_l() = {
    var tr = cpu.registers.l
    cpu.registers.l = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def SWAPr_a() = {
    var tr = cpu.registers.a
    cpu.registers.a = ((tr & 0xF) << 4) | ((tr & 0xF0) >> 4)
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_b() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.b
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.b)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_c() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.c
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.c)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_d() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.d
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.d)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_e() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.e
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.e)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_h() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.h
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.h)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_l() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.l
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.l)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADDr_a() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.a
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADDHL() = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l))
    cpu.registers.a += m
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, m, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def ADDn() = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.a += m
    cpu.registers.pc += 1
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, m, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def ADDHLBC() = {
    var hl = (cpu.registers.h << 8) + cpu.registers.l
    hl += (cpu.registers.b << 8) + cpu.registers.c
    if (hl > 65535) cpu.registers.f |= 0x10
    else cpu.registers.f &= 0xEF
    cpu.registers.h = (hl >> 8) & 255
    cpu.registers.l = hl & 255
    cpu.registers.lastInstrClockm = 3
  }

  def ADDHLDE() = {
    var hl = (cpu.registers.h << 8) + cpu.registers.l
    hl += (cpu.registers.d << 8) + cpu.registers.e
    if (hl > 65535) cpu.registers.f |= 0x10
    else cpu.registers.f &= 0xEF
    cpu.registers.h = (hl >> 8) & 255
    cpu.registers.l = hl & 255
    cpu.registers.lastInstrClockm = 3
  }

  def ADDHLHL() = {
    var hl = (cpu.registers.h << 8) + cpu.registers.l
    hl += (cpu.registers.h << 8) + cpu.registers.l
    if (hl > 65535) cpu.registers.f |= 0x10
    else cpu.registers.f &= 0xEF
    cpu.registers.h = (hl >> 8) & 255
    cpu.registers.l = hl & 255
    cpu.registers.lastInstrClockm = 3
  }

  def ADDHLSP() = {
    var hl = (cpu.registers.h << 8) + cpu.registers.l
    hl += cpu.registers.sp
    if (hl > 65535) cpu.registers.f |= 0x10
    else cpu.registers.f &= 0xEF
    cpu.registers.h = (hl >> 8) & 255
    cpu.registers.l = hl & 255
    cpu.registers.lastInstrClockm = 3
  }

  def ADDSPn() = {
    var i = cpu.memory.readByte8((cpu.registers.pc))
    
    if (i > 0x7F) i -= 0x100 
    cpu.registers.pc += 1
    cpu.registers.sp += i
    
//    cpu.registers.unsetFlag("ZERO")
//    cpu.registers.unsetFlag("SUB")
//    if (cpu.registers.carryOccurred(cpu.registers.sp)) cpu.registers.setFlag("CARRY")
//    if(())
//    cpu.registers.lastInstrClockm = 4
  }

  def ADCr_b() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.b
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    //cpu.registers.f=(cpu.registers.a>255)?0x10:0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.b)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_c() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.c
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.b)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_d() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.d
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.d)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_e() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.e
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.e)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_h() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.h
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.h)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_l() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.l
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.l)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADCr_a() = {
    var a = cpu.registers.a
    cpu.registers.a += cpu.registers.a
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def ADCHL() = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l))
    cpu.registers.a += m
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, m, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def ADCn() = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8((cpu.registers.pc))
    cpu.registers.a += m
    cpu.registers.pc += 1
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a += 1 else cpu.registers.a += 0
    if (cpu.registers.a > 255) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, m, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def SUBr_b() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.b
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.b)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_c() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.c
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.c)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_d() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.d
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.d)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_e() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.e
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.e)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_h() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.h
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.h)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SUBr_l() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.l
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.l)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }
 
  def SUBr_a() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.a
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.zeroOccurred(cpu.registers.a)) cpu.registers.setFlag("ZERO")
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    
    cpu.registers.lastInstrClockm = 1
  }
  
  def SUBHL() = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l))
    cpu.registers.a -= m
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, m, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def SUBn() = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8((cpu.registers.pc))
    cpu.registers.a -= m
    cpu.registers.pc += 1
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, m, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def SBCr_b() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.b
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.b)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_c() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.c
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.c)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_d() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.d
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.d)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_e() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.e
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.e)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_h() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.h
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.h)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_l() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.l
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.l)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SBCr_a() = {
    var a = cpu.registers.a
    cpu.registers.a -= cpu.registers.a
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, cpu.registers.a, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def SBCHL() = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l))
    cpu.registers.a -= m
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, m, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def SBCn() = {
    var a = cpu.registers.a
    var m = cpu.memory.readByte8((cpu.registers.pc))
    cpu.registers.a -= m
    cpu.registers.pc += 1
    if ((cpu.registers.f & 0x10) != 0) cpu.registers.a -= 1 else cpu.registers.a -= 0
    if (cpu.registers.a < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40

    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(a, m, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def CPr_b() = {
    var i = cpu.registers.a
    i -= cpu.registers.b
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(i, cpu.registers.a, cpu.registers.b)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_c() = {
    var i = cpu.registers.a
    i -= cpu.registers.c
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(i, cpu.registers.a, cpu.registers.c)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_d() = {
    var i = cpu.registers.a
    i -= cpu.registers.d
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(i, cpu.registers.a, cpu.registers.d)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_e() = {
    var i = cpu.registers.a
    i -= cpu.registers.e
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(i, cpu.registers.a, cpu.registers.e)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_h() = {
    var i = cpu.registers.a
    i -= cpu.registers.h
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(i, cpu.registers.a, cpu.registers.h)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_l() = {
    var i = cpu.registers.a
    i -= cpu.registers.l
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(i, cpu.registers.a, cpu.registers.l)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def CPr_a() = {
    var i = cpu.registers.a
    i -= cpu.registers.a
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(i, cpu.registers.a, cpu.registers.a)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 1
  }

  def CPHL() = {
    var i = cpu.registers.a
    var m = cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l))
    i -= m
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(i, cpu.registers.a, m)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def CPn() = {
    var i = cpu.registers.a
    var m = cpu.memory.readByte8((cpu.registers.pc))
    i -= m
    cpu.registers.pc += 1
    if (i < 0) cpu.registers.f = 0x50 else cpu.registers.f = 0x40
    i &= 255
    if (i != 0) cpu.registers.f |= 0x80
    if(cpu.registers.halfCarryOccurred(i, cpu.registers.a, m)) cpu.registers.setFlag("HALFCARRY")
    cpu.registers.lastInstrClockm = 2
  }

  def DAA() = {
    var a = cpu.registers.a
    if (((cpu.registers.f & 0x20) != 0) || ((cpu.registers.a & 15) > 9)) cpu.registers.a += 6
    cpu.registers.f &= 0xEF
    if (((cpu.registers.f & 0x20) != 0) || (a > 0x99)) {
      cpu.registers.a += 0x60
      cpu.registers.f |= 0x10
    }
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_b() = {
    cpu.registers.a &= cpu.registers.b
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_c() = {
    cpu.registers.a &= cpu.registers.c
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_d() = {
    cpu.registers.a &= cpu.registers.d
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_e() = {
    cpu.registers.a &= cpu.registers.e
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_h() = {
    cpu.registers.a &= cpu.registers.h
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_l() = {
    cpu.registers.a &= cpu.registers.l
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDr_a() = {
    cpu.registers.a &= cpu.registers.a
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ANDHL() = {
    cpu.registers.a &= cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def ANDn() = {
    cpu.registers.a &= cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def ORr_b() = {
    cpu.registers.a |= cpu.registers.b
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_c() = {
    cpu.registers.a |= cpu.registers.c
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_d() = {
    cpu.registers.a |= cpu.registers.d
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_e() = {
    cpu.registers.a |= cpu.registers.e
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_h() = {
    cpu.registers.a |= cpu.registers.h
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_l() = {
    cpu.registers.a |= cpu.registers.l
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORr_a() = {
    cpu.registers.a |= cpu.registers.a
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def ORHL() = {
    cpu.registers.a |= cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def ORn() = {
    cpu.registers.a |= cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def XORr_b() = {
    cpu.registers.a ^= cpu.registers.b
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_c() = {
    cpu.registers.a ^= cpu.registers.c
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_d() = {
    cpu.registers.a ^= cpu.registers.d
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_e() = {
    cpu.registers.a ^= cpu.registers.e
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_h() = {
    cpu.registers.a ^= cpu.registers.h
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_l() = {
    cpu.registers.a ^= cpu.registers.l
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORr_a() = {
    cpu.registers.a ^= cpu.registers.a
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def XORHL() = {
    cpu.registers.a ^= cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def XORn() = {
    cpu.registers.a ^= cpu.memory.readByte8(cpu.registers.pc)
    cpu.registers.pc += 1
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def INCr_b() = {
    cpu.registers.b += 1
    cpu.registers.b &= 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_c() = {
    cpu.registers.c += 1
    cpu.registers.c &= 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_d() = {
    cpu.registers.d += 1
    cpu.registers.d &= 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_e() = {
    cpu.registers.e += 1
    cpu.registers.e &= 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_h() = {
    cpu.registers.h += 1
    cpu.registers.h &= 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_l() = {
    cpu.registers.l += 1
    cpu.registers.l &= 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCr_a() = {
    cpu.registers.a += 1
    cpu.registers.a &= 255
    if (cpu.registers.f != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def INCHLm() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l) + 1
    i &= 255
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    if (i != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 3
  }

  def DECr_b() = {
    cpu.registers.b -= 1
    cpu.registers.b &= 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_c() = {
    cpu.registers.c -= 1
    cpu.registers.c &= 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_d() = {
    cpu.registers.d -= 1
    cpu.registers.d &= 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_e() = {
    cpu.registers.e -= 1
    cpu.registers.e &= 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_h() = {
    cpu.registers.h -= 1
    cpu.registers.h &= 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_l() = {
    cpu.registers.l -= 1
    cpu.registers.l &= 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECr_a() = {
    cpu.registers.a -= 1
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }
  def DECHLm() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l) - 1
    i &= 255
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    if (i != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 3
  }

  def INCBC() = {
    cpu.registers.c = (cpu.registers.c + 1) & 255
    if (cpu.registers.c != 0) cpu.registers.b = (cpu.registers.b + 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def INCDE() = {
    cpu.registers.e = (cpu.registers.e + 1) & 255
    if (cpu.registers.e != 0) cpu.registers.d = (cpu.registers.d + 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def INCHL() = {
    cpu.registers.l = (cpu.registers.l + 1) & 255
    if (cpu.registers.l != 0) cpu.registers.h = (cpu.registers.h + 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def INCSP() = {
    cpu.registers.sp = (cpu.registers.sp + 1) & 65535
    cpu.registers.lastInstrClockm = 1
  }

  def DECBC() = {
    cpu.registers.c = (cpu.registers.c - 1) & 255
    if (cpu.registers.c == 255) cpu.registers.b = (cpu.registers.b - 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def DECDE() = {
    cpu.registers.e = (cpu.registers.e - 1) & 255
    if (cpu.registers.e == 255) cpu.registers.d = (cpu.registers.d - 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def DECHL() = {
    cpu.registers.l = (cpu.registers.l - 1) & 255
    if (cpu.registers.l == 255) cpu.registers.h = (cpu.registers.h - 1) & 255
    cpu.registers.lastInstrClockm = 1
  }
  def DECSP() = {
    cpu.registers.sp = (cpu.registers.sp - 1) & 65535
    cpu.registers.lastInstrClockm = 1
  }

  def BIT0b() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0c() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0d() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0e() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0h() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0l() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0a() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x01) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT0m() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if (cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l) & 0x01) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }
    cpu.registers.lastInstrClockm = 3
  }

  def RES0b() = {
    cpu.registers.b &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0c() = {
    cpu.registers.c &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0d() = {
    cpu.registers.d &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0e() = {
    cpu.registers.e &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0h() = {
    cpu.registers.h &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0l() = {
    cpu.registers.l &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0a() = {
    cpu.registers.a &= 0xFE
    cpu.registers.lastInstrClockm = 2
  }

  def RES0m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xFE
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET0b() = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0c() = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0d() = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0e() = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0h() = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0l() = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0a() = {
    cpu.registers.b |= 0x01
    cpu.registers.lastInstrClockm = 2
  }

  def SET0m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x01
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT1b() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1c() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1d() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1e() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1h() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1l() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1a() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x02) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT1m() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l) & 0x02) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }
    cpu.registers.lastInstrClockm = 3
  }

  def RES1b() = {
    cpu.registers.b &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1c() = {
    cpu.registers.c &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1d() = {
    cpu.registers.d &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1e() = {
    cpu.registers.e &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1h() = {
    cpu.registers.h &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1l() = {
    cpu.registers.l &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1a() = {
    cpu.registers.a &= 0xFD
    cpu.registers.lastInstrClockm = 2
  }

  def RES1m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xFD
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET1b() = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1c() = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1d() = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1e() = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1h() = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1l() = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1a() = {
    cpu.registers.b |= 0x02
    cpu.registers.lastInstrClockm = 2
  }

  def SET1m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x02
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT2b() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2c() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2d() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2e() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2h() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2l() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2a() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x04) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT2m() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if (cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l) & 0x04) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }

    cpu.registers.lastInstrClockm = 3
  }

  def RES2b() = {
    cpu.registers.b &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2c() = {
    cpu.registers.c &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2d() = {
    cpu.registers.d &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2e() = {
    cpu.registers.e &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2h() = {
    cpu.registers.h &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2l() = {
    cpu.registers.l &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2a() = {
    cpu.registers.a &= 0xFB
    cpu.registers.lastInstrClockm = 2
  }

  def RES2m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xFB
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET2b() = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2c() = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2d() = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2e() = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2h() = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2l() = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2a() = {
    cpu.registers.b |= 0x04
    cpu.registers.lastInstrClockm = 2
  }

  def SET2m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x04
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT3b() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3c() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3d() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3e() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3h() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3l() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3a() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x08) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT3m() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l) & 0x08) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }
    cpu.registers.lastInstrClockm = 3
  }

  def RES3b() = {
    cpu.registers.b &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3c() = {
    cpu.registers.c &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3d() = {
    cpu.registers.d &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3e() = {
    cpu.registers.e &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3h() = {
    cpu.registers.h &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3l() = {
    cpu.registers.l &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3a() = {
    cpu.registers.a &= 0xF7
    cpu.registers.lastInstrClockm = 2
  }

  def RES3m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xF7
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET3b() = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3c() = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3d() = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3e() = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3h() = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3l() = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3a() = {
    cpu.registers.b |= 0x08
    cpu.registers.lastInstrClockm = 2
  }

  def SET3m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x08
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT4b() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4c() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4d() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4e() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4h() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4l() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4a() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x10) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT4m() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l) & 0x10) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }

    cpu.registers.lastInstrClockm = 3
  }

  def RES4b() = {
    cpu.registers.b &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4c() = {
    cpu.registers.c &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4d() = {
    cpu.registers.d &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4e() = {
    cpu.registers.e &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4h() = {
    cpu.registers.h &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4l() = {
    cpu.registers.l &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4a() = {
    cpu.registers.a &= 0xEF
    cpu.registers.lastInstrClockm = 2
  }

  def RES4m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xEF
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET4b() = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4c() = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4d() = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4e() = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4h() = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4l() = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4a() = {
    cpu.registers.b |= 0x10
    cpu.registers.lastInstrClockm = 2
  }

  def SET4m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x10
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT5b() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5c() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5d() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5e() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5h() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5l() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5a() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x20) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT5m() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l) & 0x20) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }

    cpu.registers.lastInstrClockm = 3
  }

  def RES5b() = {
    cpu.registers.b &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5c() = {
    cpu.registers.c &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5d() = {
    cpu.registers.d &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5e() = {
    cpu.registers.e &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5h() = {
    cpu.registers.h &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5l() = {
    cpu.registers.l &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5a() = {
    cpu.registers.a &= 0xDF
    cpu.registers.lastInstrClockm = 2
  }

  def RES5m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xDF
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET5b() = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5c() = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5d() = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5e() = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5h() = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5l() = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5a() = {
    cpu.registers.b |= 0x20
    cpu.registers.lastInstrClockm = 2
  }

  def SET5m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x20
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT6b() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6c() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6d() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6e() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6h() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6l() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6a() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x40) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT6m() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l) & 0x40) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }
    cpu.registers.lastInstrClockm = 3
  }

  def RES6b() = {
    cpu.registers.b &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6c() = {
    cpu.registers.c &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6d() = {
    cpu.registers.d &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6e() = {
    cpu.registers.e &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6h() = {
    cpu.registers.h &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6l() = {
    cpu.registers.l &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6a() = {
    cpu.registers.a &= 0xBF
    cpu.registers.lastInstrClockm = 2
  }

  def RES6m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i &= 0xBF
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET6b() = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6c() = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6d() = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6e() = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6h() = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6l() = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6a() = {
    cpu.registers.b |= 0x40
    cpu.registers.lastInstrClockm = 2
  }

  def SET6m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x40
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def BIT7b() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.b & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7c() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.c & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7d() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.d & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7e() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.e & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7h() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.h & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7l() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.l & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7a() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20
    if ((cpu.registers.a & 0x80) != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def BIT7m() = {
    cpu.registers.f &= 0x1F
    cpu.registers.f |= 0x20

    if (cpu.memory.readByte8(((cpu.registers.h << 8) + cpu.registers.l) & 0x80) != 0) {
      cpu.registers.f = 0
    } else {
      cpu.registers.f = 0x80
    }

    cpu.registers.lastInstrClockm = 3
  }

  def RES7b() = {
    cpu.registers.b &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7c() = {
    cpu.registers.c &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7d() = {
    cpu.registers.d &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7e() = {
    cpu.registers.e &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7h() = {
    cpu.registers.h &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7l() = {
    cpu.registers.l &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7a() = {
    cpu.registers.a &= 0x7F
    cpu.registers.lastInstrClockm = 2
  }

  def RES7m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i &= 0x7F
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def SET7b() = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7c() = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7d() = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7e() = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7h() = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7l() = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7a() = {
    cpu.registers.b |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def SET7m() = {
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    i |= 0x80
    cpu.memory.writeByte8((cpu.registers.h << 8) + cpu.registers.l, i)
    cpu.registers.lastInstrClockm = 4
  }

  def JPnn() = {
    cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
    cpu.registers.lastInstrClockm = 3;
  }

  def JPHL() = {
    cpu.registers.pc = (cpu.registers.h << 8) + cpu.registers.l
    cpu.registers.lastInstrClockm = 1
  }

  def JPNZnn() = {
    cpu.registers.lastInstrClockm = 3

    if ((cpu.registers.f & 0x80) == 0x00) {
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
      cpu.registers.lastInstrClockm += 1
    } else cpu.registers.pc += 2
  }

  def JPZnn() = {
    cpu.registers.lastInstrClockm = 3
    if ((cpu.registers.f & 0x80) == 0x80) {
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
      cpu.registers.lastInstrClockm += 1
    } else cpu.registers.pc += 2
  }

  def JPNCnn() = {
    cpu.registers.lastInstrClockm = 3
    if ((cpu.registers.f & 0x10) == 0x00) {
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
      cpu.registers.lastInstrClockm += 1
    } else cpu.registers.pc += 2
  }

  def JPCnn() = {
    cpu.registers.lastInstrClockm = 3
    if ((cpu.registers.f & 0x10) == 0x10) {
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
      cpu.registers.lastInstrClockm += 1
    } else cpu.registers.pc += 2
  }

  def RLA() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 1 else ci = 0

    if ((cpu.registers.a & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a << 1) + ci
    cpu.registers.a &= 255
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 1
  }

  def RLCA() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.a & 0x80) != 0) ci = 1 else ci = 0
    if ((cpu.registers.a & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a << 1) + ci
    cpu.registers.a &= 255
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 1
  }

  def RRA() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.a & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a >> 1) + ci
    cpu.registers.a &= 255
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 1
  }

  def RRCA() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.a & 1) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.a & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a >> 1) + ci
    cpu.registers.a &= 255
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 1
  }

  def RLr_b() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 1 else ci = 0
    if ((cpu.registers.b & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.b = (cpu.registers.b << 1) + ci
    cpu.registers.b &= 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLr_c() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 1 else ci = 0
    if ((cpu.registers.c & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.c = (cpu.registers.c << 1) + ci
    cpu.registers.c &= 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLr_d() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 1 else ci = 0
    if ((cpu.registers.d & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.d = (cpu.registers.d << 1) + ci
    cpu.registers.d &= 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLr_e() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 1 else ci = 0
    if ((cpu.registers.e & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.e = (cpu.registers.e << 1) + ci
    cpu.registers.e &= 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLr_h() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 1 else ci = 0
    if ((cpu.registers.h & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.h = (cpu.registers.h << 1) + ci
    cpu.registers.h &= 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLr_l() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 1 else ci = 0
    if ((cpu.registers.l & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.l = (cpu.registers.l << 1) + ci
    cpu.registers.l &= 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLr_a() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 1 else ci = 0
    if ((cpu.registers.a & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a << 1) + ci
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLHL() = {
    var ci = 0
    var co = 0
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    if ((cpu.registers.f & 0x10) != 0) ci = 1 else ci = 0
    if ((i & 0x80) != 0) co = 0x10 else co = 0
    i = (i << 1) + ci
    i &= 255
    if (i != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.memory.writeByte8(((cpu.registers.h << 8) + cpu.registers.l), i)
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 4
  }

  def RLCr_b() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.b & 0x80) != 0) ci = 1 else ci = 0
    if ((cpu.registers.b & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.b = (cpu.registers.b << 1) + ci
    cpu.registers.b &= 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLCr_c() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.c & 0x80) != 0) ci = 1 else ci = 0
    if ((cpu.registers.c & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.c = (cpu.registers.c << 1) + ci
    cpu.registers.c &= 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLCr_d() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.d & 0x80) != 0) ci = 1 else ci = 0
    if ((cpu.registers.d & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.d = (cpu.registers.d << 1) + ci
    cpu.registers.d &= 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLCr_e() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.e & 0x80) != 0) ci = 1 else ci = 0
    if ((cpu.registers.e & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.e = (cpu.registers.e << 1) + ci
    cpu.registers.e &= 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLCr_h() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.h & 0x80) != 0) ci = 1 else ci = 0
    if ((cpu.registers.h & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.h = (cpu.registers.h << 1) + ci
    cpu.registers.h &= 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLCr_l() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.l & 0x80) != 0) ci = 1 else ci = 0
    if ((cpu.registers.l & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.l = (cpu.registers.l << 1) + ci
    cpu.registers.l &= 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLCr_a() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.a & 0x80) != 0) ci = 1 else ci = 0
    if ((cpu.registers.a & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a << 1) + ci
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RLCHL() = {
    var ci = 0
    var co = 0
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    if ((i & 0x80) != 0) ci = 1 else ci = 0
    if ((i & 0x80) != 0) co = 0x10 else co = 0
    i = (i << 1) + ci
    i &= 255
    if (i != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.memory.writeByte8(((cpu.registers.h << 8) + cpu.registers.l), i)
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 4
  }

  def RRr_b() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.b & 1) != 0) co = 0x10 else co = 0
    cpu.registers.b = (cpu.registers.b >> 1) + ci
    cpu.registers.b &= 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRr_c() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.c & 1) != 0) co = 0x10 else co = 0

    cpu.registers.c = (cpu.registers.c >> 1) + ci
    cpu.registers.c &= 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRr_d() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.d & 1) != 0) co = 0x10 else co = 0
    cpu.registers.d = (cpu.registers.d >> 1) + ci
    cpu.registers.d &= 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRr_e() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.e & 1) != 0) co = 0x10 else co = 0
    cpu.registers.e = (cpu.registers.e >> 1) + ci
    cpu.registers.e &= 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRr_h() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.h & 1) != 0) co = 0x10 else co = 0
    cpu.registers.h = (cpu.registers.h >> 1) + ci
    cpu.registers.h &= 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRr_l() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.l & 1) != 0) co = 0x10 else co = 0
    cpu.registers.l = (cpu.registers.l >> 1) + ci
    cpu.registers.l &= 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRr_a() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.a & 1) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a >> 1) + ci
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRHL() = {
    var ci = 0
    var co = 0
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    if ((cpu.registers.f & 0x10) != 0) ci = 0x80 else ci = 0
    if ((i & 1) != 0) co = 0x10 else co = 0
    i = (i >> 1) + ci
    i &= 255
    cpu.memory.writeByte8(((cpu.registers.h << 8) + cpu.registers.l), i)
    if (i != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 4
  }

  def RRCr_b() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.b & 1) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.b & 1) != 0) co = 0x10 else co = 0
    cpu.registers.b = (cpu.registers.b >> 1) + ci
    cpu.registers.b &= 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRCr_c() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.c & 1) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.c & 1) != 0) co = 0x10 else co = 0
    cpu.registers.c = (cpu.registers.c >> 1) + ci
    cpu.registers.c &= 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRCr_d() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.d & 1) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.d & 1) != 0) co = 0x10 else co = 0
    cpu.registers.d = (cpu.registers.d >> 1) + ci
    cpu.registers.d &= 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRCr_e() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.e & 1) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.e & 1) != 0) co = 0x10 else co = 0
    cpu.registers.e = (cpu.registers.e >> 1) + ci
    cpu.registers.e &= 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRCr_h() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.h & 1) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.h & 1) != 0) co = 0x10 else co = 0
    cpu.registers.h = (cpu.registers.h >> 1) + ci
    cpu.registers.h &= 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRCr_l() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.l & 1) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.l & 1) != 0) co = 0x10 else co = 0
    cpu.registers.l = (cpu.registers.l >> 1) + ci
    cpu.registers.l &= 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRCr_a() = {
    var ci = 0
    var co = 0
    if ((cpu.registers.a & 1) != 0) ci = 0x80 else ci = 0
    if ((cpu.registers.a & 1) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a >> 1) + ci
    cpu.registers.a &= 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def RRCHL() = {
    var ci = 0
    var co = 0
    var i = cpu.memory.readByte8((cpu.registers.h << 8) + cpu.registers.l)
    if ((i & 1) != 0) ci = 0x80 else ci = 0
    if ((i & 1) != 0) co = 0x10 else co = 0
    i = (i >> 1) + ci
    i &= 255
    cpu.memory.writeByte8(((cpu.registers.h << 8) + cpu.registers.l), i)
    if (i != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 4
  }
  
def SLAr_b() = {
    var co = 0
    if ((cpu.registers.b & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.b = (cpu.registers.b << 1) & 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLAr_c() = {
    var co = 0
    if ((cpu.registers.c & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.c = (cpu.registers.c << 1) & 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLAr_d() = {
    var co = 0
    if ((cpu.registers.d & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.d = (cpu.registers.d << 1) & 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLAr_e() = {
    var co = 0
    if ((cpu.registers.e & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.e = (cpu.registers.e << 1) & 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLAr_h() = {
    var co = 0
    if ((cpu.registers.h & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.h = (cpu.registers.h << 1) & 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLAr_l() = {
    var co = 0
    if ((cpu.registers.l & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.l = (cpu.registers.l << 1) & 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLAr_a() = {
    var co = 0
    if ((cpu.registers.a & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a << 1) & 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLLr_b() = {
    var co = 0
    if ((cpu.registers.b & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.b = (cpu.registers.b << 1) & 255 + 1
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLLr_c() = {
    var co = 0
    if ((cpu.registers.c & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.c = (cpu.registers.c << 1) & 255 + 1
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLLr_d() = {
    var co = 0
    if ((cpu.registers.d & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.d = (cpu.registers.d << 1) & 255 + 1
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLLr_e() = {
    var co = 0
    if ((cpu.registers.d & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.e = (cpu.registers.e << 1) & 255 + 1
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLLr_h() = {
    var co = 0
    if ((cpu.registers.h & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.h = (cpu.registers.h << 1) & 255 + 1
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLLr_l() = {
    var co = 0
    if ((cpu.registers.l & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.l = (cpu.registers.l << 1) & 255 + 1
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SLLr_a() = {
    var co = 0
    if ((cpu.registers.a & 0x80) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a << 1) & 255 + 1
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRAr_b() = {
    var co = 0

    var ci = cpu.registers.b & 0x80
    if ((cpu.registers.b & 1) != 0) co = 0x10 else co = 0
    cpu.registers.b = ((cpu.registers.b >> 1) + ci) & 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRAr_c() = {
    var co = 0
    var ci = cpu.registers.c & 0x80
    if ((cpu.registers.c & 1) != 0) co = 0x10 else co = 0
    cpu.registers.c = ((cpu.registers.c >> 1) + ci) & 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRAr_d() = {
    var co = 0
    var ci = cpu.registers.d & 0x80
    if ((cpu.registers.d & 1) != 0) co = 0x10 else co = 0
    cpu.registers.d = ((cpu.registers.d >> 1) + ci) & 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRAr_e() = {
    var co = 0
    var ci = cpu.registers.e & 0x80
    if ((cpu.registers.e & 1) != 0) co = 0x10 else co = 0
    cpu.registers.e = ((cpu.registers.e >> 1) + ci) & 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRAr_h() = {
    var co = 0
    var ci = cpu.registers.h & 0x80
    if ((cpu.registers.h & 1) != 0) co = 0x10 else co = 0
    cpu.registers.h = ((cpu.registers.h >> 1) + ci) & 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRAr_l() = {
    var co = 0
    var ci = cpu.registers.l & 0x80
    if ((cpu.registers.l & 1) != 0) co = 0x10 else co = 0
    cpu.registers.l = ((cpu.registers.l >> 1) + ci) & 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRAr_a() = {
    var co = 0
    var ci = cpu.registers.a & 0x80
    if ((cpu.registers.a & 1) != 0) co = 0x10 else co = 0
    cpu.registers.a = ((cpu.registers.a >> 1) + ci) & 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRLr_b() = {
    var co = 0
    if ((cpu.registers.b & 1) != 0) co = 0x10 else co = 0
    cpu.registers.b = (cpu.registers.b >> 1) & 255
    if (cpu.registers.b != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRLr_c() = {
    var co = 0
    if ((cpu.registers.c & 1) != 0) co = 0x10 else co = 0
    cpu.registers.c = (cpu.registers.c >> 1) & 255
    if (cpu.registers.c != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRLr_d() = {
    var co = 0

    if ((cpu.registers.d & 1) != 0) co = 0x10 else co = 0
    cpu.registers.d = (cpu.registers.d >> 1) & 255
    if (cpu.registers.d != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRLr_e() = {
    var co = 0
    if ((cpu.registers.e & 1) != 0) co = 0x10 else co = 0
    cpu.registers.e = (cpu.registers.e >> 1) & 255
    if (cpu.registers.e != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRLr_h() = {
    var co = 0
    if ((cpu.registers.h & 1) != 0) co = 0x10 else co = 0
    cpu.registers.h = (cpu.registers.h >> 1) & 255
    if (cpu.registers.h != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRLr_l() = {
    var co = 0
    if ((cpu.registers.l & 1) != 0) co = 0x10 else co = 0
    cpu.registers.l = (cpu.registers.l >> 1) & 255
    if (cpu.registers.l != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def SRLr_a() = {
    var co = 0
    if ((cpu.registers.a & 1) != 0) co = 0x10 else co = 0
    cpu.registers.a = (cpu.registers.a >> 1) & 255
    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.f = (cpu.registers.f & 0xEF) + co
    cpu.registers.lastInstrClockm = 2
  }

  def CPL() = {
    cpu.registers.a ^= 255

    if (cpu.registers.a != 0) cpu.registers.f = 0 else cpu.registers.f = 0x80
    cpu.registers.lastInstrClockm = 1
  }

  def NEG() = {
    cpu.registers.a = 0 - cpu.registers.a
    if (cpu.registers.a < 0) cpu.registers.f = 0x10 else cpu.registers.f = 0
    cpu.registers.a &= 255
    if (cpu.registers.a == 0) cpu.registers.f |= 0x80
    cpu.registers.lastInstrClockm = 2
  }

  def CCF() = {
    var ci = 0
    if ((cpu.registers.f & 0x10) != 0) ci = 0 else ci = 0x10
    cpu.registers.f = (cpu.registers.f & 0xEF) + ci
    cpu.registers.lastInstrClockm = 1
  }

  def SCF() = {
    cpu.registers.f |= 0x10
    cpu.registers.lastInstrClockm = 1
  }

  def PUSHBC() = {
    cpu.registers.sp -= 1
    cpu.memory.writeByte8(cpu.registers.sp, cpu.registers.b)
    cpu.registers.sp -= 1
    cpu.memory.writeByte8(cpu.registers.sp, cpu.registers.c)
    cpu.registers.lastInstrClockm = 3
  }

  def PUSHDE() = {
    cpu.registers.sp -= 1
    cpu.memory.writeByte8(cpu.registers.sp, cpu.registers.d)
    cpu.registers.sp -= 1
    cpu.memory.writeByte8(cpu.registers.sp, cpu.registers.e)
    cpu.registers.lastInstrClockm = 3
  }

  def PUSHHL() = {
    cpu.registers.sp -= 1
    cpu.memory.writeByte8(cpu.registers.sp, cpu.registers.h)
    cpu.registers.sp -= 1
    cpu.memory.writeByte8(cpu.registers.sp, cpu.registers.l)
    cpu.registers.lastInstrClockm = 3
  }

  def PUSHAF() = {
    cpu.registers.sp -= 1
    cpu.memory.writeByte8(cpu.registers.sp, cpu.registers.a)
    cpu.registers.sp -= 1
    cpu.memory.writeByte8(cpu.registers.sp, cpu.registers.f)
    cpu.registers.lastInstrClockm = 3
  }

  def POPBC() = {
    cpu.registers.c = cpu.memory.readByte8(cpu.registers.sp)
    cpu.registers.sp += 1
    cpu.registers.b = cpu.memory.readByte8(cpu.registers.sp)
    cpu.registers.sp += 1
    cpu.registers.lastInstrClockm = 3
  }

  def POPDE() = {
    cpu.registers.e = cpu.memory.readByte8(cpu.registers.sp)
    cpu.registers.sp += 1
    cpu.registers.d = cpu.memory.readByte8(cpu.registers.sp)
    cpu.registers.sp += 1
    cpu.registers.lastInstrClockm = 3
  }

  def POPHL() = {
    cpu.registers.l = cpu.memory.readByte8(cpu.registers.sp)
    cpu.registers.sp += 1
    cpu.registers.h = cpu.memory.readByte8(cpu.registers.sp)
    cpu.registers.sp += 1
    cpu.registers.lastInstrClockm = 3
  }

  def POPAF() = {
    cpu.registers.f = cpu.memory.readByte8(cpu.registers.sp)
    cpu.registers.sp += 1
    cpu.registers.a = cpu.memory.readByte8(cpu.registers.sp)
    cpu.registers.sp += 1
    cpu.registers.lastInstrClockm = 3
  }

  def JRn() = {
    var i = cpu.memory.readByte8(cpu.registers.pc)
    if (i > 127) i = -((~i + 1) & 255)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
    cpu.registers.pc += i
    cpu.registers.lastInstrClockm += 1
  }

  def JRNZn() = {
    var i = cpu.memory.readByte8(cpu.registers.pc)
    if (i > 127) i = -((~i + 1) & 255)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
    if ((cpu.registers.f & 0x80) == 0x00) cpu.registers.pc += i
    cpu.registers.lastInstrClockm += 1
  }

  def JRZn() = {
    var i = cpu.memory.readByte8(cpu.registers.pc)
    if (i > 127) i = -((~i + 1) & 255)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
    if ((cpu.registers.f & 0x80) == 0x80) {
      cpu.registers.pc += i
      cpu.registers.lastInstrClockm += 1
    }
  }

  def JRNCn() = {
    var i = cpu.memory.readByte8(cpu.registers.pc)
    if (i > 127) i = -((~i + 1) & 255)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
    if ((cpu.registers.f & 0x10) == 0x00) {
      cpu.registers.pc += i
      cpu.registers.lastInstrClockm += 1
    }
  }

  def JRCn() = {
    var i = cpu.memory.readByte8(cpu.registers.pc)
    if (i > 127) i = -((~i + 1) & 255)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
    if ((cpu.registers.f & 0x10) == 0x10) {
      cpu.registers.pc += i
      cpu.registers.lastInstrClockm += 1
    }
  }

  def DJNZn() = {
    var i = cpu.memory.readByte8(cpu.registers.pc)
    if (i > 127) i = -((~i + 1) & 255)
    cpu.registers.pc += 1
    cpu.registers.lastInstrClockm = 2
    cpu.registers.b -= 1
    if (cpu.registers.b != 0) {
      cpu.registers.pc += i
      cpu.registers.lastInstrClockm += 1
    }
  }

  def CALLnn() = {
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc + 2)
    cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
    cpu.registers.lastInstrClockm = 5
  }

  def CALLNZnn() = {
    cpu.registers.lastInstrClockm = 3
    if ((cpu.registers.f & 0x80) == 0x00) {
      cpu.registers.sp -= 2
      cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc + 2)
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
      cpu.registers.lastInstrClockm += 2
    } else cpu.registers.pc += 2
  }

  def CALLZnn() = {
    cpu.registers.lastInstrClockm = 3
    if ((cpu.registers.f & 0x80) == 0x80) {
      cpu.registers.sp -= 2
      cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc + 2)
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
      cpu.registers.lastInstrClockm += 2
    } else cpu.registers.pc += 2
  }

  def CALLNCnn() = {
    cpu.registers.lastInstrClockm = 3
    if ((cpu.registers.f & 0x10) == 0x00) {
      cpu.registers.sp -= 2
      cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc + 2)
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
      cpu.registers.lastInstrClockm += 2
    } else cpu.registers.pc += 2
  }

  def CALLCnn() = {
    cpu.registers.lastInstrClockm = 3
    if ((cpu.registers.f & 0x10) == 0x10) {
      cpu.registers.sp -= 2
      cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc + 2)
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.pc)
      cpu.registers.lastInstrClockm += 2
    } else cpu.registers.pc += 2
  }

  def RET() = {
    cpu.registers.pc = cpu.memory.readByte16(cpu.registers.sp)
    cpu.registers.sp += 2
    cpu.registers.lastInstrClockm = 3
  }

  def RETI() = {
    cpu.registers.ime = 1
    rrs
    cpu.registers.pc = cpu.memory.readByte16(cpu.registers.sp)
    cpu.registers.sp += 2
    cpu.registers.lastInstrClockm = 3
  }

  def RETNZ() = {
    cpu.registers.lastInstrClockm = 1
    if ((cpu.registers.f & 0x80) == 0x00) {
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.sp)
      cpu.registers.sp += 2
      cpu.registers.lastInstrClockm += 2
    }
  }

  def RETZ() = {
    cpu.registers.lastInstrClockm = 1
    if ((cpu.registers.f & 0x80) == 0x80) {
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.sp)
      cpu.registers.sp += 2
      cpu.registers.lastInstrClockm += 2
    }
  }

  def RETNC() = {
    cpu.registers.lastInstrClockm = 1
    if ((cpu.registers.f & 0x10) == 0x00) {
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.sp)
      cpu.registers.sp += 2
      cpu.registers.lastInstrClockm += 2
    }
  }

  def RETC() = {
    cpu.registers.lastInstrClockm = 1
    if ((cpu.registers.f & 0x10) == 0x10) {
      cpu.registers.pc = cpu.memory.readByte16(cpu.registers.sp)
      cpu.registers.sp += 2
      cpu.registers.lastInstrClockm += 2
    }
  }

  def RST00() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x00
    cpu.registers.lastInstrClockm = 3
  }

  def RST08() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x08
    cpu.registers.lastInstrClockm = 3
  }

  def RST10() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x10
    cpu.registers.lastInstrClockm = 3
  }

  def RST18() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x18
    cpu.registers.lastInstrClockm = 3
  }

  def RST20() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x20
    cpu.registers.lastInstrClockm = 3
  }

  def RST28() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x28
    cpu.registers.lastInstrClockm = 3
  }

  def RST30() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x30
    cpu.registers.lastInstrClockm = 3
  }

  def RST38() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x38
    cpu.registers.lastInstrClockm = 3
  }

  def RST40() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x40
    cpu.registers.lastInstrClockm = 3
  }

  def RST48() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x48
    cpu.registers.lastInstrClockm = 3
  }

  def RST50() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x50
    cpu.registers.lastInstrClockm = 3
  }

  def RST58() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x58
    cpu.registers.lastInstrClockm = 3
  }

  def RST60() = {
    rsv
    cpu.registers.sp -= 2
    cpu.memory.writeByte16(cpu.registers.sp, cpu.registers.pc)
    cpu.registers.pc = 0x60
    cpu.registers.lastInstrClockm = 3
  }
  def rsv() = {
    cpu.registers.reserve_a = cpu.registers.a; cpu.registers.reserve_b = cpu.registers.b;
    cpu.registers.reserve_c = cpu.registers.c; cpu.registers.reserve_d = cpu.registers.d;
    cpu.registers.reserve_e = cpu.registers.e; cpu.registers.reserve_f = cpu.registers.f;
    cpu.registers.reserve_h = cpu.registers.h; cpu.registers.reserve_l = cpu.registers.l;
  }

  def rrs() = {
    cpu.registers.a = cpu.registers.reserve_a; cpu.registers.b = cpu.registers.reserve_b;
    cpu.registers.c = cpu.registers.reserve_c; cpu.registers.d = cpu.registers.reserve_d;
    cpu.registers.e = cpu.registers.reserve_e; cpu.registers.f = cpu.registers.reserve_f;
    cpu.registers.h = cpu.registers.reserve_h; cpu.registers.l = cpu.registers.reserve_l;
  }
  
  def MAPcb() = {
      var i=cpu.memory.readByte8((cpu.registers.pc))
      cpu.registers.pc += 1
      cpu.registers.pc &= 65535
      cb(i)
    }


}