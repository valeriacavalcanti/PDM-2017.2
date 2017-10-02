fun main(args: Array<String>) {
    val numero = 10

    var str = if (numero > 0){
        println("Positivo")
        "primeiro"
    }else if (numero < 0){
        println("Negativo")
        "segundo"
    }else{
        println("zero")
        "terceiro"
    }

    println(str)

    var str2 = if (numero > 0) "maior" else "nao maior"

    println(str2)


    var dia = 1

    var diaStr = when(dia){
        1 -> "um"
        2 -> "dois"
        3 -> "três"
        4 -> "quatro"
        else -> "nenhum"
    }

    println(diaStr)

}