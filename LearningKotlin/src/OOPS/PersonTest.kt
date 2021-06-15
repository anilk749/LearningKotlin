package OOPS

 open class PersonTest( val name:String="AMIT",val age:Int=21) {
    init {
        println("Person name is $name\nPerson age is $age")
    }
}
class Person1(name:String,age:Int):PersonTest(name ,age){
    fun work(){
        println("Person1 is an Engineer.")
    }
}
fun main(args:Array<String>){
    val objBaseClass=PersonTest()
    val baseClassObj = PersonTest("Anil",24)
    val childClassObj = Person1("Vishal",23)
    childClassObj.work()
    println("Person name is ${childClassObj.name} and age is ${childClassObj.age}")
}