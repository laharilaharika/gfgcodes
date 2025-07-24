
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0; 

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }
}
