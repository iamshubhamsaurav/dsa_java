package basics.hash_maps;

import java.util.*;;

public class BasicsHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Shubham");
        map.put(1, "Saurav");
        map.put(2, "ABC");
        map.put(3, "DEF");

        // Removing item
        map.remove(0);

        // Check if key exists in map
        if(map.containsKey(1)) {
            System.out.println("Contains 1");
            // get the value using key
            System.out.println(map.get(1));
        }

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Set<Integer> keySet = map.keySet();
        for(int k: keySet) {
            System.out.println(map.get(k));
        }



    }
}
