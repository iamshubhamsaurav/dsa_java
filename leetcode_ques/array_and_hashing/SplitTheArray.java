package leetcode_ques.array_and_hashing;

import java.util.HashMap;

public class SplitTheArray {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i: map.keySet()) {
            if(map.get(i) > 2) {
                return false;
            }
        }

        return true;
    }
}
