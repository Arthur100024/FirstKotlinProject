import kotlin.math.*

fun main(args: Array<String>) {
    val a = 5.0
    val b = 2.0
    val mathE = E
    val mathPI = PI
    val niceDouble = -13.24

    println("Сложение: ${a + b}")
    println("Вычитание: ${a - b}")
    println("Умножение: ${a * b}")
    println("Деление: ${a / b}")
    println("Остаток от деления: ${a % b}")
    println("База натурального логарифма: $mathE")
    println("Число ПИ: $mathPI")
    println("Вычисление наибольшего: ${max(5,10)}")
    println("Вычисление наименьшего: ${min(5,10)}")
    println("Вычислене модуля: ${abs(niceDouble)}")
    println("Вывод знака: ${sign(niceDouble)}")
    println("Синус: ${sin(mathPI)}")
    println("Косинус: ${cos(mathPI)}")
    println("Тангенс: ${tan(mathPI)}")
    println("Степень: ${2.0.pow(3)}")
    println("Корень: ${sqrt(144.0)} или ${144.0.pow(0.5)}")
    println("Экспанента: ${exp(2.0)}")
    println("Натуральный логарифм: ${log(100.0, E)} или ${ln(100.0)}")
    println("Логарифм 2: ${log2(8.0)}")
    println("Логарифм 10: ${log10(100.0)}")
    println("Округление: ${round(12.499)} и ${round(12.501)}")
    println("Округление в +: ${ceil(12.5)}")
    println("Округление в -: ${floor(12.5)}")



}