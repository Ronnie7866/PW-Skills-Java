package LinkedList_14_August;

import java.util.LinkedList;

public class isPresent {

    private static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    private static boolean function(Node head, int k) {
        while (head != null) {
            if (k == head.val){
                return true;
            }
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(11);
        head.next.next.next = new Node(1304);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = null;

        int n = 11;
        boolean found = function(head, n);
        if (found) {
            System.out.println(n + " is present in the Linked List: ");
        }
        else System.out.println("Node not found: ");
    }
}
