/* Node class of the linked list
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    // Function to pairwise swap nodes of a linked list.
    public Node pairwiseSwap(Node head) {
        // If list is empty or has only one node — no swap needed
        if (head == null || head.next == null)
            return head;

        // New head will be the second node
        Node prev = null;
        Node curr = head;
        head = head.next; // new head after first swap

        // Traverse the list and swap pairs
        while (curr != null && curr.next != null) {
            Node nextNode = curr.next;
            Node nextPair = nextNode.next;

            // Swap current pair
            nextNode.next = curr;
            curr.next = nextPair;

            // Connect previous pair to current swapped pair
            if (prev != null)
                prev.next = nextNode;

            // Move to next pair
            prev = curr;
            curr = nextPair;
        }

        return head;
    }
}
