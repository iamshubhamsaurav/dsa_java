package leetcode_ques.bit_manipulations;

public class MissingNumber {

    // using hashset

    // using xor
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorArr = 0;
        int xorRange = 0;
        for(int i = 0; i < n; i++) {
            xorArr ^= nums[i];
        }

        for(int i = 1; i <= n; i++) {
            xorRange ^= i;
        }

        return (xorRange ^ xorArr);
    }

    // using sum
    public int missingNumberUsingSum(int[] nums) {
        int n = nums.length;
        int rangeSum = (n * (n+1)) / 2;
        
        int numSum = 0;
        for(int i: nums) {
            numSum += i;
        }

        return (rangeSum - numSum);
    }
    
}
