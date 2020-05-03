/**
 * 1. Two Sums
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 *   Given nums = [2, 7, 11, 15], target = 9,
 *   Because nums[0] + nums[1] = 2 + 7 = 9,
 *   return [0, 1].
 */
fun main(){
    val result = arrayOf(2,7,11,15)
    val target = 9
    twoSums(result, target)?.forEach{println(it)}
}

fun twoSums(list: Array<Int>, target: Int): IntArray? {
    val map = hashMapOf<Int, Int>()

    list.forEachIndexed{ index, element ->
        var complement = target - list[index]
        if (map.containsKey(complement)) {
            var valIndex = map.get(complement)
            val array = valIndex?.let { intArrayOf(it, index) }
            return array
        }
        map.put(list[index], index)
    }
    throw IllegalArgumentException("No two sum solution")

}
