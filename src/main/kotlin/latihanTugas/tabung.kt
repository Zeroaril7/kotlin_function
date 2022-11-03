package latihanTugas

val PHI = 3.14
class Tabung (val r: Int, val t: Int){
    fun luasPermukaan(){
        val hasil = 2*PHI*r*(r+t)
        println("Luas Permukaan: $hasil")
    }

    fun volume(){
        val hasil = PHI*r*r*t
        println("Volume: $hasil")
    }
}


fun main(){
    val tabung = Tabung(7,14)
    tabung.luasPermukaan()
    tabung.volume()
}