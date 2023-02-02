//ЗАДАНИЕ 2 НОМЕР 9
fun main(){
    try {
        println("Введите число а")
        var a = readLine()!!.toDouble()
        println("Введите число b")
        var b = readLine()!!.toDouble()
        println("Введите число c")
        var c = readLine()!!.toDouble()
        if (a>1&&a<3)
        {
            print("Число а=$a принадлежит интервалу (1,3)")

     }
        else{println("Число а=$a не принадлежит интервалу (1,3)");}
        if (b>1&&b<3)
        {
            print("Число b=$b принадлежит интервалу (1,3)")

        }
        else{println("Число b=$b не принадлежит интервалу (1,3)");}
        if (c>1&&c<3)
        {
            println("Число c=$c принадлежит интервалу (1,3)")

        }
        else{println("Число c=$c не принадлежит интервалу (1,3)");}
   }catch (e:Exception){print("Введены неправильно данные")}
}