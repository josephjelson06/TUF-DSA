// import org.w3c.dom.Node;

// indexing is 1-based
public class DeleteNodeDLL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }
    }

    public Node deleteNode(Node head, int x) {
        // if(head == null || head.next == null){
        // return null;
        // }
        if (x == 1) {
            head = head.next;
            return head;
        }

        Node temp = head;
        int i = 1;
        while (i < x - 1) {
            i++;
            temp = temp.next;
        }

        if (temp.next.next == null) {
            temp.next = null;
            return head;
        }

        temp.next = temp.next.next;

        return head;
    }
}
