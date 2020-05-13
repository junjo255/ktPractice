package Arrays.containDuplicates

/**
 * 217. Contains Duplicates
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the
 * array, and it should return false if every element is distinct.
 *
 * Example 1:
 *    Input: [1,2,3,1]
 *    Output: true
 *    Example 2:
 *
 * Example 2:
 *    Input: [1,2,3,4]
 *    Output: false
 *
 * Example 3:
 *    Input: [1,1,1,3,3,4,3,2,4,2]
 *    Output: true
 **/
fun main() {
    val list = intArrayOf(1,1,1,3,3,4,3,2,4,2) // true
    val list2 = intArrayOf(1,2,3,4) // false
    val list3 = intArrayOf(1,2,3,1) // true
    val list4 = listOf(1,2,3,1) // List<Int>
    val list5 = arrayListOf(1,2,3,1) // ArrayList<Int>


    println(containsDuplicates(list))
    println(containsDuplicates(list2))
    println(containsDuplicates(list3))

    println(containsDups(list))
    println(containsDups(list2))
    println(containsDups(list3))
}

// Sort - QuickSort: O(log n) * for loop: O(n)
fun containsDuplicates(nums: IntArray) : Boolean {
    if (nums.isEmpty()) return false
    val list = nums.sortedArray()

    for (index in list.indices) {
        if (index == list.size - 1) return false
        if (list[index] == list[index + 1]) {
            return true
        }
    }
    return false
}

// Set - remove/look-up O(1)
fun containsDups(nums: IntArray) : Boolean {
    var hashSet = HashSet<Int>()

    if (nums.isEmpty()) return false

    for (num in nums) {
        if (hashSet.contains(num)) {
            return true
        }
        hashSet.add(num)
    }
    return false
}
