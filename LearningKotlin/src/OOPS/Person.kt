package OOPS

class Person(val name:String="ajay",val age:Int=29) {
    fun show(){
        println("welcome to kotlin")
    }
}
fun main(args:Array<String>){
    val obj = Person()
    obj.show()
    println(obj.name+obj.age)
    val obj2 = Person("sahil",23)
    println("Person name is ${obj2.name} and Age is ${obj2.age}")
    val obj3 = Person("Pankaj")
    println("Person name is ${obj3.name} and Age is ${obj3.age}")
}