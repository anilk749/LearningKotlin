package OOPS

class OuterClass {
    val outerStr = "Anil of outer class"
    // Nested class
    class NestedClass{
        val nestedStr : String = "Aman of nested class"
        fun show() = "function of nested class"
    }
}
fun main(args:Array<String>){
   //creating object of nested class
    val nestedClassObj = OuterClass.NestedClass()
    //Accessing nested class member using object
    println(nestedClassObj.nestedStr)
    //Accessing nested class members using '.' with outer class
    println(OuterClass.NestedClass().nestedStr)
    println(OuterClass.NestedClass().show())
}