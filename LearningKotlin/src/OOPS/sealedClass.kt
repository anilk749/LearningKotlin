package OOPS

sealed class Data{
    data class Sucess(val data:String):Data()
    data class Error(val error:String):Data()
    object Loading:Data()
}
fun getData():Data{
    return Data.Error((100..1000).random().toString())
}
fun main(args:Array<String>){
    val data = getData()
    when(data){
        is Data.Sucess -> { println(data)}
        is Data.Error -> {println(data)}
        is Data.Loading -> {println(data)}
    }
}