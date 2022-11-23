fun main() {

    fun sol(input: List<String>): Int {
        val lines = input.toList()
        println(lines)
        val travels = lines.drop(1).map { it -> it.split(' ') }
            .fold(mutableMapOf<String, MutableList<Pair<String, Int>>>()) { acc, item ->
                acc[item[1].split("-").first()]
                //acc.put(item[1].split("-").first(), mutableListOf(Pair(item[0], item[1].toInt)))
            }
        return 1
    }


    var testInput = readInput("input03-1")
    var sol = readInput("output03-1").first().toInt()
    check(sol(testInput) == sol)
}
