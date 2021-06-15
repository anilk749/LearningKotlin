package OOPS

class OuterClasss{
    val oStr = "outer class member"
    inner class InnerClass{
        val iStr:String = "inner class member"
        fun show() = " $oStr function"
    }
}
fun main(args:Array<String>){
    val o = OuterClasss()
    println("${o.InnerClass().show()}")
    val i = OuterClasss().InnerClass()
    println(i.show())
}