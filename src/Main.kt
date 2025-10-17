fun main() {
    print("Введите ваш уровень: ")
    val level = readln().toInt()

    if (level < 10) {
        println("Новичок\nПрибавка к HP: +10")
    } else if (level < 50) {
        println("Опытный\nПрибавка к HP: +30")
    } else {
        println("Легенда\nПрибавка к HP: +100")
    }
}