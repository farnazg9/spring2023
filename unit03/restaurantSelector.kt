fun main() {
    var vegetarian = false
    var vegan = false
    var glutenfree = false


    println("Is anyone in your party a vegetarian? yes/no ")
    val string1 = readln()
    when (string1) {
        "yes" -> vegetarian = true
        "no" -> vegetarian = false
    }
    println("Is anyone in your party a vegan? yes/no ")
    val string2 = readln()
    when (string2) {
        "yes" -> vegan = true
        "no" -> vegan = false
    }
    println("Is anyone in your party a glutenfree? yes/no ")
    val string3 = readln()
    when (string3) {
        "yes" -> glutenfree = true
        "no" -> glutenfree = false
    }
}
