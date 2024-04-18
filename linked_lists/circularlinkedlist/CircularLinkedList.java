package linked_lists.circularlinkedlist;

public class CircularLinkedList {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = node;

        traverse(node);
    }

    static void traverse(Node node) {
        Node curr = node.next;
        System.out.println(node.data + " ");

        while (curr != node) {
            System.out.println(curr.data);
            curr = curr.next;       
        }
    }
}

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        next = null;
    }
}
