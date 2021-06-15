package OOPS

class Persons<T>(text:T){
    var value = text
    init {
        println(value)
    }
}
fun main(args:Array<String>){
    var name:Persons<String> = Persons("Anil")
    var age:Persons<Int> = Persons(20)
}