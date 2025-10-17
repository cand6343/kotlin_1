fun main() {
    print("Введите один символ: ")
    val input = readLine()!!

    val result = when (input) {
        in "a".."z", in "A".."Z" -> "буква латинского алфавита"
        in "0".."9" -> "цифра"
        in "а".."я", in "А".."Я" -> "буква кириллицы"
        " " -> "пробел"
        else -> "спецсимвол"
    }

    println("Символ '$input' является: $result")
}
