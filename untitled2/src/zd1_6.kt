//Задание 1 номер 8
fun main(){
    try{
        print("Введите числитель ")
        var a= readLine()!!.toDouble()
        print("Введите знаменатель ")
        var b= readLine()!!.toDouble()
        var c = a/b
        var s:Double
        s=Math.pow(c,3.0)+70* Math.pow(c,2.0) +14 * c
        print("Значение многочлена ${String.format("%.3f" , s)}")

    }catch (e:Exception){print("Ошибка ввода")}
}