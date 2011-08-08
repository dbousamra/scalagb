package gb

import processing.core._
import java.awt.Dimension

object Main {

  private var screen: Screen = _
  var width: Int = 160
  var height: Int = 144

  def main(args: Array[String]): Unit = {
    runScreen
  }

  def runScreen() = {
    screen = new Screen
    val frame = new javax.swing.JFrame("ScalaGB")
    frame.setPreferredSize(new Dimension(width, height))
    frame.getContentPane().add(screen)
    screen.init
    frame.pack
    frame.setVisible(true)
  }

  class Screen extends PApplet {

    val cpu: Cpu = new Cpu(romFilename = "roms/testRom1.gb", DEBUG_MODE = true)

    override def setup() = {
      size(height, width)
      background(255)
      smooth()
      noStroke()
      fill(0, 102)

      cpu.reset()
    }

    override def draw() = {
      background(255)
      fill(255);
      stroke(0)
      var x = 0
      while (x < 17612) { cpu.run(); x += 1 }
    }
  }
}