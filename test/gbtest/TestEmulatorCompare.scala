package gbtest

import org.scalatest.junit.AssertionsForJUnit
import scala.collection.mutable.ListBuffer
import org.junit._
import Assert._
import gb._

class EmulatorCompare extends AssertionsForJUnit {
  
  @Test def testEmulator() {
    
    var comparisonDepth = 15
    val romName = "roms/testRom1.gb"
    val stackTraceFileName = "test/gbtest/testRom1"
    val iterations = 100
    var x = 0
    val cpu: Cpu = new Cpu(romFilename = romName, DEBUG_MODE = true)
    cpu.reset()
        while (x < iterations) {
          cpu.run()
          x += 1
        }
    
    val stackTrace = readStackTrace(stackTraceFileName)

    assertEquals(stackTrace.reverse.take(comparisonDepth), cpu.stackTrace.reverse.take(comparisonDepth))
  }
  
  def readStackTrace(fileName : String) : List[String] = {
    var stackTrace = List[String]()
    for {(line) <- io.Source.fromFile(fileName).getLines} 
		stackTrace = line :: stackTrace
	return stackTrace
  }
  
}
  