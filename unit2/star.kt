    internal object StarPattern {
        @JvmStatic
        fun main(args: Array<String>) {
            var x = 1
            var increment_by = 2
            while (x > 0) {
// print spaces
                val spaces = 4 - x / 2
                for (i in 1..spaces) print(" ")
                // print asterisks
                for (i in 1..x) print("*")
                // end line
                println()
                // change width
                if (x == 7) increment_by = -2 // reverse
                x += increment_by
            }
        }
    }
