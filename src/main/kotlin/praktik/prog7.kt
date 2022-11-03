package praktik

fun main(args: Array<String>){
    val sum = func(10)
    println("10 + 20 = ${sum(20)}")
}

fun func(x: Int): (Int) -> Int = { y -> y + x}