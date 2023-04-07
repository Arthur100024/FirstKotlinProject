var globalVar = "This is global var"

fun main(args: Array<String>) {
    var localVar = "This is local var"

    var name: String = "Arthur";

    var a: Int = 1;
    val b: Int = 2;
    a = 2;

    var string: String = "Text"
    var char: Char = 'A'
    var boolean: Boolean = true
    var int: Int = 123
    var long: Long = 1234567891011121314
    var float: Float = 123.12346F
    var double: Double = 123.1234567891011

    var guessType = "Some text"
    var nullVar: Int? = null

    println()
    println("Hello $name!")
    println("\$name")
    println()
    println("a + b = ${a + b}")
    println()
    println("String: $string \nChar: $char \nBoolean: $boolean \nInt: $int \nLong: $long \nFloat: $float \nDouble: $double")
    println()
    println("Guess type: ${guessType.javaClass.name} \nNull var: $nullVar")
}