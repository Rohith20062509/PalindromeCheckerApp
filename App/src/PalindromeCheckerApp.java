/*
 *@author Rohith Reddy
 *@Version 1.0
 * This is to print Basic information
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;

        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome)
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");


    }
}
