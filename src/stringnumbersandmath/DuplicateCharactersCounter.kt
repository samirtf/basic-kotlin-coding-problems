package stringnumbersandmath

class DuplicateCharactersCounter(private val string: String): CodingProblem {

    override fun getDescription(): String {
        return """Write a program that counts duplicate characters from a given string"""
    }

    override fun execute() {
        val duplicatedCharactersMap: Map<Char, Int> = string.groupBy { it }.mapValues { it.value.count() }
        print(duplicatedCharactersMap)
    }

}