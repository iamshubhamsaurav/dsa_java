package leetcode_ques.array_and_hashing;

import java.util.HashSet;

public class LongestConsecutive {
    
    public int longestConsecutive(int[] nums) { 
        if(nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        int longest = 1;

        for(int i = 0; i < nums.length;i++) {
            set.add(nums[i]);
        }

        for(int n: nums) {
            if(!set.contains(n-1)) {
                int length = 1;
                int newNum = n + 1;
                while(set.contains(newNum)) {
                    length++;
                    newNum++;
                }

                if(longest < length) {
                    longest = length;
                }
            }
        }

        return longest;

    }
}
