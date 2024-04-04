package trees;

public class BinaryTree {
    public static void main(String[] args) {
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right = new Node(3);
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
