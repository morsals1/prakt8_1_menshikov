import java.time.LocalDate
import java.util.*
import kotlin.random.Random

class Exam {
    var st_name = "name"
    var item = "item"
    var date = LocalDate.parse("2020-04-18")
    var mark = 3
    var inspect = true
    var inspect2 = false
    var ticket = 4
    var otvet = "да"
    fun input(a: Exam){
        try {
            println("введите имя")
            a.st_name = readLine()!!.toString()
            println("введите предмет")
            a.item = readLine()!!.toString()
            println("введите дату")
            a.date = LocalDate.parse(readLine()!!.toString())
            println("введите оценку (от 0 до 5)")
            a.mark = readLine()!!.toInt()
            if(a.mark < 0 || a.mark >5) {
                inspect =  false
            }
        } catch (e:Exception) { println("неверный ввод") }
    }
    fun output(a:Exam){
        println("имя: ${a.st_name}")
        println("предмет: ${a.item}")
        println("дата: ${a.date}")
        if(inspect == true) {
            println("оценка: ${a.mark}")
        }
        else {
            println("введите оценку от 0 до 5, а вы ввели неверную оценку - ${a.mark}")
        }
    }
    fun option(a:Exam){
        if(a.mark>=0 && a.mark<=3){
            println("Ваша оценка за предмет - ${a.mark}")
            println("Но вы можете ее улчушить если хорошо сдадите экзамен")
        }
        else if (a.mark>3 && a.mark <=5){
            println("Ваша оценка за предмет - ${a.mark}")
            println("Вы хорошо знаете предмет, удачного экзамена")
        }
        println("тяните билет(enter)")
        readLine();
        a.ticket = Random.nextInt(0,100)
        println("вам выпал ${a.ticket} - вариант")
    }
    fun diff(a:Exam){
        if(a.ticket % 2 == 0){
            println("вам достался легкий вариант")
        }
        else if (a.ticket % 3 == 0){
            println("вам достался среддней сложности вариант")
        }
        else{
            println("вам достался УЛЬТРА МЕГА СЛОЖНЫЙ ВАРИАНТ")
        }
    }
    fun enter(a:Exam){
        println("Хотите сдать экзамен(да/нет)")
        a.otvet = readLine()!!.toString()
        if(a.otvet == "да" || a.otvet == "нет"){
            if(a.otvet == "нет"){
                println("окнчил учебу с справкой")
            }
            if (a.otvet == "да"){
                a.inspect2 = true
            }
        }
        else{
            println("можно вводит только да/нет")
        }
    }
}