fun main() {

    fun sol(input: List<String>) : String {
        val lines = input.toList()
        println(lines)
        val (hour, minutes) = lines.first().split(":").map { it.toInt() }
        return if ((0 <= hour) && (23 >= hour) && (0 <= minutes) && (59 >= minutes))
            "YES"
        else
            "NO"
    }


    val testInput = readInput("input01-1")
    val sol = readInput("output01-1").first()
    check(sol(testInput) == sol)
}
