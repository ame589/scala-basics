package lectures.part2oop

object Inheritance extends App {

  // Single class inheritance
  class Animal {
    val creatureType: String = "wild"
    def eat = println("momnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  class Dog extends Animal {
    override val creatureType: String = "domestic"
    override def eat = {
      super.eat
      println("crunch crunch")
    }
  }

  class Horse(override val creatureType: String) extends Animal {
    override def eat = println("gnam gnam")
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  val horse = new Horse("domestic")
  println(horse.creatureType)

  //polymorphism
  val unknownAnimal: Animal = new Horse("domestic")
  unknownAnimal.eat

  //final prevents methods overriding

  //sealed doesn't allow to extend a class outside the same file
  // sealed class Animal ...
}
