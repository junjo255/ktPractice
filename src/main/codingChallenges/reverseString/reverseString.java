package main.codingChallenges.reverseString;

import static java.util.Arrays.stream;

/**
 * ReverseString
 Write a function that reverses a string. The input string is given as an array of characters char[].

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 You may assume all the characters consist of printable ascii characters.

 Example 1:

 Input: ["h","e","l","l","o"]
 Output: ["o","l","l","e","h"]
 Example 2:

 Input: ["H","a","n","n","a","h"]
 Output: ["h","a","n","n","a","H"]
 */
public class reverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};

        for (int i = 0 ; i < s.length ; i++) {
            System.out.println(reverseString(s)[i]);
        }
    }

    public static char[] reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }

        return s;
    }
}
