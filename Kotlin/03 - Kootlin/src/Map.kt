fun main(args: Array<String>) {
    var map1 = hashMapOf(1 to "um", 2 to "dois", 3 to "três")

    map1.put(4, "quatro")
    map1[5] = "cinco"

    println(map1)

    println(map1.keys)
    println(map1.values)

    for (e in map1)
        println("${e.key} - ${e.value}")

    map1.forEach({
        k,v -> println("${k} - ${v}")
    })
}