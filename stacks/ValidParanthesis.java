package stacks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {
    // https://leetcode.com/problems/valid-parentheses/
    public static void main(String[] args) {

    
    }

    static boolean validParanthesis(String s) {
        Stack<Character> stack = new Stack<>(); 

        HashMap<String, String> map = new HashMap<>();

        map.put("}", "{");
        map.put("]", "[");
        map.put(")", "(");

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if(!stack.isEmpty() && map.get(ch).equals(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }



        return stack.isEmpty();
    }
}
