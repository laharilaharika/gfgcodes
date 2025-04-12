//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.encryptString(S));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String encryptString(String s){
        // code here
        StringBuilder finalStr = new StringBuilder();
        char currentChar = s.charAt(s.length() - 1);
        int currlen = 1;

        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.charAt(i) == currentChar) {
                currlen++;
            } else {
                // Convert count to hex
                StringBuilder hexVal = new StringBuilder();
                int count = currlen;
                while (count > 0) {
                    int rem = count % 16;
                    if (rem < 10)
                        hexVal.append((char)('0' + rem));
                    else
                        hexVal.append((char)('a' + rem - 10));
                    count /= 16;
                }
                finalStr.append(hexVal.reverse()).append(currentChar);
                currentChar = s.charAt(i);
                currlen = 1;
            }
        }

        // Handle last group
        StringBuilder hexVal = new StringBuilder();
        int count = currlen;
        while (count > 0) {
            int rem = count % 16;
            if (rem < 10)
                hexVal.append((char)('0' + rem));
            else
                hexVal.append((char)('a' + rem - 10));
            count /= 16;
        }
        finalStr.append(hexVal.reverse()).append(currentChar);

        return finalStr.toString();
    }
}
