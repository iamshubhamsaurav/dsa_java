package leetcode_ques.bit_manipulations;

import java.util.HashSet;

public class MissingNumber {

    // using hashset
    public int missingNumberUsingHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums) {
            set.add(n);
        }

        for(int i = 0; i <= nums.length; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }

        return 0;
    }

    // using xor
    public int missingNumberUsingXOR(int[] nums) {
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
