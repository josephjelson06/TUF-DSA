// package Linked List.1D LL;

public class LengthLL {

    class Node {
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    public int getCount(Node head) {
        // code here
        int i = 0;
        Node temp = head;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

}
