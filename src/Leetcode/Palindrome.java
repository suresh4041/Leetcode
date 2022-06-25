package Leetcode;

public class Palindrome {

    public static void main(String[] args) {
        if (isPalindrome(10))
            System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");

    }
    public static boolean isPalindrome(int x) {
        int result = x;
        int remainder = 0;
        if(x > 0 ) {
            while (x != 0) {
                remainder = remainder * 10 + x % 10;
                x = x / 10;
            }
        }
        return result==remainder;
    }
}
