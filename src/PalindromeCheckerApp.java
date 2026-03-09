import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String original = "level";


        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }


        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }


        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}