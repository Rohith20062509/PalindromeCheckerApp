public class LinkedListPalindrome {

    // Node class
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Check if linked list is palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle using slow & fast pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow);
        Node copySecondHalf = secondHalf;

        // Step 3: Compare both halves
        Node firstHalf = head;
        while (copySecondHalf != null) {
            if (firstHalf.data != copySecondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            copySecondHalf = copySecondHalf.next;
        }

        return true;
    }

    // Reverse linked list
    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Helper method to insert at end
    public static Node append(Node head, char data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        String input = "madam";

        for (char ch : input.toCharArray()) {
            head = append(head, ch);
        }

        if (isPalindrome(head)) {
            System.out.println("Linked List is a palindrome.");
        } else {
            System.out.println("Linked List is not a palindrome.");
        }
    }
}