package KotlinBasics

class DataTypesAndVariables {
    var num = 1
    var num2 = num++
    init {
        println("$num $num2")
    }
}
fun main(args:Array<String>){
    val obj = DataTypesAndVariables()
}