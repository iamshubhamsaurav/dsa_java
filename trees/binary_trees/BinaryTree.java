package trees.binary_trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    public static void main(String[] args) {
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right = new Node(3);
        newNode.left.left = new Node(4);
        newNode.left.right = new Node(5);

        newNode.right.left = new Node(6);
        newNode.right.right = new Node(7);

        inOrder(newNode);
        System.out.println("Height: " + height(newNode));
        printKDistantNode(newNode, 1);
        System.out.println("Level Order Traversal Below");
        levelOrderTraversal(newNode);
        System.out.println("Size of tree: " + getSize(newNode));
        System.out.println("Max Node: " + getMax(newNode));
    }

    static int getSize(Node root) {
        if(root == null) return 0;
        else return 1 + getSize(root.left) + getSize(root.right);
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

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static void printKDistantNode(Node root, int k) {
        if(root == null) return;
        if(k==0) System.out.println(root.key + " ");
        else {
            printKDistantNode(root.left, k - 1);
            printKDistantNode(root.right, k - 1);
        } 
    }

    static void levelOrderTraversal(Node root) {
        if(root == null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false) {
            Node curr = q.poll();
            System.out.println(curr.key);
            if(curr.left != null) {
                q.add(curr.left);
            }
            if(curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    void iterativeInOrderTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || stack.isEmpty() == false) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.println(curr.key + " ");
            curr = curr.right;
        }
    }

    void iterativePreOrderTraversal(Node root) {
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(stack.isEmpty() != false) {
            Node curr = stack.pop();
            System.out.println(curr.key + " ");
            if(root.right != null) stack.push(curr.right);
            if(root.left != null) stack.push(curr.left);
        }
    }

    // This can also be done using the iterative method using the level order traversal
    static int getMax(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
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
