
class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        if(n<2){
            return -1;
            
        }
        Arrays.sort(arr);
        return arr[n-1]*arr[n-2];
    }
}
