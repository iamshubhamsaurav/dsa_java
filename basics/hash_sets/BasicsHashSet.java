package basics.hash_sets;

import java.util.HashSet;
import java.util.Iterator;

public class BasicsHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(2);
        set.add(3);
        set.add(5);

        // checking if element exists in set
        if(set.contains(2)) {
            System.out.println(2 + " - YES ");
        }
        if(set.contains(9)) {
            System.out.println(9 + " - NO");
        }

        // Delete
        set.remove(2);

        // Size 
        set.size();

        // printing all el of set
        System.out.println(set);
        System.out.println("Iterator");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
