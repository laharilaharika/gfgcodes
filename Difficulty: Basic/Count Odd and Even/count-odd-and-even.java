class Solution {
    public int[] countOddEven(int[] arr) {
        
        int len=arr.length,odd=0;
        
        for(int i=0;i<len;i++){
            if(arr[i]%2!=0)
                odd+=1;
        }
        
        return  (new int[]{odd,len-odd});
    }
}