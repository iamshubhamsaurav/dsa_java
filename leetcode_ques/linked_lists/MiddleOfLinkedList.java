package leetcode_ques.linked_lists;

/**
 * MiddleOfLinkedList
 */
public class MiddleOfLinkedList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node middleOfLinkedList(Node head) {

        Node slow = head;
        Node fast = head.next;


        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);

        Node curr = head;
        for (int i = 2; i < 6; i++) {
            curr.next = new Node(i);
            curr = curr.next;
        }

        Node mid = middleOfLinkedList(head);

        System.out.println(mid.val);
    }
}