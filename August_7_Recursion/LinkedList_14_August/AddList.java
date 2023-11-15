package LinkedList_14_August;

public class AddList {

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
    public static void main(String[] args) {
        Node list1 = new Node(5);
        list1.next = new Node(6);
        list1.next.next = new Node(3);

        list1.next.next.next = null;
        display(list1);

        Node list2 = new Node(8);
        list2.next = new Node(4);
        list2.next.next = new Node(2);

        list2.next.next.next = null;

        System.out.println();
        display(list2);
        Node ans = addTwoList(list1, list2);
        System.out.println();
        display(ans);
    }

    private static Node addTwoList(Node list1, Node list2) {
        Node ans = new Node(0);
        Node pointer = ans;
        int carry = 0;

        while (list1 != null || list2 != null) {
            int sum = carry;

            if (list1 != null) {
                sum += list1.val;
                list1 = list1.next;
            }
            if (list2 != null) {
                sum += list2.val;
                list2 = list2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            pointer.next = new Node(sum);
            pointer = pointer.next;
        }
        if (carry > 0) {
            pointer.next = new Node(carry);
        }
        return ans.next;
    }
}
