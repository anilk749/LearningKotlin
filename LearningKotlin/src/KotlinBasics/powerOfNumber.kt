package KotlinBasics

fun main(args:Array<String>){
    println("Enter number 1")
    val num1 :Int = Integer.valueOf(readLine())
    println("Enter number 2")
    val num2 :Int = Integer.valueOf(readLine())
    //power() function call inside a variable
    val powerOfNum :Int = power(num1,num2)
    println("$num1 power $num2 is : $powerOfNum")
}
// function to calculate the power of a number
fun power(num1:Int,num2:Int):Int{
    var result :Int = 1
    for (n in 1..num2){
        result *= num1
    }
    return  result
}