//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    String s = in.next();
		    if (new Sol().isPossible (s) == 1)
		        System.out.println ("Yes");
		    else
		        System.out.println ("No");
		
System.out.println("~");
}
	}
}

// Contributed By: Pranay Bansal


// } Driver Code Ends


class Sol
{
    int isPossible (String S)
    {
      int[] freq=new int[26];
      for(char c:S.toCharArray()){
          freq[c-'a']++;
      }
      int oddCount=0;
      for(int count:freq){
          if (count%2!=0){
              oddCount++;
          }
      }
      return (oddCount<=1)?1:0;
    }
}