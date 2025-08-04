// User function Template for Java
class Solution {
    public int[] reverseSpiral(int R, int C, int[][] a) {
        // code here
        int ans[]=new int[R*C];
           int index=ans.length-1;
           
           int top=0,left=0;
           int bottom=R-1,right=C-1;
           
           while(top<=bottom && left<=right){
                 
                 for(int i=left;i<=right;i++){
                     ans[index]=a[top][i];
                     index--;
                 }
                 top++;
                 
                 for(int i=top;i<=bottom;i++){
                     ans[index]=a[i][right];
                     index--;
                 }
                 right--;
                 if(top<=bottom){
                     for(int i=right;i>=left;i--){
                         ans[index]=a[bottom][i];
                         index--;
                 }
                 bottom--;
                 }
                 if(left<=right){
                       for(int i=bottom;i>=top;i--){
                           ans[index]=a[i][left];
                           index--;
                       }
                       left++;
                 }
                 
           }
           
           return ans;
    }
}