package KotlinBasics

fun main(args:Array<String>){
    println("Enter a positive number")
    val num = Integer.valueOf(readLine())
    var space:Int = num - 1
    var digit:Int = 1
    for (i in 1..num){
        //This loop prints the spaces
        for (j in 1..space) {
            print("\t")
        }
        //Set the value of i in k so that we can change it because i is by default immutable
        var k:Int = i
        //This loop prints the digits
        for (j in 1..digit) {
                print("$k\t")
            if(j <= digit/2 )
                k--
            else
                k++
        }
        // to increase the digits by 2 in each row
        digit += 2
        //to decrease the space by 1 in each row
        space--
        println()
    }
}