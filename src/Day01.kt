fun main() {
    val input = readInput("day01")
    part1(input).println()
    part2(input).println()
}

fun part1(input: List<String>): Int {
    return sums(input).max()
}

fun part2(input: List<String>): Int {
    return sums(input).sortedDescending().take(3).sum()
}
fun sums(lines: List<String>): List<Int> {
    val sum = mutableListOf<Int>(0)
    for (line in lines) {
        if(line.isEmpty()) {
            sum += 0
        } else {
            sum[sum.lastIndex] += line.toInt()
        }
    }
    return sum
}