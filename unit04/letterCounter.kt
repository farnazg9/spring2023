fun main() {
    print("Type a sentence: ")
    readLine()?.let { character ->

        var c = 0
        do {
            println("Your character appears: $character")
            c++
        }
        while (c < 0)
    }
}