package leetcode_ques.twoPointers;

public class ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int res = 0;
    
    // < and not <= because we want heights to be distinct not same
            while(left < right) { 
                int width = (right - left);
                int minHeight = Math.min(height[left], height[right]);
    
                int area = width * minHeight;
                res = Math.max(res, area);
    
                if(height[left] < height[right]) {
                    left += 1;
                } else { // if both are equal or right is smaller
                    right -= 1;
                }
    
            }
    
    
            return res;
        }
    }
}
