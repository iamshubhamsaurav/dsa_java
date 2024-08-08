package leetcode_ques.BinarySearchQues;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(target == nums[mid]) return mid;

            if(nums[left] <= nums[mid]) { // left sorted array
                if(target > nums[mid] || target < nums[left]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if(target > nums[right] || target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }
        }

        return -1;
    }
}
