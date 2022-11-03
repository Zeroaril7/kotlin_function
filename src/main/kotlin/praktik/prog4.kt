package praktik

fun main(args : Array<String>){
    val jumlah = {
        x: Int, y: Int, z:Int -> x * y * z
    }

    println("10 x 2 = ${jumlah(10,2,3)}")
}