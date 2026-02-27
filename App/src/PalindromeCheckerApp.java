import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack-Based Strategy
class StackStrategy implements PalindromeStrategy {

 UC12-strategypattern
    @Override
    public boolean check(String input) {

 UC11-Oop
    // Service class (Encapsulated logic)
    static class PalindromeChecker {
 main

        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque-Based Strategy
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

 UC12-strategypattern
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : normalized.toCharArray()) {
            deque.addLast(c);

            return true;

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
 main
 main
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
 UC11-Oop
        String input = sc.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeChecker checker = new PalindromeChecker(strategy);
        boolean result = checker.execute(input);

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