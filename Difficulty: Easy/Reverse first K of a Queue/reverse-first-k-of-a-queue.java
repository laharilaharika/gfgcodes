import java.util.*;

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        if (k > n || k <= 0) return q;      // handle invalid k

        int[] arr = new int[n];

        // pull all elements into array
        for (int i = 0; i < n; i++) {
            arr[i] = q.poll();
        }

        // enqueue first k elements in reverse order
        for (int i = k - 1; i >= 0; i--) {
            q.offer(arr[i]);
        }

        // enqueue the rest in their original order
        for (int i = k; i < n; i++) {
            q.offer(arr[i]);
        }

        return q;
    }
}
