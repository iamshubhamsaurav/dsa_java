package trees.binary_search_tree;

public class BinarySearchTreeSol {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void preorderTraversal(Node root) {
        if (root != null) {
            preorderTraversal(root.left);
            System.out.print(root.data + " ");
            preorderTraversal(root.right);
        }
    }

    static boolean searchRecursive(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.data == key) {
            return true;
        } else if (root.data < key) {
            return searchRecursive(root.right, key);
        } else {
            return searchRecursive(root.left, key);
        }
    }

    static Node insertRecursive(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        } else if (root.data > data) {
            root.left = insertRecursive(root.left, data);
        } else if (root.data < data) {
            root.right = insertRecursive(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        // Node root = new Node(1);
        preorderTraversal(root);
        
    }

}
