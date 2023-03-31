fun main() {

    val name1: String
    val name2: String
    val name3: String
    val time1: String
    val time2: String
    val time3: String

    val t1: Double
    val t2: Double
    val t3: Double

    val name1 = first
    val name2 = second
    val name3 = third
    val time1 = last
    val time2 = middle
    val time3 = current

    t1 = time1.toDouble()
    t2 = time2.toDouble()
    t3 = time3.toDouble()

    if (t1 > t2 && t1 > t3) {
            if (t2 > t3) {
               println("1st Place: $name1\n2nd Place: $name2\n3rd Place: $name3")
            } else {
               println("1st Place: $name1\n2nd Place: $name3\n3rd Place: $name2")
            }
        } else if (t3 > t2 && t3 > t1) {
           if (t2 > t1) {
              println("1st Place: $name3\n2nd Place: $name2\n3rd Place: $name1")
            } 
    }}
