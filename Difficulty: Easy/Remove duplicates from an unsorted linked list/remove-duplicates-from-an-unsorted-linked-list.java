/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/
import java.util.*;

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        if (head == null) return head;

        HashSet<Integer> set = new HashSet<>();
        Node p = head;
        Node q = null;

        while (p != null) {
            if (!set.contains(p.data)) {
                set.add(p.data);
                q = p; // move q to current node
            } else {
                // remove duplicate node
                q.next = p.next;
            }
            p = p.next;
        }
        return head;
    }
}
