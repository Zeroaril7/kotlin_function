package praktik

fun main(args : Array<String>){
    val mhs = Mahasiswa("Jokyo Pandoupo", 27)
    val mhs2 = Mahasiswa("Sushi Susanti", 20)
    val mhs3 = Mahasiswa()

}

class Mahasiswa(val nama: String="Mahasiswa", var umur: Int = 0){
    val namaMhs: String
    var umurMhs: Int
    init {
        if(nama == "Mahasiswa"){
            namaMhs = "Nothing"
            umurMhs = umur
        } else {
            namaMhs = nama.toUpperCase()
            umurMhs = umur
        }
        println("Nama : $namaMhs")
        println("Umur : $umurMhs")
    }
}