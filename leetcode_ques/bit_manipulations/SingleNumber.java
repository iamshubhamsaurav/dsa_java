package leetcode_ques.bit_manipulations;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int n: nums) {
            res = n ^ res;  // use of XOR bit operator
        }

        return res;
    }
}
