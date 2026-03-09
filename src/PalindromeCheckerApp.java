public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String original = "madam";


        boolean isPalindrome = isPalindromeRecursive(original, 0, original.length() - 1);

        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }


    private static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }


        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }


        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}