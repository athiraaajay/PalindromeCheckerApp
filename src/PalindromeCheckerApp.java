import java.util.Stack;

/**
 * INTERFACE - PalindromeStrategy
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * This class measures and compares the execution performance.
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String testInput = "level";

        // Use the strategy implementation
        PalindromeStrategy strategy = new StackStrategy();

        // 1. Capture execution start time
        long startTime = System.nanoTime();

        // 2. Execute the algorithm
        boolean isPalindrome = strategy.check(testInput);

        // 3. Capture execution end time
        long endTime = System.nanoTime();

        // 4. Calculate total execution duration
        long duration = endTime - startTime;

        // Display benchmarking results
        System.out.println("Input : " + testInput);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}