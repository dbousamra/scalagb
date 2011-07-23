package gb

object Main {

  def main(args: Array[String]): Unit = { 
    
    val x : Registers = new Registers()
    x.setFlag2(0x30);
    println(x.f)
  }

  
  
}