package User_DefinedFunctions

class AnonymousClass() {

    var am = ""

    fun anonymousFun() {

        var s: () -> String = {

            am = "anonymous function"
            am
        }

        println("this is an  explicit type  anonymous function")
    }

}

fun main() {

    var am=AnonymousClass()
    am.anonymousFun();
}