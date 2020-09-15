package User_DefinedFunctions

class UserDefineClass() {
    var ud = ""

    fun userDefine(type: String) {
        ud = "user define function with no return value"
        println(ud)
    }

    fun userDefine1(): String {
        ud = "user define function with no return value"
        return ud
    }

}