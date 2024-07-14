package leetcode_ques.array_and_hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {

    static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str : strs) {
            Integer length = str.length();
            encodedString.append(length.toString() + "#" + str);
        }

        return encodedString.toString();
    }

    static List<String> decode(String encodedString) {
        List<String> strs = new ArrayList<>();

        int i = 0;
        while(i < encodedString.length()) {
            int j = i;

            while(encodedString.charAt(j) != '#') {
                j++;
            }
            int length = Integer.valueOf(encodedString.substring(i, j));

            // update the index of i to first char of next str; 
            i = j + length + 1;// +1 cause we want to start with the first char of next str

            strs.add(encodedString.substring(j + 1, i));
        }

        return strs;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("I ");
        list.add("Like ");
        list.add("Apple ");
        
        String encodedString = encode(list);
        System.out.println(encodedString);

        list.clear();
        list = decode(encodedString);

        System.out.println();

        for (String string : list) {
            System.out.print(string);
        }
    }
}
