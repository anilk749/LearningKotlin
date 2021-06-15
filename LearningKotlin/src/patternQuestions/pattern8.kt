package patternQuestions

fun main(args:Array<String>){
    println("Enter a positive number")
    val num :Int = Integer.valueOf(readLine())
//    for (i in 1..num){
//        for (j in 1..i){
//            if(i % 2 != 0 && j % 2 != 0 || i % 2 == 0 && j % 2 == 0  )
//                print("1\t")
//            else
//                print("0\t")
//        }
//        println()
//    }
    //OR
        for (i in 1..num){
        for (j in 1..i){
            if((i + j) % 2 == 0)
                print("1\t")
            else
                print("0\t")
        }
        println()
    }
}