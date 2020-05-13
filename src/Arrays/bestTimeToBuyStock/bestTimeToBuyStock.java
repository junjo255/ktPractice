package Arrays.bestTimeToBuyStock;

public class bestTimeToBuyStock {
    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4};

        System.out.println(bestTimeToBuyStock(nums));
    }

    public static Integer bestTimeToBuyStock(int[] nums) {
        int totProfit = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int day1 = nums[i];
            int day2 = nums[i+1];
            if (day1 < day2) {
                totProfit += day2 - day1 ;
            }
        }
        return totProfit;
    }
}
