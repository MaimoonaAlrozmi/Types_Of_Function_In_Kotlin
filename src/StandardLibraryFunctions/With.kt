package StandardLibraryFunctions

fun main() {
    data class Country(var city1: String, var city2: String, var city3: String)

    var country = Country("Ebb", " Aden", "Hadramot")

    with(country)
    {
        city1 = " Sana'a"
        city3 = " Taiz"
    }

    println(country)
}