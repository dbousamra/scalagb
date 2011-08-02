package gb

object Main {

  def main(args: Array[String]): Unit = {
    val cpu: Cpu = new Cpu(romFilename = "roms/testRom1.gb", DEBUG_MODE = true)
    cpu.reset()
    var x = 0
    while (x < 16) {
      cpu.run()
      x += 1
    }
  }
    
    
}