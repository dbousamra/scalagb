package gb

object Main {

  def main(args: Array[String]): Unit = {  
    val registers : Registers = new Registers()
    val romloader : Memory = new Memory()
    romloader.loadRom("roms/TETRIS.GB")
    var x : Int = 0x1282
  }
}