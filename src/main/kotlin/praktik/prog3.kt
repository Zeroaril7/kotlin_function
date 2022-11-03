
fun jumlah2(vararg bilangan2: Int): Int{
    var jml = 0
    bilangan2.forEach{
            bil -> jml += bil
    }
    return jml
}

fun main(args : Array<String>){
    println("Jumlah bilangan: ${jumlah2(10,20,30,50)}")
}