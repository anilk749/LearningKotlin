package arrays

fun main(args:Array<String>){
    //creating arrayList of string type using ArrayList Constructor
    val arrayList = ArrayList<String>()
    //adding element to list
    arrayList.add("Anil")
    arrayList.add("Vishal")
    //printing arraylist
    println("arraylist of two members")
    for (i in arrayList)
        println(i)
    println(arrayList.size)
    arrayList.add("Pankaj")
    arrayList.add("Rahul")
    println("updated arraylist")
    for(i in arrayList)
        println(i)
    println(arrayList.size)
    val arrayList2 = ArrayList<String>()
    //addAll() function of ArrayList
    arrayList2.addAll(arrayList)
    println("arrayList2")
    for (i in arrayList2)
        println(i)
    println(arrayList2.get(2))
    println("Index value of Vishal is  ${arrayList2.indexOf("Vishal")}")
    //set(index:Int,element:E):E adding element at position 3
    arrayList2.set(3,"Sahil")
    for (i in arrayList2)
        println(i)
    //remove(element:E):Boolean to remove element
    arrayList.remove("Rahul")
    println("after removing Rahul")
    for (i in arrayList)
        println(i)
    // clear() to remove all the elements
    println("Clearing all the elements ")
    arrayList.clear()
    println("arrayList size : ${arrayList.size}")
}