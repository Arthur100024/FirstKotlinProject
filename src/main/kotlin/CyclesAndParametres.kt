fun main(args: Array<String>) {
    printSome()
    printSome("Hello")
    printSome("Hello", "World")
    printSome("Hello", "World", "!")


    var names = arrayOf("Arthur", "Timtim", "Jeka")
    printSomePermanent("Hi", *names)


}

fun printSome(vararg word: String){ //? ПЕРЕДАЧА НЕОГРАНИЧЕННОГО КОЛИЧЕСТВА ЭЛЕМЕНТОВ
    word.forEach { el -> print("$el ") }
    println()
}

fun printSomePermanent(item:String, vararg word: String){ //? ПЕРЕДАЧА НЕОГРАНИЧЕННОГО КОЛИЧЕСТВА ЭЛЕМЕНТОВ И ОДНИМ ОБЯЗАТЕЛЬНЫМ
    print("$item ")
    word.forEach { el -> print("$el ") }
    println()
}