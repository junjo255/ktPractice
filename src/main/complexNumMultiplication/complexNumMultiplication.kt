package main.complexNumMultiplication

/**
    537. Complex Number Multiplication

    Given two strings representing two complex numbers.

    You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

    Example 1:
    Input: "1+1i", "1+1i"
    Output: "0+2i"
    Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.

    Example 2:
    Input: "1+-1i", "1+-1i"
    Output: "0+-2i"
    Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
    Note:

    The input strings will not have extra blank.
    The input strings will be given in the form of a+bi, where the integer a and b will both belong to the
    range of [-100, 100]. And the output should be also in this form.
    Accepted
 */
fun main() {
    val reg = "\\+|i".toRegex()

    println("1+1i".split(reg))
    println(complexNumMultiply("1+1i","1+1i"))
}

fun complexNumMultiply(a: String, b: String): String =
    a.let {
        val aSplit = it.split("\\+|i".toRegex())
        val bSplit = b.split("\\+|i".toRegex())

        val aInt = aSplit[0].toInt()
        val aImg = aSplit[1].toInt()
        val bInt = bSplit[0].toInt()
        val bImg = bSplit[1].toInt()

        val intVal = aInt * bInt - aImg * bImg
        val imgVal = aInt * bImg + aImg * bInt

        return "$intVal+$imgVal" + "i"
    }