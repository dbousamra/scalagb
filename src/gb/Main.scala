package gb

object Main {

  def main(args: Array[String]): Unit = { 
    
    val registers : Registers = new Registers()
    val romloader : MemoryManager = new MemoryManager()
    registers.setFlag(0x40)
    println(registers.f)
    
    println(romloader.loadRom("roms/TETRIS.GB").length)
    
  }

  
  
}