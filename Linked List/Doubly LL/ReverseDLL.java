public class ReverseDLL {
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node reverseDLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node curr = head;
        Node back = null;

        while (curr != null) {
            back = curr.prev;
            curr.prev = curr.next;
            curr.next = back;
            curr = curr.prev;
        }

        return back.prev;

    }
}