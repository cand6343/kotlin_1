fun main() {
    print("Введите число: ")
    val num = readLine()!!.toInt()

    if (num in 10..50) {
        println("Число $num входит в диапазон от 10 до 50 включительно")
    } else {
        println("Число $num НЕ входит в диапазон от 10 до 50 включительно")
    }
}