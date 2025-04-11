//{ Driver Code Starts
// saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String s1 = sc.next();
            GfG g = new GfG();
            System.out.println(g.remAnagrams(s, s1));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public int remAnagrams(String s1, String s2) {
        // add code here.
        int[] freq=new int[26];
        for(char c:s1.toCharArray())
        {
            freq[c-'a']++;
        }
        for(char c:s2.toCharArray())
        {
            freq[c-'a']--;
        }
        int deletions = 0;
        for(int count:freq){
            deletions += Math.abs(count);
        }
        return deletions;
    }
}