package leetcode_ques.array_and_hashing;

import java.util.HashSet;
import java.util.Set;

// Leetcode 217
// https://leetcode.com/problems/contains-duplicate/description/

public class ContainsDupicateDemo {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(numSet.contains(nums[i])) {
                return true;
            }
            else {
                numSet.add(nums[i]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
    }
}
