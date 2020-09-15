package InfixFunctionNotation

fun main() {

    infix fun Int.add(b: Int): Int = this + b
    val x = 10 add 20
    println("value of x =$x")
}