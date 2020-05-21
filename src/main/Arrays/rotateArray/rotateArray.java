package main.Arrays.rotateArray;

import java.util.ArrayList;
import java.util.List;

public class rotateArray {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
//        Arrays.rotateArray(nums, 10);

        rotateArray(nums, 10).forEach(val -> System.out.println(val));
    }

    public static List<Integer> rotateArray(List<Integer> nums, int k) {
        if (nums.size() == 0) return nums;
        int realK = k;

        if (nums.size() < k) {
            realK = k % nums.size()  ;
        }

        while(0 < realK) {
            int toBeAdded = nums.get(nums.size() - 1);
            nums.remove(nums.size()-1);
            nums.add(0, toBeAdded);

            realK--;
        }
        return nums;
    }
}
