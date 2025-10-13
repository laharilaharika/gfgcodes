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
    Node mergeKLists(Node[] arr) {
         Node head = null;
        Node tail = null;
        
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){
            public int compare(Node a, Node b) {
                return a.data - b.data; // min heap
            }
        });
        
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i] != null) {
            pq.add(arr[i]);
            }
        }
        
        while(!pq.isEmpty())
        {
            Node front = pq.peek();
            pq.poll();
            
            if(front.next != null) pq.add(front.next);
            
            if(head == null)
            {
                head = front;
                tail = front;
            }
            else
            {
                tail.next = front;
                tail = tail.next;
            }
        }
        return head;
        
    }
}