fun main(args: Array<String>) {

    var dias = arrayOf("seg", "ter", "qua")

    for (i in 8 .. 10){
        println("i = ${i}")
    }

    for (d in dias){
        println(d)
    }

    dias = dias + arrayOf("qui", "sex")

    for ((i, d) in dias.withIndex()){
        println("${i} - ${d}")
    }
}