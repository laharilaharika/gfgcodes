class Solution {
    public int maxCircularSum(int arr[]) {
        int n = arr.length;
        int totalSum = 0;

        int maxKadane = kadane(arr);
        if (maxKadane < 0) return maxKadane; 

        int minSubarraySum = kadaneMin(arr);
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        return Math.max(maxKadane, totalSum - minSubarraySum);
    }

    private int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int currMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    private int kadaneMin(int[] arr) {
        int minSoFar = arr[0];
        int currMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSoFar = Math.min(minSoFar, currMin);
        }
        return minSoFar;
    }
}
