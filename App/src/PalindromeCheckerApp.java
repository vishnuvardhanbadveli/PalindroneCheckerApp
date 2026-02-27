import java.util.Scanner;

public class PalindromeCheckerApp {

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
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}