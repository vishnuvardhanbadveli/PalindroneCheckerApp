import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromePerformanceApp {

    // Stack Approach
    public static boolean stackMethod(String input) {
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

    // Deque Approach
    public static boolean dequeMethod(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // Two Pointer Approach (Most Efficient)
    public static boolean twoPointerMethod(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

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
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long startTime, endTime;

        // Stack timing
        startTime = System.nanoTime();
        boolean stackResult = stackMethod(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque timing
        startTime = System.nanoTime();
        boolean dequeResult = dequeMethod(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Two-pointer timing
        startTime = System.nanoTime();
        boolean twoPointerResult = twoPointerMethod(input);
        endTime = System.nanoTime();
        long twoPointerTime = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Stack Method: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Method: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two Pointer Method: " + twoPointerResult + " | Time: " + twoPointerTime + " ns");

        sc.close();
    }
}


