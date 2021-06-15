package patternQuestions

fun main(args:Array<String>) {
    println("Enter a positive number")
    val num: Int = Integer.valueOf(readLine())
    for (i in 1..num) {
        for (j in 1..num - i) {
            print("\t")
        }
        for (j in 1..num) {
            print("*\t")
        }
        println()
    }
}