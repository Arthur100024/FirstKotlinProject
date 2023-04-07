import kotlin.random.Random

var randomInt: Int? = null
var randomBoolean: Boolean? = null

fun main(args: Array<String>) {

    randomInt = Random.nextInt(1,5)
    if (randomInt == 3){randomInt = null}
    randomBoolean = Random.nextBoolean()
    println("randomInt = $randomInt \nrandomBoolean = $randomBoolean \n")


    //? ОБЫЧНОЕ ИСПОЛЬЗОВАНИЕ IF
    if (randomInt != null){
        if (randomBoolean == true){
            println("randomBoolean равен true")
        } else if (randomBoolean == false && randomInt != null){
            println("randomBoolean не равен true")
        }
    } else {
        println("Переменная \$randomInt равна значению null")
    }
    //? ИСПОЛЬЗОВАНИЕ IF В ВИДЕ ВЫРАЖЕНИЯ
    var result = if(randomBoolean == true) 1 else 0
    println("randomBoolean = $result")




    //? ОБЫЧНОЕ ИСПОЛЬЗОВАНИЕ WHEN
    when(randomInt){
        null -> println("randomInt равна null")
        1 -> println("randomInt равна 1")
        2 -> println("randomInt равна 2")
        5 -> println("randomInt равна 5")
        else -> println("Ну я уже хз чему равна randomInt (возможно 4)")
    }
    //? ИСПОЛЬЗОВАНИЕ WHEN В ВИДЕ ВЫРАЖЕНИЯ
    var  result2 = when(randomInt){
        null -> "randomInt равна null"
        1 -> "randomInt равна 1"
        2 -> "randomInt равна 2"
        5 -> "randomInt равна 5"
        else -> "Ну я уже хз чему равна randomInt (возможно 4)"
    }
    println(result2)
}


