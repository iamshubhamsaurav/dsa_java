package leetcode_ques.sliding_window;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        while(right < s.length()) {
            char ch = s.charAt(right);
            if(set.add(ch)) {
                max = Math.max(max, right - left + 1); // initial 0 - 0 + 1 = 1
                right++;
            } else {
                // set already has the current character
                // remove all the characters before this character is found
                // abcbc = if the last b is the duplicate character then remove a from the beginning
                while(s.charAt(left) != ch) {
                    set.remove(s.charAt(left));
                    left++;
                }

                // Now we have reached the duplicate character - remove it
                set.remove(ch);
                left++;
            }
        }


        return max;
    }
}
