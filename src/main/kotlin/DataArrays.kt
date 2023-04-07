fun main(args: Array<String>) {

    var items: Array<Int> = arrayOf(1,2,3,4,5,6) //? МАССИВ С ТИПОМ
    println(items.size) //? РАЗМЕР МАССИВА
    println(items[3]) //? ВЫВОД ТРЕТЬЕГО ПО ИНДЕКСУ
    items.set(3,10) //? ИЗМЕНЕНИЕ ТРЕТЬЕГО
    println(items.get(3)) //? ВЫВОД ТРЕТЬЕГО ЧЕРЕЗ GET
    for (el in items){ //? ВЫВОД ВСЕХ ЭЛЕМЕНТОВ ЧЕРЕЗ FOR
        print("$el, ")
    }


    println("\n \n \n")


    val someArray = arrayOf(1,2,3,4,5) //? МАССИВ БЕЗ ТИПА
    someArray.forEach { el -> //? ВЫВОД ВСЕХ ЭЛЕМЕНТОВ ЧЕРЕЗ FOREACH
        print("$el, ")
    }
    println()
    someArray.forEachIndexed{index, el -> //? //? ВЫВОД ВСЕХ ЭЛЕМЕНТОВ С ИНДЕКСОМ
        print("$el с индексом $index,   ")
    }


    println("\n \n \n")


    var someList = mutableListOf<Any>(1,2,3,4,5) //? СПИСОК С МНОЖЕСТВЕННЫМ ТИПОМ
    someList.add("Dogs") //? ДОБАВЛЕНИЕ ЭЛЕМЕНТА
    var dogs = listOf<Any>("Fight", "Ivory") //? ДОП СПИСОК
    someList.addAll(4,dogs) //? ДОБАВЛЕНИЕ ДОП СПИСКА
    printArray(someList)
}

fun printArray(items: List<Any>){
    items.forEach { el ->
        println(el)
    }
}