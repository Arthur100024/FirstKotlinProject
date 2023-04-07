fun main(args: Array<String>) {
    sayHello("Arthur")
    println(addition(5,10))
    println(saySomething("something"))
}


fun sayHello(name: String){
    println("Hello, $name!")

}

fun addition(x:Int, y:Int): Int {
    return x + y
}

fun saySomething(text: String): String = "Say $text"