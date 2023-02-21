fun main() {
    val principalAmount = 10000
    println("Principal amount is defined as: $principalAmount")

    val interestRate = 5
    println("The rate of interest is defined as: $interestRate %")

    val timePeriod = 3
    println("The time period is defined as: $timePeriod years")
    getCompoundInterest(principalAmount, interestRate, timePeriod)
}

fun getCompoundInterest(principalAmount: Int, interestRate: Int, timePeriod: Int) {
    val compoundInterest = principalAmount.toDouble() * Math.pow((1 + interestRate.toDouble()/100.00),timePeriod.toDouble()) - principalAmount
    println(" Compound Interest is: $compoundInterest")
}
