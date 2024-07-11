package leetcode_ques.twoPointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start < end) {
            Character startChar = s.charAt(start);
            Character endChar = s.charAt(end);
            
            if(!Character.isLetterOrDigit(startChar)) {
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(endChar)) {
                end--;
                continue;
            }

            if(Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }

            start++;
            end--;
        }
        return true;

     }
     
    public static void main(String[] args) {
        
    }
}
