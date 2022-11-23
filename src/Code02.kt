import java.lang.StringBuilder

fun main() {

    fun sol(input: List<String>): String {
        val lines = input.toList()
        println(lines)
        val seq = lines.first().split(' ').map { it.toInt() }
        val map = mapOf(
            1 to "a", 11 to "b", 111 to "c",
            2 to "d", 22 to "e", 222 to "f",
            3 to "g", 33 to "h", 333 to "i",
            4 to "j", 44 to "k", 444 to "l",
            5 to "m", 55 to "n", 555 to "o",
            6 to "p", 66 to "q", 666 to "r",
            7 to "s", 77 to "t", 777 to "u", 7777 to "v",
            8 to "w", 88 to "x", 888 to "y", 8888 to "z",
            9 to "z", 0 to " "
        )

        var sol = ""
        for (num in seq) {
            sol += (map[num])
        }

        return sol

    }


    var testInput = readInput("input02-1")
    var sol = readInput("output02-1").first()
    check(sol(testInput) == sol)
    testInput = readInput("input02-2")
    sol = readInput("output02-2").first()
    check(sol(testInput) == sol)
    testInput = readInput("input02-3")
    sol = readInput("output02-3").first()
    println(sol(testInput))
    println(sol)
    check(sol(testInput) == sol)

}
