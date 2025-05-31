class Solution {
    int missingNum(int arr[]) {
        // code here
         Arrays.sort(arr);
        int k=1;
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            if(arr[i]==k){
                flag=true;
            }
            if(flag==false){
                return k;
            }
            k++;
        }
        return k;
    }
}