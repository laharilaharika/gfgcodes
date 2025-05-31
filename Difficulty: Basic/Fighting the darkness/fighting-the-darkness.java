// User function Template for Java

class Solution {
    long maxDays(int arr[]) {
        // code here
        long maxDay=0;
        for(int candle:arr){
            maxDay=Math.max(maxDay,candle);
        }
        return maxDay;
    }
}