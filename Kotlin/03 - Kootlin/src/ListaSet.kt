fun main(args: Array<String>) {
    var lista1 = setOf(1,2,3,4,2,1,3,2,1,2,3,4)
    var lista2 = hashSetOf(1,2,3,4,2,1,3,2,1,2,3,4)

    println(lista1)
    println(lista2)

    lista2.add(5)

    for (e in lista2)
        println(e)
}