import javax.swing.JOptionPane

object RunningTheRace {
    @JvmStatic
    fun main(args: Array<String>) {

        // Declare variables to store user input
        val name1: String
        val name2: String
        val name3: String
        val time1: String
        val time2: String
        val time3: String


        val t1: Double
        val t2: Double
        val t3: Double


        name1 = JOptionPane.showInputDialog("Enter the first runners name")
        name2 = JOptionPane.showInputDialog("Enter the second runners name")
        name3 = JOptionPane.showInputDialog("Enter the third runners name")


        time1 = JOptionPane.showInputDialog("Enter the time runner 1 finished the race")
        time2 = JOptionPane.showInputDialog("Enter the time runner 2 finished the race")
        time3 = JOptionPane.showInputDialog("Enter the time runner 3 finished the race")


        t1 = time1.toDouble()
        t2 = time2.toDouble()
        t3 = time3.toDouble()


        if (t1 > t2 && t1 > t3) {
            if (t2 > t3) {
                JOptionPane.showMessageDialog(null, "1st Place: $name1\n2nd Place: $name2\n3rd Place: $name3")
            } else {
                JOptionPane.showMessageDialog(null, "1st Place: $name1\n2nd Place: $name3\n3rd Place: $name2")
            }
        } else if (t2 > t1 && t2 > t3) {
            if (t1 > t3) {
                JOptionPane.showMessageDialog(null, "1st Place: $name2\n2nd Place: $name1\n3rd Place: $name3")
            } else {
                JOptionPane.showMessageDialog(null, "1st Place: $name2\n2nd Place: $name3\n3rd Place: $name1")
            }
        } else if (t3 > t2 && t3 > t1) {
            if (t2 > t1) {
                JOptionPane.showMessageDialog(null, "1st Place: $name3\n2nd Place: $name2\n3rd Place: $name1")
            } else {
                JOptionPane.showMessageDialog(null, "1st Place: $name3\n2nd Place: $name1\n3rd Place: $name2")
            }
        }
    }
}