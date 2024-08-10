package leetcode_ques.bit_manipulations;

public class MissingNumber {

    // using hashset

    // using xor

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
