package other_questions;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PrintKLargestElement {

    static void printKLargestElements(int nums[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }

        for(int i = k; i < nums.length; i++) {
            if(pq.peek() < nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll());
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8};
        printKLargestElements(nums, 4);
    }
}
