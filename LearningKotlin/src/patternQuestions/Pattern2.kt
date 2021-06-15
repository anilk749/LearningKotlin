package KotlinBasics

fun main(args:Array<String>){
    println("Enter a positive number")
    val num = Integer.valueOf(readLine())
    var space:Int = num - 1
    var star:Int = 1
    for (i in 1..num){
            for (j in 1..space) {
                print("\t")
            }
            for (k in 1..star) {
                print("*\t")
            }
        star++
        space--
        println()
        }
    }