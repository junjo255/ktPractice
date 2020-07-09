package main.codingChallenges.PlusOne

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *    Input: [1,2,3]
 *    Output: [1,2,4]
 *    Explanation: The array represents the integer 123.
 *
 * Example 2:
 *    Input: [4,3,2,1]
 *    Output: [4,3,2,2]
 *    Explanation: The array represents the integer 4321.
 */

fun main() {
//    val nums = intArrayOf(9,8,7,6,5,4,3,2,0)
    val nums = intArrayOf(7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6)
    plusOne(nums).forEach{println(it)}
}

fun plusOne(digits: IntArray): IntArray {
    val m = MutableList(0){0}
    val r = digits
            .reversed()
            .fold(1){ a, i ->
                m.add(if (i + a ==10) 0 else i + a)
                if (i + a == 10) 1 else 0
            }
    if (r==1){
        m.add(1)
    }
    return m.reversed().toIntArray()
}

// Doesn't work on values that are greater than Long
//fun plusOne(digits: IntArray) : IntArray {
//    var str = ""
//    var resStr = ""
//
//    for (value in digits) {
//        str += value.toString()
//        print(str.chars().)
//        resStr = (str.toLong() + 1).toString()
//    }
//    return resStr.split("").filter{it.isNotEmpty()}.map{it.toInt()}.toList().toIntArray()
//}
