class Solution {
    public int maxRectSum(int mat[][]) {
        int r = mat.length;
        int c = mat[0].length;
        int maxSum = Integer.MIN_VALUE;

        for (int top = 0; top < r; top++) {
            int[] temp = new int[c];  
            for (int bottom = top; bottom < r; bottom++) {
                for (int i = 0; i < c; i++) {
                    temp[i] += mat[bottom][i];
                }
                int currMax = kadane(temp);
                maxSum = Math.max(maxSum, currMax);
            }
        }

        return maxSum;
    }

    int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
