package LinkedList_14_August;

public class Palindrome {

    private static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        while (head != slow && slow.next != null) {
            if (head.val != slow.next.val) {
                return false;
            }
            else {
                head = head.next;
                slow = slow.next;
            }
        }
        return true;
    }
    private static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(6);
        head.next.next = new Node(3);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = null;
        boolean ans = isPalindrome(head);
        System.out.println(ans);
    }
}
