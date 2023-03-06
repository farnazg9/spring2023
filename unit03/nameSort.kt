package unit03
fun main () {

    var name1 = "a"
    var name2 = "a"
    var name3 = "a"

    if (name1 < name2) {

        println("name1 comes before name2")}
    else {
        println ("name1 comes after name2")
    }
}




object SortedNames {
    @JvmStatic
    fun main(args: Array<String>) {

        //Declare Variables
        val name1: String
        val name2: String
        val name3: String

        //Accept User Imput
        val keyboard = Scanner(System.`in`)
        print("Please Enter First Name ")
        name1 = keyboard.nextLine()
        print("Please Enter Second Name ")
        name2 = keyboard.nextLine()
        print("Please Enter Third Name ")
        name3 = keyboard.nextLine()


        //Compare
        if (name2.compareTo(name1, ignoreCase = true) < 0 && name2.compareTo(name3, ignoreCase = true) < 0) {
            println(name2)
        }

        //Compare
        if (name1.compareTo(name2, ignoreCase = true) < 0 && name1.compareTo(name3, ignoreCase = true) < 0) {
            println(name1)
        }

        //Compare
        if (name3.compareTo(name1, ignoreCase = true) < 0 && name3.compareTo(name2, ignoreCase = true) < 0) {
            println(name3)
        }
    }
}