package main.Arrays.intersectionOfTwoArrays;

import java.util.*;

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2,2};

       Arrays.stream(intersect(nums1, nums2)).forEach(val -> System.out.println(val));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> holder = new ArrayList<>();

        for(int num : nums2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int val : nums1) {
            if (map.containsKey(val) && map.get(val) != 0) {
                holder.add(val);
                map.put(val, map.get(val) - 1);
            }
        }

        int[] result = new int[holder.size()];
        for (int i = 0; i < holder.size(); i++){
            result[i] = holder.get(i);
        }

        return result;

        // this results in 2-3ms slower
        // return result.stream().mapToInt(i->i).toArray();
    }
}
