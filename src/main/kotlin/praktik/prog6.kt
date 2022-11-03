package praktik

fun main(args : Array<String>){
    func("Developer",::demo)
}

fun func(str: String, function: (String) -> Unit){
    print("Welcome, ")
    function(str)
}

fun demo(str: String){
    print(str)
}