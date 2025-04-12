//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public static String concatenatedString(String s1, String s2) {
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (char ch : s1.toCharArray()) {
            freq1[ch] = 1;
        }
        for (char ch : s2.toCharArray()) {
            freq2[ch] = 1;
        }

        StringBuilder result = new StringBuilder();

        for (char ch : s1.toCharArray()) {
            if (freq2[ch] == 0) {
                result.append(ch);
            }
        }

        for (char ch : s2.toCharArray()) {
            if (freq1[ch] == 0) {
                result.append(ch);
            }
        }

        return result.length() == 0 ? "-1" : result.toString();
    }
}