package KotlinBasics

fun main(args:Array<String>){
//    try{
//        var num :Int = 10/0
//        println("hello")
//        println(num)
//    }catch (e:ArithmeticException){
//        println("Arithmetic Exception")
//    }catch (e:Exception){
//        println(e)
//    }finally {
//        println("Always execute")
//    }
    try {
        println("before exception")
        throw Exception("Somthing went wrong here")
    }catch (e:Exception){
        println(e)
    }finally {
        println("after exception")
    }
}