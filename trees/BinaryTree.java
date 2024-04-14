package trees;

public class BinaryTree {
    public static void main(String[] args) {
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right = new Node(3);

        inOrder(newNode);
    }

    static void inOrder(Node root) {
        if(root != null) {
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }

    static void preOrder(Node root) {
        if(root != null) {
            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void postOrder(Node root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }
    }
}

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}
