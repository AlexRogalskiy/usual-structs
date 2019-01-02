package usualstructs.step4

fun main(args: Array<String>) {
    println(nullableFactorial(6))
    println(nullableFactorial(null))
}

private fun nullableFactorial(input: Int?) = input?.let { fact(it) }

private fun fact(i: Int): Long {
    return if (i < 1)  1
    else i * fact(i - 1)
}
