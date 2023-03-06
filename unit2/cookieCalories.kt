internal object Cookies {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter how many cookies you ate: ")
        val cookieCount = 40
        val servingSize = 40 / 10
        val caloriesPerCookie = 300 / servingSize
        val totalCalories = cookieCount * caloriesPerCookie
        println("Total calories consumed: $totalCalories")
    }
}
