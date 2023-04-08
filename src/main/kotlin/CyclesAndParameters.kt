fun main(args: Array<String>) {
    printSome()
    printSome("Hello")
    printSome("Hello", "World")
    printSome("Hello", "World", "!")

    println("\n \n")

    var names = arrayOf("Arthur", "Timtim", "Jeka")
    printSomePermanent("Hi", *names)
    printSomePermanent(word = names, item = "Hi")

    println("\n \n")

    printSomeDefaultPermanent(word = names)
    printSomeDefaultPermanent(item = "Hello", word = names)

    println("\n \n")

    whileCycle()

    println("\n \n")

    doWhileCycle()

    println("\n \n")

    forCycle()

    println("\n \n")

    ifVariable()
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

fun printSomeDefaultPermanent(item:String = "Hi", vararg word: String){ //? ПЕРЕДАЧА НЕОГРАНИЧЕННОГО КОЛИЧЕСТВА ЭЛЕМЕНТОВ И ОДНИМ ОБЯЗАТЕЛЬНЫМ СО ЗНАЧЕНИЕМ ПО УМОЛЧАНИЮ
    print("$item ")
    word.forEach { el -> print("$el ") }
    println()
}

fun whileCycle(){
    var items = 5

    while (items > 0){
        println(items)
        items--
    }
}

fun doWhileCycle(){
    var items = 0

    do {
        println(items)
    } while (items == 5)
}

fun forCycle(){
    for(i in 0..3){ //? ОБЫЧНЫЙ ЦИКЛ FOR
        println(i)
    }

    println("\n \n")

    for(i in 0..10 step 2){ //? ЦИКЛ FOR С ШАГОМ 2
        println(i)
    }

    println("\n \n")

    for(i in 10 downTo 0 ){ //? ОБРАТНЫЙ ЦИКЛ FOR
        println(i)
    }

    println("\n \n")

    for(el in 'a'..'g'){ //? ЦИКЛ FOR ПО АЛФАВИТУ
        println(el)
    }

    println("\n \n")

    for(el in 'a'..'g' step 2){ //? ЦИКЛ FOR ПО АЛФАВИТУ С ШАГОМ 2
        println(el)
    }

    println("\n \n")

    for(el in 'g' downTo 'a'){ //? ОБРАТНЫЙ ЦИКЛ FOR ПО АЛФАВИТУ
        println(el)
    }
}

fun ifVariable(){
    val x = 20
    if(x in 5..30){ //? ЧИСЛО В ДИАПАЗОНЕ
        println("Variable $x")
    }

    println("\n \n")

    if(x !in 5..30){ //? ЧИСЛО НЕ В ДИАПАЗОНЕ
        println("Variable $x")
    }
}