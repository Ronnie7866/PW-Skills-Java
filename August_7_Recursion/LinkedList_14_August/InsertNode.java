package LinkedList_14_August;

import java.util.Scanner;

public class InsertNode {

    private static void display(Node head) {
        while (head != null) {
            System.out.println(head.val);
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

    private static void insertNode(Node head, int index, int val) {
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node t = new Node(val);
        Node k = temp.next;
        temp.next = t;
        t.next = k;

    }
    public static void main(String[] args) { // 1 2 4 5 6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        insertNode(head, 2, 3);
        display(head);
    }
}
