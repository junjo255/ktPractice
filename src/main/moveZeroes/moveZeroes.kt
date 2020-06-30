package main.moveZeroes

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *    Input: [0,1,0,3,12]
 *    Output: [1,3,12,0,0]
 *
 *    Note:
 *    You must do this in-place without making a copy of the array.
 *    Minimize the total number of operations.
 */
fun main() {
    val nums = intArrayOf(0,1,0,3,12)

    moveZeroes(nums).iterator().forEach { println(it) }
}
/**
 * Solution 1.
 * Complexity Analysis
 * Space Complexity : O(1). Only constant space is used.
 * Time Complexity: O(n). However, the total number of operations are optimal. The total operations
 * (array writes) that code does is Number of non-0 elements.This gives us a much better best-case
 * (when most of the elements are 0) complexity than last solution. However, the worst-case (when all elements are non-0)
 * complexity for both the algorithms is same.
 */

fun moveZeroes(nums: IntArray): IntArray {
    var lastNonZeroFoundAt = 0

    for ((currIndex, value) in nums.withIndex()) {
        if (value != 0) {
            var temp = nums[lastNonZeroFoundAt]
            nums[lastNonZeroFoundAt++] = nums[currIndex]
            nums[currIndex] = temp
        }
    }
    return nums
}