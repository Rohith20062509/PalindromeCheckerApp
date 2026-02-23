/*
 *@author Rohith Reddy
 *@Version 1.0
 * This is to print Basic information
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Declare and initialize input string
        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push each character into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare original string with stack pop
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);


    }
}
