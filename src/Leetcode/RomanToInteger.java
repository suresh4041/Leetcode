package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    /**
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * * Example 1:
     *
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     * Example 2:
     *
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     * Example 3:
     *
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
      * @param args
     */


    public static void main(String[] args) {
        System.out.println(romantoInt("VI"));
    }

    private static int romantoInt(String s) {
        int result =0;
        Map<Character,Integer> values = new HashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        for(int i=0;i<s.length();i++){
            if (i+1 == s.length() || values.get(s.charAt(i)) >= values.get(s.charAt(i + 1))) {
                result += values.get(s.charAt(i));
            } else {
                result -= values.get(s.charAt(i));
            }
        }
        return result;
    }
}
