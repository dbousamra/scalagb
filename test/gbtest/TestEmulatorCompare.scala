package gbtest

import org.scalatest.junit.AssertionsForJUnit
import scala.collection.mutable.ListBuffer
import org.junit._
import org.junit.runner.JUnitCore
import org.junit.runner.Result
import Assert._
import gb._

class EmulatorCompare extends AssertionsForJUnit {

  @Test def testEmulator() {

    var comparisonDepth = 50
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
		
	val range = 0.until(stackTrace.reverse.take(comparisonDepth).length)
	for (i <- range) { 
	  assertEquals(stackTrace.reverse.take(comparisonDepth)(i), cpu.stackTrace.reverse.take(comparisonDepth)(i)) 
	}  
  }

  def readStackTrace(fileName: String): List[String] = {
    var stackTrace = List[String]()
    for { (line) <- io.Source.fromFile(fileName).getLines }
      stackTrace = line :: stackTrace
    return stackTrace
  }
}

  