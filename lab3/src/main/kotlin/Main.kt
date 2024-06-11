class Student(val name: String, val subjects: List<String?>) {
    fun isCapableForSession(): Boolean {
        return subjects.any { it != null }
    }
}

fun main() {
    val student1 = Student("Студент 1", listOf("Фіз-ра", null, null))
    val student2 = Student("Студент 2", listOf(null, null, null))
    val student3 = Student("Студент 3", listOf("Екологія", "Історія науки і техніки", "Основи і теорія програмування"))
    val student4 = Student("Студент 4", listOf(null, null, "Основи і теорія програмування"))

    println("${student1.name} здатний на сесію: ${student1.isCapableForSession()}")
    println("${student2.name} здатний на сесію: ${student2.isCapableForSession()}")
    println("${student3.name} здатний на сесію: ${student3.isCapableForSession()}")
    println("${student4.name} здатний на сесію: ${student4.isCapableForSession()}")
}
