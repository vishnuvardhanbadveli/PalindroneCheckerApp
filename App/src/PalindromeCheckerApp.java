import java.util.Scanner;

public class PalindromeCheckerApp {

 UC11-Oop
    // Service class (Encapsulated logic)
    static class PalindromeChecker {

        public boolean checkPalindrome(String input) {

            if (input == null) {
                return false;
            }

            // Normalize string (ignore spaces & case)
            String normalized = input
                    .replaceAll("\\s+", "")
                    .toLowerCase();

            int start = 0;
            int end = normalized.length() - 1;

            while (start < end) {
                if (normalized.charAt(start) != normalized.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }

            return true;

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
 main
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
 UC11-Oop
        String input = sc.nextLine();

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        String input = sc.nextLine(
        // Normalize string
        String normalized = input
                .replaceAll("\\s+", "")   // remove spaces
                .toLowerCase();           // convert to lowercase

        boolean isPalindrome = checkPalindrome(normalized, 0, normalized.length() - 1);
main

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
 UC11-Oop


    // Reuse recursive logic
    public static boolean checkPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;

        // Convert string to linked list
        Node head = null, tail = null;

        for (int i = 0; i < input.length(); i++) {
            Node newNode = new Node(input.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        boolean isPalindrome = checkPalindrome(head);

        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT  a Palindrome.");
main
        }

        return checkPalindrome(str, start + 1, end - 1);
    }

    // Function to check palindrome using linked list
    public static boolean checkPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle using fast and slow pointers
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow);

        // Step 3: Compare both halves
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Function to reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
 main
}