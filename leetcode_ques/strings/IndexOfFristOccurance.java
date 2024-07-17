package leetcode_ques.strings;

public class IndexOfFristOccurance {
    public static int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) return 0;
        char first = needle.charAt(0);
        int end = haystack.length() - needle.length();
        for(int i = 0; i <= end; i++) {
            if(haystack.charAt(i) == first) {
                String sub = haystack.substring(i, i + needle.length());
                if(sub.equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
