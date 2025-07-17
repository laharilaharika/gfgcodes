/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            Solution ob = new Solution();
            System.out.println(ob.countPowersOfThree(n));
        }
        sc.close();
    }
}

class Solution {
    int countPowersOfThree(int n) {
        int count = 0;
        int power = 1;
        while (power <= n) {
            count++;
            if (power > Integer.MAX_VALUE / 3) break; 
            power *= 3;
        }
        return count;
    }
}
