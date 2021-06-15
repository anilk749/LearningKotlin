package KotlinBasics

fun main(args:Array<String>){
    println("Enter a positive number")
    val num:Int = Integer.valueOf(readLine())
    for(i in num.downTo(1)){
        for (j in 1..i){
            print("$j\t")
        }
        println()
    }
}