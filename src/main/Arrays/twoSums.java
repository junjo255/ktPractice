package main.Arrays;

import java.util.*;

public class twoSums {
    public static void main(String[] args) {
        int[] list = {2,7,11,15};
        int target = 9;
        twoSums(list, target).forEach(val -> System.out.println(val));
    }

    public static List<Integer> twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
        int complement = target - nums[i];
            if (map.containsKey(complement)) {
                List<Integer> arr = Arrays.asList(map.get(complement), i);
                return arr;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}