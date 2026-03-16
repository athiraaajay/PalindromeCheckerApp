import java.util.Stack;

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Implements palindrome validation using a Stack (LIFO).
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        // Stack pops in reverse order, so it should match the original string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false; // Not a palindrome
            }
        }
        return true; // Is a palindrome
    }
}

/**
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String testInput = "level";

        // Inject the strategy at runtime (Strategy Pattern)
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the selected algorithm
        boolean isPalindrome = strategy.check(testInput);

        // Output results
        System.out.println("Input : " + testInput);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}