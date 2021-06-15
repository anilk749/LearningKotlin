package OOPS
//secondary constructor declared using "constructer" keyword
class Constructor {
    //calling one secondary constructor from another secondary constructor using 'this' keyword
    constructor(name:String):this("anil",25){
        println("constructer with one parameterd")
        println(name)
    }
    constructor(name:String,age:Int){
        println("constructor with two parameters")
        println("name is $name and age is $age")
    }
}
fun main(args:Array<String>){
    val obj = Constructor("Vishal")
}