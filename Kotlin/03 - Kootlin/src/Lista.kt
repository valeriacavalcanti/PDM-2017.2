fun main(args: Array<String>) {
    var lista1 = listOf("um", "dois", "três")
    var lista2 = arrayListOf("1", "2", "3")
    var lista3 = mutableListOf(1, 2, 3)
    var lista4 = ArrayList<Int>()

    println(lista1)
    println(lista1[1])

    lista2.add("4")
    lista3.add(4)
    lista4.add(1)

    println("${lista1}\n${lista2}\n${lista3}\n${lista4}")
}