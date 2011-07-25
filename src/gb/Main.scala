package gb

object Main {

  def main(args: Array[String]): Unit = {  
    val cpu : Cpu = new Cpu("roms/TETRIS.GB")
  	cpu.reset()
    cpu.run()
  }
  
}