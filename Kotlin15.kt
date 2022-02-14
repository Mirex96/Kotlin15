//15. Написать функцию, которая на вход принимает массив и проходится по его значениям. Использовать циклом do-while
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    value(array)
}

fun value(array: Array<Int>) {
    var i = 0
    do {
        println(array[i])
        i++
    } while (i < 6)
}