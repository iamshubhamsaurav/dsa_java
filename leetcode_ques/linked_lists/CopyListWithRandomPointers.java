package leetcode_ques.linked_lists;

import java.util.HashMap;

/**
 * CopyListWithRandomPointers - Leetcode 138
 */
public class CopyListWithRandomPointers {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();

        Node curr = head;

        while(curr != null) {
            Node newNode = new Node(curr.val);
            map.put(curr, newNode);
            curr = curr.next;
        }

        curr = head;
        while(curr != null) {
            
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
        
    }


    public static void main(String[] args) {
        
    }
}