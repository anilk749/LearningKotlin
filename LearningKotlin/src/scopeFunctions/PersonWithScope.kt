package scopeFunctions

class PersonWithScope (){
    var name:String = "ajay"
    var age:Int = 40
}
fun main(){
    //using apply scope function to initialise properties .This is helpful if we have many properties
    val person = PersonWithScope().apply {
        name = "anil"
        age = 20
    }
    //using with scope function to print these values.This is helpful if we have many properties
    with(person){
        println(name)
        println(age)
    }
//fun main(){
//    val person = PersonWithScope()
//    val ageplusFive :Int = with(person){
//        println(name)
//        println(age)
//        age + 5
//    }
//    println(ageplusFive)
}
