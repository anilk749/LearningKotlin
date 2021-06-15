package KotlinBasics

fun main(args:Array<String>){
    println("Enter a number")
    var num:Int = Integer.valueOf(readLine())
    val reverseNumber:Int = revNumFunc(num)
    println("Reverse of $num is : $reverseNumber")
}
fun revNumFunc(num : Int):Int{
    var num2 :Int = num
    var rev : Int = 0
    while (num2 > 0){
            val rem : Int = num2 % 10
            num2 = num2 / 10
            rev = rev * 10 + rem
        }
    return rev
}