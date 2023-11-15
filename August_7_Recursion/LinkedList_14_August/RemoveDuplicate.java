package LinkedList_14_August;

import java.util.Scanner;

public class RemoveDuplicate {

    private static void display(Node head) {
        while (head != null) {
            System.out.print(head.val + ", ");
            head = head.next;
        }
    }

    private static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }

    private static void removeDuplicate(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) { // value equal ni h to hi aage badho
            if (temp.val != temp.next.val) {
                temp = temp.next;
            }
            else temp.next = temp.next.next;// equal ni h to ruko jaha pr ho or aage check kro
        }
    }


    public static void main(String[] args) { // 1 2 4 5 6
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(1);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = null;
        display(head);
        removeDuplicate(head);
        System.out.println();
        display(head);
    }
}

