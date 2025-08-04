class Solution {
    int findK(int matrix[][], int n, int m, int k) {
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        int count = 0;

        while (top <= bottom && left <= right) {
            // Traverse from Left to Right
            for (int i = left; i <= right; i++) {
                count++;
                if (count == k) return matrix[top][i];
            }
            top++;

            // Traverse Down
            for (int i = top; i <= bottom; i++) {
                count++;
                if (count == k) return matrix[i][right];
            }
            right--;

            // Traverse from Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    count++;
                    if (count == k) return matrix[bottom][i];
                }
                bottom--;
            }

            // Traverse Up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                    if (count == k) return matrix[i][left];
                }
                left++;
            }
        }

        return -1; // This will never be hit if 1 <= k <= n*m
    }
}
