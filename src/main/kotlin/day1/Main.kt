package day1

import java.io.File

fun main() {

    val carriedByElf = mutableListOf<MutableList<Int>>()
    var currentElf = mutableListOf<Int>()

    File("day_01.txt").forEachLine { line ->
        if (line == "") {
            carriedByElf.add(currentElf)
            currentElf = mutableListOf()
        } else {
            currentElf.add(line.toInt())
        }
    }

    println("Part 1 : " + carriedByElf.maxOfOrNull { it.sum() }) // Part 1
    println("Part 2 : " + carriedByElf.map { it.sum() }.sortedDescending().subList(0, 3).sum()) // Part 1


}