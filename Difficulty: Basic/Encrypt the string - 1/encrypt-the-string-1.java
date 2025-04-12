//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.encryptString(s));
        
System.out.println("~");
}
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String encryptString(String s) 
    {
        StringBuilder encoded = new StringBuilder();
        int n = s.length();
        
        for (int i = 0; i < n;) {
            char currentChar = s.charAt(i);
            int count = 1;
            
            // Count occurrences of the same character
            while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            
            // Append character and count
            encoded.append(currentChar).append(count);
            
            i++; // Move to the next new character
        }
        
        // Reverse the final string
        return encoded.reverse().toString();
    }
}