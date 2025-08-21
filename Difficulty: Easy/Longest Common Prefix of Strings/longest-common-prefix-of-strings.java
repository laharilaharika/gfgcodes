// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
         StringBuilder sol=new StringBuilder();
        int min_length=Integer.MAX_VALUE;
        boolean flag=false;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<min_length){
                min_length= arr[i].length();  
            }
        }
        
        for(int i=0;i<min_length;i++){
            char current_char=arr[0].charAt(i);
            for(int j=0;j<arr.length;j++)
            {
                flag=false;
                if(current_char==arr[j].charAt(i))
                {
                    flag=true;
                }
                else{
                    return sol.toString();
                }
            }
            if(flag==true){
                sol.append(current_char);
            }
        }   
        return sol.toString();
        
    }
}