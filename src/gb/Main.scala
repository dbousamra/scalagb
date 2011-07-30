package gb

object Main {

  def main(args: Array[String]): Unit = {  
    val cpu : Cpu = new Cpu(romFilename="roms/TETRIS.GB", DEBUG_MODE=true)
  	cpu.reset()
    cpu.run(breakPoint = 1000)
  }

}