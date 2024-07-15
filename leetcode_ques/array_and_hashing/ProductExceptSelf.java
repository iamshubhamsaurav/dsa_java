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
        int prefix = 1;
        
        // storing prefix product
        res[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            res[i] = nums[i-1] * prefix;
            prefix = res[i];
        }

        // System.out.println("Pringint prefix");
        // for(int i = 0; i < res.length; i++) {
        //     System.out.print(res[i] + " ");
        // }

        System.out.println();

        // int postfix = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            res[i] = res[i] * nums[i+1];
            nums[i] = nums[i] * nums[i+1];
            // postfix = res[i];
        }

        return res;
    }
}
