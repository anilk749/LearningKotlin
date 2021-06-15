package KotlinBasics

fun main(args:Array<String>) {
    println("Enter an integer value")
    var num :Int= Integer.valueOf(readLine())
    var n:Int = num*2
    //first way
//    for (i in 1..num) {
//        for (j in 1..i) {
//           print("*\t")
//        }
//        var space:Int = 2*num - 2*i
//        for (j in 1..space) {
//            print("\t")
//        }
//        for (j in 1..i) {
//            print("*\t")
//        }
//        println()
//    }
//    var num2:Int = downTo.num..1
//    for (i in num.downTo(1)) {
//        for (j in 1..i) {
//            print("*\t")
//        }
//        var space:Int = 2*num - 2*i
//        for (j in 1..space) {
//            print("\t")
//        }
//        for (j in 1..i) {
//            print("*\t")
//        }
//        println()
//    }
    //second way
    for (i in 1..num) {
        for (j in 1..n) {
            if (j <= i)
                print("*\t")
            if (j > i && j <= n - i)
                print("\t")
            if (j > n - i)
                print("*\t")
        }
        println()
    }
    for (i in num.downTo(1)) {
        for (j in 1..n) {
            //to print starting stars
            if (j <= i)
                print("*\t")
            //to print spaces
            if (j > i && j <= n - i)
                print("\t")
            //to print ending stars
            if (j > n - i)
                print("*\t")
        }
        println()
    }
}