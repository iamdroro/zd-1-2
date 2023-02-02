//ЗАДАНИЕ 2 НОМЕР 29
fun main(){
    try{
        println("Введите число n")
        var n = readLine()!!.toInt()
        if((n % 4==0 && n % 100!=0)||n % 400==0)
        {
          print("Високосный")

        }
        else{
            println("Не високосный")}
    }catch (e:Exception){
        println("Неправильный ввод данных")}
}