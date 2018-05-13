case class TimeOfDayValues[A]() {

  private val values: Array[Option[A]] = Array.fill(24)(None)

  def apply(hour: Int) = values(hour).get

  def get(hour: Int) : Option[A] = values(hour)

  def update(hour: Int, value: A) = values(hour) = Some(value)

  def clear(hour: Int) : Unit = {
    values(hour) = None
  }

  def combine(o: TimeOfDayValues[A], func: (Option[A], Option[A]) => Option[A]): Unit = {
    val ret = new TimeOfDayValues[A]
    for((values, indicies) <- (values, o.values).zipped.map((value1, value2) => func(value1, value2)).zipWithIndex) {
      ret.values(indicies) = values
    }
  }

  def printSome(): Unit = {
    println("Something")
  }

}

object demo {
  var s1 = TimeOfDayValues()
  s1.printSome()
  private var m: Int = 322
}