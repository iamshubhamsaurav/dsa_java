package tries;

public class TriesImpl1 {

    static class Node {
        Node[] children;
        boolean eow;

        Node() {
            children = new Node[26];
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root;

    static void insert(String word) {
        
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a'; // get the index of char

            if(root.children[idx] == null) { // if the array at that index is null then create a new Node there
                root.children[idx] = new Node();
            }
            if(i == word.length() - 1) {
                root.eow = true;
            }
            root = root.children[idx];
        }
    }

    public static void main(String[] args) {
        String words[] = {"a", "the", "their", "there", "any"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
    }
}
