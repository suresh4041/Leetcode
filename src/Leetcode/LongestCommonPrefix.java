package Leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String arr[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result ="";
        if (strs != null && strs.length != 0) {
            char tmp[] = strs[0].toCharArray();
            for (int i = 0; i < tmp.length; i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (i == strs[j].length() || strs[j].charAt(i) != tmp[i]) {
                        result = strs[0].substring(0, i);
                    }
                }
            }
        }
        return result;
    }
}
