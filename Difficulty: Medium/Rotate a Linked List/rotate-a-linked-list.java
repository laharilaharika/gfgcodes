/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        Node p = head;
        if(head==null||head.next==null||k==0){
            return head;
        }
        int l = 1;
        while(p.next!=null){
            p = p.next;
            l++;
        }
        p.next = head;
        k = k%l;
        //k = l-k;
        while(k-->0){
            p = p.next;
        }
        head = p.next;
        p.next = null;
        return head;
    }
}