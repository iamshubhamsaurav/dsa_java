package leetcode_ques.array_and_hashing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class TopKFrequentNumber {

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,1,2,3,4,5,6,5,5,5,5};
        int k = 2;
        ArrayList<Integer> res = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> frequency[] = new ArrayList[nums.length + 1];
        for(int i = 0; i < nums.length + 1; i++) {
            frequency[i] = new ArrayList<Integer>();
        }
        // for(int i = 0; i < nums.length; i++) {
        //     int freq = map.get(nums[i]);
        //     frequency[freq + 1].add(nums[i]);
        // }

        for (int n : map.keySet()) {
            int freq = map.get(n);
            frequency[freq + 1].add(n);
        }

        int idx = nums.length;
        int count = 0;
        for(int i = idx; i > 0; i--) {
            if(frequency[i].size() != 0) {
                int j = 0;
                while(j < frequency[i].size() && count < k) {
                    System.out.println(frequency[i].get(j));
                    Integer el = frequency[i].get(j);
                    res.add(el);
                    j++;
                    count++;
                }
                
                
            }
        }

    }
}
