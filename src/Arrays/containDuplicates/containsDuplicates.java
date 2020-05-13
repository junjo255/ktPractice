package Arrays.containDuplicates;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicates {
    public static void main(String[] args) {
        int[] list = new int[] {1,2,3,4,5};

        System.out.println(containsDuplicate(list));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();

        for (int num : nums) {
            if(map.contains(num)) {
                return true;
            }
            map.add(num);
        }
        return false;
    }
}
