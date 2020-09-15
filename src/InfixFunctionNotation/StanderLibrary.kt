package InfixFunctionNotation

class StringCollection {

    infix fun add(s: String) {
        println("Infix function")
    }

    fun build() {
        this add "abc"
        add("abc")
    }
}

fun main() {
    var m = StringCollection();
    println(m.build())

}