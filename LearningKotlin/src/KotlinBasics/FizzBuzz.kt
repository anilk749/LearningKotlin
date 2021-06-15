package KotlinBasics

fun main(args:Array<String>){
    println("Enter an integer value")
    val num = Integer.valueOf(readLine())
    for (i in 1..num){
        if(i % 3 == 0 && i % 5 == 0)
            println("FizzBuzz")
        else if (i % 5 == 0)
            println("Buzz")
        else if(i % 3 == 0)
            println("Fizz")
        else
            println(i)
    }
}