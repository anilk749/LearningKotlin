package OOPS

//enum class Days {
//    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
//}
//fun main(){
//    for (day in Days.values()){
//        println("${day.ordinal} = ${day.name}")
//    }
//    println("${Days.valueOf("Friday")}")
//}
enum class Days(val isWeekend:Boolean = false) {
    Sunday(true),
    Monday,
    Tuesday,Wednesday,
    Thursday,
    Friday(true),
    Saturday;
    companion object{

    }
}
fun main(){
    for (day in Days.values()){
        println("${day.ordinal} = ${day.name}")
    }
    println("${Days.valueOf("Friday")}")
}