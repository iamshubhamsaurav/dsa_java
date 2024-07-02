package tries;

public class TriesImpl1 {

    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    static void insert(String word) {

        Node curr = root;
        
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a'; // get the index of char

            if(curr.children[idx] == null) { // if the array at that index is null then create a new Node there
                curr.children[idx] = new Node();
            }
            if(i == word.length() - 1) {
                curr.eow = true;
            }
            curr = curr.children[idx];
        }
    }

    static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            Node node = curr.children[idx];
            // check if node is null at idx - if so return false
            if(node == null) {
                return false;
            }
            // Node node = curr.children[idx]; // node at the index idx
            if(i == word.length() && node.eow == false) {
                return false;
            }

            curr = curr.children[idx]; 
            
        }

        return true;

    }

    public static void main(String[] args) {
        String words[] = {"aa", "the", "their", "there", "any"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        // for (int i = 0; i < 26; i++) {
        //     System.out.println(root.children[i]);
        // }
        // System.out.println(root.children[0]);
        System.out.println(search("any"));
        System.out.println(search("anything"));
    }
}
