package main.codingChallenges.twoSums

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
    val result = arrayOf(2,15,11,7)
    val target = 9
    val res = listOf(2,3,4,5,6) // read-only
//    result.sortedArray().forEach{value -> println(value)}
    twoSums(result, target).forEach{println(it)}
}

fun twoSums(nums: Array<Int>, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()

    nums.forEachIndexed{ ind, int ->
        val complement = target - nums[ind]

        if (map.containsKey(complement)) {
            val valIndex = map.getValue(complement)

            return intArrayOf(valIndex, ind)
        }
        map[nums[ind]] = ind
    }
    throw IllegalArgumentException("No two sum solution")
}

/**
 * Creating Map
 * 1. mapOf(1 to "x", 2 to "y", -1 to "zz"): returns a new read-only map with the specified contents.
 * 2. emptyMap<String, Int>() : creates an empty map
 * 3. hashMapOf(1 to "x", 2 to "y", -1 to "zz") : a class which store hashmaps and to initialize
 *                  its object we use hasMapOf()
 * 4. mutableMapOf<Int, Any?>() :
 *
 * HashMap is an implementation of the interface mutableMap
 */

/**
 * 1. arrayListOf : returns an empty new ArrayList
 * 2. asList : returns a List that wraps the original array
 * 3. listOf : returns a new read-only list of given elementss
 * 4. arrayOf: returns an array containing the speicifed elements
 */
