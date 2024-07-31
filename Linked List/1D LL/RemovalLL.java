// package Linked List.1D LL;

public class RemovalLL {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public void deleteNode(ListNode node) {
            // Approach:
            /*
             * 1. Copy the value of the next node to the current node
             * 2. Adjust the next pointer to skip the next node.
             */
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
