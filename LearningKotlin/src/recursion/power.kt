package recursion

fun main(args:Array<String>){
    println("To calculate power of number (num1^num2 ")
    println("Enter num1 value ")
    val num1 :Int = Integer.valueOf(readLine())
    println("Enter num2 value ")
    val num2 :Int = Integer.valueOf(readLine())
    val powerOfNumber:Int = power(num1,num2)
    println("Power of number $num1 is : $powerOfNumber")
}
fun power(num1:Int,num2:Int):Int{
    if (num2 == 0)
        return 1
    return num1 * power(num1,num2 - 1)
}