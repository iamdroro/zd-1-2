
//Задание 1, номер 3
fun main(){
    try{
        println("Введите число К")
        var k =readLine()!!.toDouble()
        println("Введите число P")
        var p =readLine()!!.toDouble()
        print("Введите № 1 элемента")
        var count1= readLine()!!.toDouble()
        print("Введите № 2 элемента")
        var count2= readLine()!!.toDouble()
        var o=count1+count2
        var sum=0
        var a:Double
        for(l in count1.toInt()..count2.toInt())
        {
            if(l==1)
        {
            a=k
            sum =(sum + a).toInt();
        }
            if(l>1)
            {
                a = k * Math.pow(p, (l-1).toDouble())
                sum=(sum + a).toInt();
            }

        }
        println(sum)

    }   catch (e:Exception)
    {
        println("Ошибка ввода")
    }
}
