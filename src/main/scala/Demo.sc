object Demo {

  case class Student(var rollno: Int = 1, var name: String = "John", var marks: Int = 100) {
    def show() = println("Hello there")

    def >(student2: Student): Boolean = marks > student2.marks
  }

  var s1 = Student()
  var s2 = Student(2, "James", 78)

  s1.>(s2)

  var numsList = List(3,4,5,6,7)

  numsList.foreach { i: Int => println(i)}
}