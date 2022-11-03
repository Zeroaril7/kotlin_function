fun main() {
    val pangkat = { x: Int, y: Int ->
        var hasil = x
        for (value in 1..y step 2 ){
            hasil *= x
        }
        hasil
    }
    println(pangkat(5, 3))
}