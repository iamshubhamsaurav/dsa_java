package leetcode_ques.array_and_hashing;

import java.util.HashMap;

public class TwoSumDemo {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if(map.containsKey(req) && map.get(req) != i) {
                return new int[]{i, map.get(req)};
            }
        }

        return new int[]{0,1};
    }

    public static void main(String[] args) {
        
    }
}
