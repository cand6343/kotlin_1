fun main() {
    print("Введите ваш возраст: ")
    val age = readln().toInt()

    if (age < 12) {
        println("Вы ребёнок")
    } else if (age <= 17) {
        println("Вы подросток")
    } else {
        println("Вы взрослый")
    }
}