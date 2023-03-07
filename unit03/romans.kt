fun main() {
    var number: Int
    print("enter a number in the range on 1 through 10: ")
    number = readLine()!!.toInt()

    when (number) {
        1 -> println("I")
        2 -> println("II")
        3 -> println("III")
        4 -> println("IV")
        5 -> println("V")
        6 -> println("VI")
        7 -> println("II")
        8 -> println("VII")
        9 -> println("IX")
        10 -> println("X")
        else -> println("error")

    }

}
