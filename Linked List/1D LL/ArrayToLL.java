// package Linked List.1D LL;

public class ArrayToLL {
    class Node {
        int data;
        Node next;

        Node() {
            data = 0;
        }

        Node(int d) {
            data = d;
        } // constructor to create a new node
    }

    Node constructLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node temp = head;

        int i = 0;
        int n = arr.length - 1;
        while (i < n && temp != null) {
            i++;
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }
}
