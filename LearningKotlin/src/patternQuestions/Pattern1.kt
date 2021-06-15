package KotlinBasics

fun main(args:Array<String>){
    println("Enter an integer value")
    var num = Integer.valueOf(readLine())
    for (i in 1..num){
            for (j in 1..i) {
                print("*\t")
            }
            println()
        }
    println()
    //another pattern
    for(i in 1..num){
        for (j in 1..num){
            if(j <= num - i)
                print("\t")
            else
                print("*\t")
        }
        println()
    }
    println()
    //right angled triangle with acending numbers like 123456..
    //create a variable to increment i value inside inner loop
    var count:Int = 1
    for (i in 1..num){
        for (j in 1..i){
            print("$count\t")
            count++
        }
        println()
    }
}