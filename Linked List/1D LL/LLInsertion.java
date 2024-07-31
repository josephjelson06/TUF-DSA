// package Linked List.1D LL;

public class LLInsertion {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x) {
        // code here
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        return head;
    }

    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here

        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
}
