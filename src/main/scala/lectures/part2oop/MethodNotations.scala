package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickName: String): Person = new Person(name + s"(${nickName})", favoriteMovie)
    def hangOutWith(person: Person) : String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${name}what the hell!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is ${name} and i like ${favoriteMovie}"
    def apply(n: Int): String = s"${name} watched ${favoriteMovie} $n times"
    def learns(thing: String): String = s"${name} is learning ${thing}"
    def learnScala = this learns("Scala")
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  // infix notation = operator notation

  // Operators
  val tom = new Person("Tom", "Fight club")
  println(mary hangOutWith tom)
  println(1.+(2)) // all operators are methods
  println(!mary)
  println(mary.unary_!)
  //postfix notation
  println(mary.isAlive)
  println(mary isAlive) //only compatible with methods without parameters

  //apply
  println(mary.apply())
  println(mary())

  println((mary + "rockstar")())
  println((+mary).age)
  println(mary learnScala)
  println(mary(10))
}
