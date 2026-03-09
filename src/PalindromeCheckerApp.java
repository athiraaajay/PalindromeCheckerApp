public class PalindromeCheckerApp {


    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {


        String original = "racecar";


        Node head = null;
        Node tail = null;
        for (int i = 0; i < original.length(); i++) {
            Node newNode = new Node(original.charAt(i));
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
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }


    private static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) return true;


        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        Node secondHalf = reverseList(slow.next);


        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean result = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                result = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }


        slow.next = reverseList(secondHalf);

        return result;
    }


    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}