package leetcode_ques.strings;

import java.util.HashSet;

public class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<Character>();

        for(int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        int total = 0;
        for(int i = 0; i < stones.length(); i++) {
            if(set.contains(stones.charAt(i))) {
                total++;
            }
        }
        return total;

    }
}
