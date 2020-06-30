package main.reverseString

fun main() {
    val s = charArrayOf('h','e','l','l','o')

    reverseString(s).forEach{ println(it)}
}

fun reverseString(s: CharArray): CharArray {
    var left = 0
    var right = s.size - 1

    while(left < right) {
        var temp = s[left]
        s[left++] = s[right]
        s[right--] = temp
    }

    return s
}