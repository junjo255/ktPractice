package Arrays.removeDuplicatesFromSortedArray;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3,3,5,5,5,9,9};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int tot = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] != nums[tot]) {
                tot++;
                nums[tot] = nums[i];
            }
        }
        return tot + 1;
    }

//         i = 0 1 2 3 4 5 6
//       tot = 0 0 1 1 1 1 2
//   nums[i] = 3 3 5 5 5 9 9
// nums[tot] = 3 3 5 5 5 9 9
}
