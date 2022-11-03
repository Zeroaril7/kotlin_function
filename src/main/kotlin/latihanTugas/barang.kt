package latihanTugas

class Barang (val nama: String = "Setrika", val harga: Int = 200_000, var jumlah: Int = 1, var diskon: Int = 20) {

    fun tampil(){
        println("Nama : $nama")
        println("Harga: $harga")
        println("Jumlah: $jumlah")
        println("Diskon: $diskon%")
    }

    fun hitungTotal(){
        val tagihan = harga*jumlah*(100-diskon)/100
        println("Total tagihan: $tagihan")
    }
}

fun main(){
    val barang = Barang("Pakaian", 100_000, 4, 10)

    barang.tampil()
    barang.hitungTotal()
}