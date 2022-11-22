fun main() {

    fun sol(input: List<String>) :Int {
        val lines = input.toList()
        println(lines)
        return lines.map{ it.toInt() }.let { it.first() * it.first() - it.last() * it.last() }
    }


    val testInput = readInput("input01-1")
    val sol = readInput("output01-1").first().toInt()
    check(sol(testInput) == sol)
}
