class Solution {
    void segregateEvenOdd(int arr[]) {
        int n=arr.length;
        int left=0,right=0;
        while(right<n){
            if(arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
            right++;
        }
        Arrays.sort(arr,0,left);
        Arrays.sort(arr,left,n);
    }
}