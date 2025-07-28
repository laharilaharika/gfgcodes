// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
         int start = d % arr.length;
        int[] temp = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            int idx = (i + start) % arr.length;
            temp[i] = arr[idx];
        }
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}