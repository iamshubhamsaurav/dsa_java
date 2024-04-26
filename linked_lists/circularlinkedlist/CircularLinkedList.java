package linked_lists.circularlinkedlist;

public class CircularLinkedList {
    public static void main(String[] args) {
        Node node = new Node(3);
        node = insertAtBeginning(node, 2);
        node = insertAtBeginning(node, 1);
        // insertAtEnd(node, 4);
        
        traverse(node);
        
    }

    static void traverse(Node head) {
        if(head == null) return;
        
        Node curr = head;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);
    }

    static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = null;

        if(head == null) {
            head = newNode;
            return head;
        }

        newNode.next = head.next;
        head.next = newNode;

        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;

        return head;
    }

    static Node insertAtBeginning(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = null;
            
        // handle error/ edge case
        if(head == null) {
            head = newNode;
            head.next = newNode;
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

    // Delete from the Head - Effecient Solution
    static Node deleteHead(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;
        
        // Change the data of head with the data of head.next
        // Update the nead.next with head.next.next thereby removing the head completely in constant time
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    static Node deleteFromPosition(Node head, int position) {
        if(head == null) return head;
        if(position == 1) deleteHead(head);
        Node curr = head;
        int i = 1;
        while(i < (position - 1)) {
            curr = curr.next;
            i++;
        }
        curr = curr.next.next;
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
