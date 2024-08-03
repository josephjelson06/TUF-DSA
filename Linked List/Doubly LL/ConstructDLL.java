class Solution {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }

        Node constructDLL(int arr[]) {
            // Code here
            Node head = new Node(arr[0]);
            Node temp = head;
            for (int i = 1; i < arr.length; i++) {
                Node newNode = new Node(arr[i]);
                temp.next = newNode;
                newNode.prev = temp;
                temp = temp.next;
            }
            return head;
        }
    }
}