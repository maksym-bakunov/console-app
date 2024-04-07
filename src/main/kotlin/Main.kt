fun main() {
    println("Enter yoor city...")
    val strCity = readLine()
    if (strCity.isNullOrEmpty()) println("The City was not entered!")
    else println("User lives in ${strCity.uppercase()}")
}