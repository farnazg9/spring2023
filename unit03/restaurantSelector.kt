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

    if (vegetarian == false && vegan == false && glutenfree == false) {
        println("These are your restaurant choices:")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }

    else if (vegetarian == true && vegan == false && glutenfree == false) {
        println("These are your restaurant choices:")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }

    else if (vegetarian == true && vegan == false && glutenfree == true) {
        println("These are your restaurant choices:")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }

    else if (vegetarian == false && vegan == true && glutenfree == true) {
        println("These are your restaurant choices:")
        println("Corner Cafe")
        println("The Chef's Kitchen")
        println("Main Street Pizza Company")
        println("Mama's Fine Italian")
    }

    else if (vegetarian == false && vegan == false && glutenfree == true) {
        println("These are your restaurant choices:")
        println("Corner Cafe")
        println("The Chef's Kitchen")
        println("Main Street Pizza Company")
    }

    else {
        println("These are your restaurant choices:")
        println("Joe's Gourmet Burgers")
    }
}
