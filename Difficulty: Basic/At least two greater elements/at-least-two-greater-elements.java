// User function Template for Java

class Solution {
    public long[] findElements(long arr[]) {
        // Your code goes here
        int n=arr.length;
        if(n<=2) return new long[0];
        Arrays.sort(arr);
        return Arrays.copyOf(arr,n-2);
    }
}