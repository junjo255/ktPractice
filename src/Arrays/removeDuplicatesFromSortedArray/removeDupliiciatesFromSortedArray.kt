package Arrays.removeDuplicatesFromSortedArray

fun main() {
    var nums = intArrayOf(3,3,5,5,5,9,9)
    println(removeDuplicates(nums))
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var tot = 0
    for (i in nums.indices) {
        if (nums[tot] != nums[i]) {
            tot++
            nums[tot] = nums[i]
        }
    }
    return tot + 1
}