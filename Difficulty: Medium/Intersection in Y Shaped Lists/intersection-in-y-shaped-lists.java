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
    public Node intersectPoint(Node head1, Node head2) {
        // If either list is null, no intersection
        if (head1 == null || head2 == null)
            return null;

        Node a = head1;
        Node b = head2;

        // Traverse both lists. When one reaches the end, jump to the other list's head.
        // They will eventually meet at the intersection node.
        while (a != b) {
            a = (a == null) ? head2 : a.next;
            b = (b == null) ? head1 : b.next;
        }

        // Either both null (no intersection), or at intersection node
        return a;
    }
}
