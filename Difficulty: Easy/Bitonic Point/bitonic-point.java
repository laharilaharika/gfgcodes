// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
         int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}