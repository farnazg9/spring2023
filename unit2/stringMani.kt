
fun main(args: Array<String>) {

  
    val keyboard = Scanner(System.`in`)


    print("Enter the name of your favorite city: ")
    val city = keyboard.nextLine()

    
    keyboard.close()


    println("Number of characters: " + city.length)

   
    println(city.uppercase(Locale.getDefault()))

   
    println(city.lowercase(Locale.getDefault()))

   
    println(city[0])
}
