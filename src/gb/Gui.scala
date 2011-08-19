package gb

import swing.{ Panel, MainFrame, SimpleSwingApplication }
import java.awt.{ Color, Graphics2D, Dimension }
import java.awt.event._
import java.awt
import javax.swing.Timer
import swing._
import javax.swing.filechooser.FileFilter
import javax.swing.filechooser.FileNameExtensionFilter

object ColorPanel extends SimpleSwingApplication {
  private var c: Color = new Color(0)
  private var cpu: Cpu = new Cpu(romFilename = "roms/testRom1.gb", DEBUG_MODE = true)
  cpu.reset()
  private val frameTitle = "ScalaGB"

  var width: Int = 160
  var height: Int = 144

  def top = new MainFrame {
    title = frameTitle
    contents = p
    menuBar = new MenuBar {   
        contents += new Menu("File") {      
          contents += new MenuItem(Action("Load Rom") {
              val chooser = new FileChooser()
              chooser.fileFilter = new FileNameExtensionFilter("GameBoy ROM", "gb")
              chooser.showOpenDialog(this)
              timer.stop()
              cpu = new Cpu(chooser.selectedFile.getAbsolutePath(), true)
              cpu.reset()
              timer.start()
          })
          contents += new MenuItem(Action("Stop") { timer.stop() })
          contents += new MenuItem(Action("Reset") {
            timer.stop()
            cpu.reset()
            timer.start()
          })
          contents += new Separator        
        }
      }
  }

  val p = new Panel with ActionListener {
	preferredSize = new Dimension(width, height)
    val data = Array.ofDim[Color](25, 25)
    data(0)(0) = Color.BLACK
    data(4)(4) = Color.RED
    data(0)(4) = Color.GREEN
    data(4)(0) = Color.BLUE
    
    

    override def paintComponent(g: Graphics2D) {
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

    def actionPerformed(e: ActionEvent) {
      c = new Color((c.getRGB() + 1000) % 16777216)
      repaint
      cpu.run
    }
  }

  val timer = new Timer(1, p) //can control timing from here.
  timer.start()
}