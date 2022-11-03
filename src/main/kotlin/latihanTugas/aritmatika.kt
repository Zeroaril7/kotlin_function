package latihanTugas

fun aritmatika (x: Int, y: Int){
    val penjumlahan = x+y
    val pengurangan = x-y
    val perkalian = x*y
    val pembagian = x/y

    println(" \n$x + $y = $penjumlahan")
    println("$x - $y = $pengurangan")
    println("$x * $y = $perkalian")
    println("$x / $y = $pembagian")
}

class Aritmatika (val a: Int, val b: Int){
    fun penjumlahan (){
        println("Penjumlahan: " +(a+b))
    }
    fun pengurangan (){
        println("Pengurangan: " +(a-b))
    }
    fun perkalian (){
        println("Perkalian: " +(a*b))
    }
    fun pembagian (){
        println("Pembagian: " +(a/b))
    }
}

fun main(){
    val arit = Aritmatika(12,3)
    arit.penjumlahan()
    arit.pengurangan()
    arit.perkalian()
    arit.pembagian()
    aritmatika(12,3)
}