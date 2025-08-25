// User function Template for Java

class Solution {
    public int excelColumnNumber(String s) {
        // Code here
int ans=0;
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           ans=ans*26 + (ch-65+1); 
       }
       return ans;
    }
}