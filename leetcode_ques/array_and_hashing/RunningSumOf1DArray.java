package leetcode_ques.array_and_hashing;

public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int sums[] = new int[nums.length];
        int sum = 0;
        for(int i=0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }

        return sums;
    }
}
