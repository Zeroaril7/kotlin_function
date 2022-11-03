package praktik

data class Mahasiswa2(val nama:String, val umur: Int)

fun main(args: Array<String>){
    val mhs = Mahasiswa2("Wawan Hermawan", 25)
    val mhs2 = mhs.copy(nama = "Budi")

    println("Nama ${mhs.nama}, Umur ${mhs.umur}")
    println("Nama ${mhs2.nama}, Umur ${mhs2.umur}")

    val nama = mhs.component1()
    val umur = mhs.component2()
    println("Nama $nama, umur $umur")
}