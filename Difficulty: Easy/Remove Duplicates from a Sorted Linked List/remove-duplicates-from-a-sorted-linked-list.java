/*
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        if (head == null) return null;

        Node current = head;

        while (current.next != null) {
            if (current.data == current.next.data) {
                // Skip duplicate node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
