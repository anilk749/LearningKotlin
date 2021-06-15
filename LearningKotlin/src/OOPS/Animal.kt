package OOPS

open class Animal () {
    init {
        println("parent class animal")
    }
}
class Dog():Animal() {
    init {
        println("Child class Dog")
    }
}
fun main(args:Array<String>){
    val husky = Dog()
}