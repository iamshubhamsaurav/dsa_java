package leetcode_ques.array_and_hashing;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int res[] = productExceptSelf(nums);

        for(int n: res) {
            System.out.println(n);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        
        // storing prefix product
        res[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            res[i] = res[i-1] * nums[i - 1];
        }

        // calc post and storing the res
        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * postfix;
            postfix = nums[i] * postfix;
        }

        return res;
    }
}
