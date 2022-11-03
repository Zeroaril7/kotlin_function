package praktik

data class Siswa(val nama: String, val umur: Int)

fun main(args: Array<String>){
    val s = Siswa("Sushi Susanti", 28)
    val s2 = Siswa("Budi Agusanto", 25)

    println("Nama Mahasiswa: ${s.nama}")
    println("Umur Mahasiswa: ${s.umur}")
    println("Nama Mahasiswa: ${s2.nama}")
    println("Umur Mahasiswa: ${s2.umur}")
}