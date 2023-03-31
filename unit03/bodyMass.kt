fun main() {

val weight = 175

val height = 65

val BMI = weight * 703 / height * height

if (BMI < 18.5) {

println("underweight")

} else if (BMI >= 18.5 && BMI <= 25) {

println("Optimal")

} else {

println("Overweight")

}
}
