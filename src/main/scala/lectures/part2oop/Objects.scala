package lectures.part2oop

object Objects extends App {

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false

    def apply(father: Person, mother: Person): Person = new Person("Bobby")
  }

  class Person(val name: String){

  }
  //COMPANIONS

  println(Person.N_EYES)
  // Scala objects are singleton instances

  val mary = new Person("Mary")
  val tom = new Person("Tom")
  println(mary == tom)

  val bobby = Person(tom, mary) //invokes the method apply
}
