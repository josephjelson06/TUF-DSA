// import org.w3c.dom.Node;

public class InsertAfterPos {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    void addNode(Node head, int pos, int data) {
        if (head == null) {
            return;
        }
        // Your code here
        Node temp = head;

        int i = 0;
        while (i < pos) {
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(data);

        if (temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;
            return;
        }

        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

}
