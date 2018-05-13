object CompanionObject {

  private var intNum: Int = 245
  private var intNum2: Int = 100

  def display(): Unit = {
    var obj: CompanionObject = new CompanionObject
    println("Value in Singleton Object: " + obj.intNumClass)
  }
}

class CompanionObject {

  import CompanionObject._
  private var intNumClass: Int = 678

  def show(): Unit = {
    println("Value of Companion Object intNum: " + intNum)
  }
}

object Main {

  def main(args: Array[String]): Unit = {
    var companionObject: CompanionObject = new CompanionObject
    companionObject.show()

    CompanionObject.display()
  }
}