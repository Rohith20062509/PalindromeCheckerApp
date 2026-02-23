/*
 *@author Rohith Reddy
 *@Version 1.0
 * This is to print Basic information
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
//        System.out.println("PalindromeCheckerApp");
//        System.out.println("Version : 1.0");
//        System.out.println("System initialized successfully");
        String input = "madam";
        boolean isPalindrome = true;

        // Loop till half of string
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}
