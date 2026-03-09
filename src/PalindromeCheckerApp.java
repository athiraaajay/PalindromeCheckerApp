public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String original = "A man a plan a canal Panama";


        String normalized = original.replaceAll("\\s+", "").toLowerCase();


        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }


        if (normalized.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome (ignoring case and spaces).");
        }
    }
}