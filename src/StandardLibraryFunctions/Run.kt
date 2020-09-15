package StandardLibraryFunctions

fun main() {

    var person = "Osamah"
    println(person)

    person = run {
        person = "This is run function"
        person
    }

    println(person) //This is run function
}