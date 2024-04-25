package linked_lists.circularlinkedlist;

public class CircularLinkedList {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = node;
        node = insertAtBeginning(node, 0);
        traverse(node);
        
    }

    static void traverse(Node node) {
        if(node == null) return;
        Node curr = node.next;
        System.out.println(node.data + " ");

        while (curr != node) {
            System.out.println(curr.data);
            curr = curr.next;       
        }
    }

    static Node insertAtBeginning(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = null;
            
        // handle error/ edge case
        if(head == null) {
            head = newNode;
            return head;
        }

        // make the newNode the next node of head
        newNode.next = head.next;
        head.next = newNode;

        // Swap the values of the head and newNode
        int temp = newNode.data;
        newNode.data = head.data;
        head.data = temp;

        return head;
    }

    // Niave Solution
    static Node insertAtBeginningNiave(Node head, int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            head.next = head;
        } else if (head.next == null) {
            head.next = newNode;
            newNode.next = head;
        } else {
            Node curr = head.next;
            while(curr.next != head) {
                curr = curr.next;
            }
            newNode.next = head;
            curr.next = newNode;
            head = newNode;
        }
        return head;
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
