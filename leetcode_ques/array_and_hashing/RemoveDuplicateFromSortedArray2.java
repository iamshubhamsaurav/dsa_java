package leetcode_ques.array_and_hashing;

public class RemoveDuplicateFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        int count = 1;
        while(i < nums.length) {
             if(nums[i] == nums[i-1]) {
                 count += 1;
             } else {
                 count = 1;
             }
 
             if(count <= 2) {
                 nums[j] = nums[i];
                 j++;
             }
             i++;
        } 
 
        return j;
     }
}
