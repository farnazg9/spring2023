fun celsius(farenheit: Double): Double {

    return 5.0 / 9.0 * (farenheit - 32.0)

}
fun main(args: Array<String>) {
    println("farenheit\tCelsius")

    for (i in  0 .. 20) {
        val c = celsius(i.toDouble())
        println("$i\t\t\t$c")
    }
}
