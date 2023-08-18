import kotlin.random.Random


fun main () {
    val responses = arrayOf(
        "Yes!",
        "No!",
        "You better believe it!",
        "Absolutely not!",
        "Forget about it.",
        "Absolutely!",
        "Lets just say no for now.",
        "I don't think so.",
        "Ask me again tomorrow.",
        "I have no idea.",
        "Don't do it!",
        "Sleep on it.",
    )
   var playAgain = true

    while (playAgain){
        println("Ask a yes or no question: ")
        val answer = readln()
        val magic = Random.nextInt(11)
        println(responses[magic])
        println("Do you want to play again?")
        var endGame = readln()
        if(endGame == "no") {
            playAgain = false

            }
    }

}
