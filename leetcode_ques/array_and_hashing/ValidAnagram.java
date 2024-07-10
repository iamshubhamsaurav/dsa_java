package leetcode_ques.array_and_hashing;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String sortedS = new String(sArray);
        String sortedT = new String(tArray);

        if(!sortedS.equals(sortedT)) {
            return false;
        } 

        return true;
     }

     
    public static void main(String[] args) {
        
    }
}
