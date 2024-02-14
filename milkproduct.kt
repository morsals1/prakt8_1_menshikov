class milkproduct {
    var name = "untiled"
    var weight = 0.0
    var fat = 0.0
    var producer = "pgt"
    var price = 0.0
    var descrip = 0
}
    fun input(t: milkproduct){
        try {
            println("введите название")
            t.name = readLine()!!.toString()
            println("введите вес")
            t.weight = readLine()!!.toDouble()
            println("введите жирность")
            t.fat = readLine()!!.toDouble()
            println("введите производителя")
            t.producer = readLine()!!.toString()
            println("введите цену")
            t.price = readLine()!!.toDouble()
        } catch (e:Exception) { println("неверный ввод") }
    }

    fun output(t: milkproduct){
        println("название: ${t.name}")
        println("вес: ${t.weight}")
        println("жирность: ${t.fat}")
        println("производитель: ${t.producer}")
        println("цена: ${t.price}")
        if (t.name == "молоко"){
            println("код 1")
        }
        else if (t.name == "творог"){
            println("код 2")
        }
        else if (t.name == "сыр"){
            println("код 3")
        }
    }
fun desinput (t: milkproduct){
    try {
        println("введите код с упаковки, чтобы прочитать описание")
        t.descrip = readLine()!!.toInt()
    } catch (e:Exception) { println("неверный ввод") }
}
fun desoutput (t: milkproduct){
    if(t.descrip == 1){
        println("молоко ....")
    }
    else if (t.descrip == 2){
        println("творог ....")
    }
    else if (t.descrip == 3){
        println("сыр ....")
    }
    else{
        println("вы не ввели код")
    }
}
