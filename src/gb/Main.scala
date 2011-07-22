package gb

object Main {

  def main(args: Array[String]): Unit = { 
    
    val x : Registers = new Registers()
    x.setFlag(x.HALF_CARRY_FLAG)
    println(x.f)
  }

  
  
}