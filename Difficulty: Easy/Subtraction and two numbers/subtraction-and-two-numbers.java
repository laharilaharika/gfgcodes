// User function Template for Java

class Solution {
    int repeatedSubtraction(int A, int B) {
        // code here
         int count=0;

        while(A>0 && B>0)

        {

           if(A>B)

           {

               A=A-B;

               count++;

           }

           else

           {

              B-=A;

               count++;

           }

        }

        return count;
    }
}