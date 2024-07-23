package leetcode_ques.array_and_hashing;
import java.util.HashMap;
import java.util.HashSet;;

public class UniqueNumberOfOccurances {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n: arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i: map.values()) {
            if(set.contains(i)) {
                return false;
            } 
            set.add(i);
            
        }

        return true;
    }
}
