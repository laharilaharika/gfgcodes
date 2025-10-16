// User function Template for Java

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node reverseBetween(int left, int right, Node head) {
        if (head == null || left == right) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        // Move prev to the node just before the sublist to be reversed
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        Node cur = prev.next;

        // Reverse nodes between left and right
        for (int i = 0; i < right - left; i++) {
            Node temp = cur.next;
            cur.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        return dummy.next;
    }
}
