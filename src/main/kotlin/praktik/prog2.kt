package praktik

fun jumlah(bilangan1: Array<Int>): Int{
    var jml = 0
    for(bil in bilangan1){
        jml += bil
    }
    return jml
}

fun main(args : Array<String>){
    val arrBil = arrayOf(10,20,30,50)
    println("Jumlah bilangan: ${jumlah(arrBil)}")

}