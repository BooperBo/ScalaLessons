object Example extends App {

  val y: Float = 10.3f

  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    val p = (1 / (sigma * Math.sqrt(2 * Math.PI))) * Math.exp(-(Math.pow(x - mu, 2) / (2 * Math.pow(sigma, 2))))
    p
  }

  println(normalDistribution(1.0, 1.0, 1.0))


}
