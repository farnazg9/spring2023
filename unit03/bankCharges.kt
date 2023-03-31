fun main() {

        
       val BanksFee = 10.00 
        val LessThan20 = 0.10
        val Between20_39 = 0.08
        val Between40_59 = 0.06
        val MoreThan60 = 0.04
        var TotalFee = 0.0
        var Checks = 0


       
       val userInput = Scanner(System.`in`)
        println("Please enter the number of checks written this month:")
        Checks = userInput.nextInt()
        if (Checks < 20) {
            TotalFee = Checks * LessThan20 + BanksFee
           print("This month's service fees are $ $TotalFee")
        } else if (Checks == 20 || Checks < 40) {
            TotalFee = Checks * Between20_39 + BanksFee
            print("This month's service fees are $ $TotalFee")
        } else if (Checks == 40 || Checks < 60) {
            TotalFee = Checks * Between40_59 + BanksFee
            print("This month's service fees are $ $TotalFee")
        } else if (Checks > 60) {
            TotalFee = Checks * MoreThan60 + BanksFee
           print("This month's service fees are $ $TotalFee")
        }}
