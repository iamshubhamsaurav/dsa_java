package leetcode_ques.BinarySearchQues;

public class SearchInsert {
        public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;
            int mid = (start + end) / 2;
            while(start <= end) {
                mid = (start + end) / 2;
    
                if(nums[mid] == target) {
                    return mid;
                } else if(nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return end + 1;
        }
}
