import kotlin.math.log

//задание 1 номер 6(8)
fun main(){
    try {
        println("Введите число а")
        var a = readLine()!!.toDouble()
        println("Введите число b")
        var b = readLine()!!.toDouble()
        println("Введите число c")
        var c = readLine()!!.toDouble()
        println("Введите число d")
        var d = readLine()!!.toDouble()
        println("Введите степень n")
        var n = readLine()!!.toDouble()

        var s: Double
        s = (0.25 * (a - b)) / (1 / 8 - (Math.abs(b)) / (Math.pow(10.0, n + 3.0) + Math.log(b) / (c - d)))
        print(s)
    }catch (e:Exception){println("Ошибка ввода")}
}