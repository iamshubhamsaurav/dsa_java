package leetcode_ques.linked_lists;

public class MergeTwoSortedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                res.next = list1;
                list1 = list1.next;
            } else {
                res.next = list2;
                list2 = list2.next;
            }
            res = res.next;
        }

        if(list1 != null) {
            res.next = list1;
        }

        if(list2 != null) {
            res.next = list2;
        }

        return dummy.next;
    }
}
