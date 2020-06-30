package main.moveZeroes;

import static java.util.Arrays.stream;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        stream(moveZeroes(nums)).forEach(val -> System.out.println(val));
    }

    public static int[] moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for(int currIndex = 0; currIndex < nums.length; currIndex++) {
           if (nums[currIndex] != 0) {
               int temp = nums[lastNonZeroFoundAt];
               nums[lastNonZeroFoundAt++] = nums[currIndex];
               nums[currIndex] = temp;
           }
        }
        return nums;
    }
}
