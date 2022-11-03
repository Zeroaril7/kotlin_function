package praktik


data class Siswa1(val nama: String, val umur: Int)

fun main(args: Array<String>){
    val s = Siswa1("Sushi Susanti", 28)
    val s2 = Siswa1("Budi Agusanto", 25)
    val s3 = Siswa1("Mamat Wawanto", 21)

    if (s.equals(s2) == true){
        println("Siswa sama dengan Siswa2")
    } else {
        println("Siswa tidak sama dengan Siswa2")
    }

    if(s.equals(s3) == true){
        println("Siswa sama dengan Siswa3")
    } else {
        println("Siswa tidaksama dengan Siswa3")
    }

    println("\nHashcode dari siswa: ${s.hashCode()}")
    println("Hashcode dari siswa2: ${s2.hashCode()}")
    println("Hashcode dari siswa3: ${s3.hashCode()}")
}