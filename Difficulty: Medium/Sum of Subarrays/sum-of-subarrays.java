class Solution {
    public int subarraySum(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int contribution = arr[i] * (i + 1) * (n - i);
            totalSum += contribution;
        }

        return totalSum;
    }
}
