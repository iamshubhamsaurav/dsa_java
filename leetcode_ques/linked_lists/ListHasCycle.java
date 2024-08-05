package leetcode_ques.linked_lists;

import java.util.HashSet;

public class ListHasCycle {
   
     static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }


        public boolean hasCycleBruteForce(ListNode head) {
            if (head == null) return false;
            ListNode curr = head;
            HashSet<ListNode> set = new HashSet<>();
            while(curr.next != null) {
                if (set.contains(curr)) {
                    return true;
                } else {
                    set.add(curr);
                }
                curr = curr.next;
            }
    
            return false;
        }
    
         public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
    
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                
                if(slow == fast ) return true;
            }
    
            return false;
    
         }
    
}
