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

    public static void main(String[] args) {
        Node root = new Node(8);
        // Node root = new Node(1);
        preorderTraversal(root);
        
    }

}
