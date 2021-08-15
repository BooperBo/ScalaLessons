import scala.math.BigDecimal.RoundingMode

case object Example1 extends App {
  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    val res = (1 - potatoWaterRatio) * weight / (1 - crispsWaterRatio)
    res.setScale(5, BigDecimal.RoundingMode.HALF_UP)

  }

}
