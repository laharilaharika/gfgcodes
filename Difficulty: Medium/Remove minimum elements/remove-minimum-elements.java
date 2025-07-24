// User function Template for Java

import java.util.Arrays;

class Solution {
    public int minRemoval(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int maxLen = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && arr[j] <= 2 * arr[i]) {
                j++;
            }
            maxLen = Math.max(maxLen, j - i);
        }

        return n - maxLen; 
    }
}
