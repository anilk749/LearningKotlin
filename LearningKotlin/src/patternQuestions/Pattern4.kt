package KotlinBasics

fun main(args:Array<String>){
    println("Enter row value")
    var row = Integer.valueOf(readLine())
    println("Enter column value")
    var col = Integer.valueOf(readLine())
    for (i in 1..row){
        for (j in 1..col) {
            print("*\t")
        }
        println()
    }
}