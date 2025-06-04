// User function Template for Java

class Solution {
    static int[] endPoints(int[][] matrix, int R, int C) {
        // code here
         int i=0,j=0;
        int dir=0;
        while(i>=0 && i<R && j>=0 && j<C){
            if(matrix [i][j]==1){
                matrix[i][j]=0;
                dir=(dir+1)%4;
            }
            if(dir==0) j++;
            else if (dir == 1) i++;
            else if (dir == 2) j--;
            else if (dir == 3) i--;
        }
            if(dir==0) j--;
            else if (dir == 1) i--;
            else if (dir == 2) j++;
            else if (dir == 3) i++;
            return new int[]{i,j};
    }
}