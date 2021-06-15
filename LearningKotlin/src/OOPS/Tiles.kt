package OOPS

sealed class Tiles
class Red(val type:String,val points:Int):Tiles()
class Green(val points:Int):Tiles()

fun main(){
    val tile = Red("Onion",20)
    println("${tile.type} - ${tile.points}")
}