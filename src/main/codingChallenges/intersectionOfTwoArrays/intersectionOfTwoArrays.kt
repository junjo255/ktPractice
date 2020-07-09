package main.codingChallenges.intersectionOfTwoArrays

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *    Input: nums1 = [1,2,2,1], nums2 = [2,2]
 *    Output: [2,2]
 *
 * Example 2:
 *    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 *    Output: [4,9]
 *
 * Note:
 *    Each element in the result should appear as many times as it shows in both arrays.
 *    The result can be in any order.
 *
 * Follow up:
 *    What if the given array is already sorted? How would you optimize your algorithm?
 *    What if nums1's size is small compared to nums2's size? Which algorithm is better?
 *    What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */

fun main() {
    val nums1 = intArrayOf(4,9,5)
    val nums2 = intArrayOf(9,4,9,8,4)

    intersectionOfTwoArrays(nums1, nums2).forEach{println(it)}
}

fun intersectionOfTwoArrays(nums1: IntArray, nums2: IntArray): IntArray {
    var map = hashMapOf<Int, Int>()
    var result = mutableListOf<Int>()
    for(num in nums1) {
        map[num] = map.getOrDefault(num, 0) + 1
    }

    for(value in nums2) {
        if(map.containsKey(value) && map[value]!! > 0) {
            result.add(value)
            map[value]?.minus(1)?.let { map.put(value, it) }
        }
    }

    var finalResult = IntArray(result.size)
    for((i, v) in result.withIndex()) {
        finalResult[i] = v
    }
    return finalResult
}