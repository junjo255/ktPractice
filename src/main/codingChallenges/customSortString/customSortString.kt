package main.codingChallenges.customSortString

/**
    791. Custom Sort String
    S and T are strings composed of lowercase letters. In S, no letter occurs more than once.

    S was sorted in some custom order previously. We want to permute the characters of T so
    that they match the order that S was sorted. More specifically, if x occurs before y in S,
    then x should occur before y in the returned string.

    Return any permutation of T (as a string) that satisfies this property.

    Example :
    Input:
    S = "cba"
    T = "abcd"
    Output: "cbad"
    Explanation:
    "a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a".
    Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.


    Note:

    S has length at most 26, and no character is repeated in S.
    T has length at most 200.
    S and T consist of lowercase letters only.
 */

fun main() {
    println(customSortString("kqep", "pekeq"))
}

fun customSortString(S: String, T: String): String {
    val tArr = T.toCharArray()
    val tCount = tArr.groupBy { it }.mapValues { it.value.count() }
    println(tCount)

    val sArr = S.toCharArray()

    var sValidStr = ""

    S.filter { it in tArr }.toCharArray().forEach { char ->
        tCount.forEach { (k, v) ->
           if (k == char && v > 1) {
               println(k)
               (v downTo 2).forEach { _ ->
                   sValidStr += char
               }
           }
       }
        sValidStr += char
    }

    return sValidStr + T.filterNot { it in sArr }
}
