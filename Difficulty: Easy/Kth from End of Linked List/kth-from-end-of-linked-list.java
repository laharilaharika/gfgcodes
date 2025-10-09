/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
         Node f=head;
        Node s=head;
        for(int i=0;i<k;i++){
            if(f==null){
                return -1;
            }
            f=f.next;
        }
        while(f!=null){
            f=f.next;
            s=s.next;
        }
        return s.data;
    }
}