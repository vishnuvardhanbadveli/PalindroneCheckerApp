import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string
        String normalized = input
                .replaceAll("\\s+", "")   // remove spaces
                .toLowerCase();           // convert to lowercase

        boolean isPalindrome = checkPalindrome(normalized, 0, normalized.length() - 1);

        if (isPalindrome) {
            System.out.println("The string is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }

    // Reuse recursive logic
    public static boolean checkPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkPalindrome(str, start + 1, end - 1);
    }
}