package OOPS

data class Student(val name:String,val age:Int,val course:String)
fun main(args:Array<String>) {
    val stu = Student("Anil", 24, "MCA")
    val stu2 = Student("Anil", 27, "MCA")
    val stu3 = Student("Aman", 25, "Msc")
    // using componentN() function to destructure object into  number of variables
    val name = stu.component1()
    val age = stu.component2()
    val course = stu.component3()
    println("Name : $name \nAge : $age\nCourse : $course")
    // using copy() function
    val stu4 = stu3.copy(name ="Vishal")
    // using toString() function which returns the string representation of aobject
    println(stu2.toString())
    //equals() function to check that two objects are equal or not(returns true or false)
    if (stu.equals(stu2))
        println("stu object is equal to stu2 object")
    else
        println("stu object is not equal to stu2 object")
    if (stu2.equals(stu3))
        println("stu2 object is equal to stu3 object")
    else
        println("stu2 object is not equal to stu3 object")
    println("hashCode of stu object is : ${stu.hashCode()}")
    println("hashCode of stu2 object is : ${stu2.hashCode()}")
    println("hashCode of stu3 object is : ${stu3.hashCode()}")
}
