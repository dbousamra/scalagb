package gb

import swing.{ Panel, MainFrame, SimpleSwingApplication }
import java.awt.{ Color, Graphics2D, Dimension }

class DataPanel(data: Array[Array[Color]]) extends Panel {

  override def paintComponent(g: Graphics2D) {
    val cpu: Cpu = new Cpu(romFilename = "roms/testRom1.gb", DEBUG_MODE = true)
    //cpu.execute.
    val dx = g.getClipBounds.width.toFloat / data.length
    val dy = g.getClipBounds.height.toFloat / data.map(_.length).max
    for {
      x <- 0 until data.length	
      y <- 0 until data(x).length
      x1 = (x * dx).toInt
      y1 = (y * dy).toInt
      x2 = ((x + 1) * dx).toInt
      y2 = ((y + 1) * dy).toInt
    } {
      data(x)(y) match {
        case c: Color => g.setColor(c)
        case _ => g.setColor(Color.WHITE)
      }
      g.fillRect(x1, y1, x2 - x1, y2 - y1)
    }
  }
}

object Draw extends SimpleSwingApplication {

  val data = Array.ofDim[Color](25, 25)
  data(0)(0) = Color.BLACK
  data(4)(4) = Color.RED
  data(0)(4) = Color.GREEN
  data(4)(0) = Color.BLUE

  def top = new MainFrame {
    
    contents = new DataPanel(data) {
      preferredSize = new Dimension(300, 300)
    }
  }
  
  
}