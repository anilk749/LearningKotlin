package generics

class GenTypeArray<T>(private val array:Array<T>) {
    fun findElement(element:T,foundElement:(index:Int,element:T?)->Unit){
        for (i in array.indices){
            if(array[i] == element) {
                foundElement(i,array[i])
                return
            }
        }
        foundElement(-1,null)
        return
    }
}
fun main(args:Array<String>){
    val obj = GenTypeArray<Int>(arrayOf(1,2,3,4,5))
    val obj2 = GenTypeArray<String>(arrayOf("1","2","3","4","5"))
    obj.findElement(4,{index,element -> println("index $index")
        println("element $element")
    })
    obj2.findElement("4",{index,element -> println("index $index")
        println("element $element")
    })
}
