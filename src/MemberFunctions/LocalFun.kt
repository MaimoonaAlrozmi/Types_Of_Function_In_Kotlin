package MemberFunctions

class MemberFun {
    private var funType = ""


    fun applyLocalFun() {
        funType = "this is a local function"
        fun printtype() {
            println(funType)

        }
        printtype()
    }
}

fun main() {
    var v=MemberFun()
    v.applyLocalFun()
}