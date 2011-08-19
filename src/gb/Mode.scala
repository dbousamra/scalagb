package gb

object Mode extends Enumeration {
  case class Mode(modeType: Int, clocksSpent: Int) extends Val(modeType)

  val H_BLANK = Mode(0, 51)
  val V_BLANK = Mode(1, 114)
  val SCANLINE_OAM = Mode(2, 20)
  val SCANLINE_VRAM = Mode(3, 43)

}

