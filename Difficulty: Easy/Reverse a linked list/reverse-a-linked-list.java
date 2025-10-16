/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
    Node prev=null;
    Node curr=head;
    while(curr!=null){
        Node  temp=curr.next;    //step1
        curr.next=prev;              //step2
        prev = curr;                //step3
        curr=temp;                   //step4
    }
    return prev;
    }
}