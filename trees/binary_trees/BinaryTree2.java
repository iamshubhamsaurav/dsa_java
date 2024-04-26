package trees.binary_trees;

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

    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTreePreOrder(nodes);
        System.out.println("Root: " + root.data);
    }
}
