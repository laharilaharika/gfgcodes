/* structure of list Node:

class Node
{
    int data;
    Node next;

    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2) {
        // add your code here
        HashSet<Integer> hash = new HashSet<>();
        Node result = null;
        Node p = head2;
        while(p!=null){
            hash.add(p.data);
            p=p.next;
        }
        
        Node k=head1;
       Node tail=null;
        while(k!=null){
            int r = k.data;
           // System.out.println("print == "+r);
            if(hash.contains(k.data)){
               // System.out.println("data == "+k.data);
                Node NewNode = new Node(k.data);
               if(result==null){
                   result=NewNode;
               }else{
                tail.next=NewNode;
               }
                tail=NewNode;
             
               
            }
             k=k.next;
        }
       
        return result;
    }
}