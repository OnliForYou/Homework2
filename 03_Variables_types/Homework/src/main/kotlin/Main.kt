fun main() {
    var firstName = "Timur"
    var lastName = "Galeev"
    var height = 176.toDouble()
    var weight = 76f
    var heightChild = 150
    var weightChild = 40

    val isChild: Boolean
    isChild = height >= heightChild && weight >= weightChild

    val info = """
Имя: $firstName
Фамилия: $lastName
Рост: $height
Вес: $weight
   """.trimIndent()
    println(info)

    println("Он не ребенок: $isChild")

}