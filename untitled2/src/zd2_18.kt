fun main(){
    try{
        println("Введите размер отверстия a")
        var a = readLine()!!.toDouble()
        println("Введите размер отверстия b")
        var b = readLine()!!.toDouble()
        println("Введите размер курпича")
        println("x=")
        var x = readLine()!!.toDouble()
        println("y=")
        var y = readLine()!!.toDouble()
        println("z=")
        var z = readLine()!!.toDouble()

        if(x<=a&&y<=b || x<=a&&z<=b || x<=b&&y<=a || x<=b&&z<=a || y<=a&&z<=b || y<=b && z<=a)
        {
            println("Кирпич пройдёт в отверстие")
        }
        else {
            println("Кирпич не пройдёт в отверстие")}

    }catch (e:Exception){
        println("Непавильный ввод данных")}
}