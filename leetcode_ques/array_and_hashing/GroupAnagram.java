package leetcode_ques.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word: strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);

            if(!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);

        }

        return new ArrayList<>(map.values());
    }

    
    public static void main(String[] args) {
        
    }
}
