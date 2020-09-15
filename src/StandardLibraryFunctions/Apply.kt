package StandardLibraryFunctions

fun main()
{
    data class Students(var Stu1 : String, var Stu2 : String,var Stu3 : String)

    var stu = Students(" MaimoOna"," Samar"," #####")
    stu.apply { this.Stu3 = " Osamah" }

    println(stu)

}
