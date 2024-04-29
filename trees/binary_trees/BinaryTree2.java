package trees.binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2 {
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

    static class BinaryTree {
        int index = -1;

        public Node buildTreePreOrder(int nodes[]) {
            index++;
            if(nodes[index] == -1) return null;

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTreePreOrder(nodes);
            newNode.right = buildTreePreOrder(nodes);

            return newNode;
        }
    }

    static void preorder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {
        if(root == null) return;
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }

    static void postorder(Node root) {
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // null for printing next line

        while(!q.isEmpty()) {
            Node curr = q.remove();

            if(curr == null) {
                System.out.println();
                if(q.isEmpty()) break; // if q is empty then break the loop
                else q.add(null); // if there not empty then new level exists - add null to queue
            } else { // if not null then print and add the left and right to queue
                System.out.print(curr.data + " "); // print the data
                if(curr.left != null) q.add(curr.left); // if left is not null then add it to queue
                if(curr.right != null) q.add(curr.right); // if right is not null then add it to queue
            }
        }
    }

    // Count the number of nodes - count the left and right seperately then add 1 to their sum
    // leftNodesCount + rightNodesCount + 1 -- 1 for the root node
    public static int count(Node root) {
        if(root == null) return 0;

        int leftNodes = count(root.left);
        int rightNodes = count(root.right);

        int total = leftNodes + rightNodes + 1;
        return total;
    }

    public static int sumOfNodes(Node root) {
        if(root == null) return 0;

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        int sum = leftSum + rightSum + root.data;
        return sum;
    }

    public static int height(Node root) {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int maxNode(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        
        int leftMax = maxNode(root.left);
        int rightMax = maxNode(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTreePreOrder(nodes);
        //System.out.println("Root: " + root.data);
        preorder(root);
        inorder(root);
        postorder(root);
        System.out.println("Level Order Traversal Below");
        levelorder(root);
        System.out.println("Count: " + count(root));
        System.out.println("Sum of Nodes: " + sumOfNodes(root));

        // Height of tree
        System.out.println("Height of tree: " + height(root));

        // Maximum node of tree
        System.out.println("MaxNode of trees: " + maxNode(root));
    }
}
