package StandardLibraryFunctions

fun main() {

    data class Person(var name: String, var age: Int)

    val person = Person(" Maimoona", 22)
    val p1 = person.let { it.age = 30 }
    val p2 = person.also { it.age = 24 }

    println(p1)
    println(p2)
    println(person)
}