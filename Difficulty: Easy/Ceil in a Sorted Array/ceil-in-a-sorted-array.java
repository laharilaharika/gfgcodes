// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
int low=0,high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return result;
    }
}
