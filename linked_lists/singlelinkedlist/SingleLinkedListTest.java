package linked_lists.singlelinkedlist;

public class SingleLinkedListTest {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);

        head.next = temp1;
        temp1.next = temp2;

        // print(head);
        // printRecursive(head);
        // int index = search(head, 0);
        // System.out.println(index);

        // head = insertAtHead(head, 0);
        // print(head);
        
        head = insertAt(head, 1, 1);

    }

    static Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);

        if(head == null) {
            return newNode;
        }

        if (data < head.data) {
            newNode.next = head;
            return newNode;
        }

        Node curr = head;
        while (data > curr.data && curr.next != null) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    static Node deleteFirst(Node head) {
        if(head == null) return null;
        return head.next;
    }

    static Node deleteFromLast(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr = null;
        return head;
    }

    static Node insertAt(Node head, int data, int index) {
        Node newNode = new Node(data);
        if(index == 0) {
            newNode.next = head;
            return newNode;
        }

        Node curr = head;
        for (int i = 1; i < index && curr.next != null; i++) {
            curr = curr.next;
        }

        if(curr.next == null) {
            return head;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static int search(Node head, int x){
        int index = -1;

        Node curr = head;
        int i = 1;
        while (curr != null) {
            
            if(curr.data == x) {
                index = i;
                break;
            }
            curr = curr.next;
            i++;
        }


        return index;
    }

    static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static void printRecursive(Node node) {
        if(node == null) return;
        System.err.println(node.data);
        printRecursive(node.next);
    }

    static void print(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    // Middle of a linked list
    static void middleOfLinkedList(Node head) {
        if(head == null) return;
        if(head.next == null) System.out.println(head.data);
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
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