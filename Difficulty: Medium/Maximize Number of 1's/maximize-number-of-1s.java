class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
         int ans = 0;  
        int zero = 0; 
        int left = 0; 
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                zero++;
            }

            while (zero> k) {
                if (arr[left] == 0) {
                    zero--;
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}