package other_questions;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PurchasingMaxItems {

    static int purchasingMaxItems(List<Integer> nums, int sum) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums);

        int res = 0;

        while(sum > 0 && !pq.isEmpty() && pq.peek() <= sum) {
            sum = sum - pq.poll();
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        Integer nums[] = {1,12,5,3,11};
        List<Integer> arr = Arrays.asList(nums);
        int sum = 10;
        int res = purchasingMaxItems(arr, sum);
        System.out.println(res);
    }
}
