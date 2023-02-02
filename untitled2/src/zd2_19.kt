//ЗАДАНИЕ 2 НОМЕР 19
fun main(){
    try {
        println("Введите число а")
        var a = readLine()!!.toDouble()
        println("Введите число b")
        var b = readLine()!!.toDouble()
        println("Введите число c")
        var c = readLine()!!.toDouble()
        var tmp:Double
        if(a>b)
        {
            tmp=a
            a=b
            b=tmp;

        }
        else{tmp=b}
        if(tmp>=b)
        {
            println("1.a=$a,2.b=$b,3.c=$c")

        }
        else
            if (c>=a)
            {
                println("1.c=$c,2.a=$b,3.b=$b")
            }
        else {
                println("1.a=$a,2.c=$c,3.b=$b")}

    }catch (e:Exception){println("Введите данные правильно")}
}