class Solution {
    public void rearrange(int[] arr, int x) {
        // code here
        int n = arr.length;
        int[][] pairs = new int[n][2];
        for(int i = 0; i < n; i++){
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a,b) -> {
            int firstDiff = Math.abs(a[0]-x);
            int secondDiff = Math.abs(b[0]-x);
            if(firstDiff == secondDiff){
                return a[1] - b[1];
            }
            return firstDiff - secondDiff;
        });
        
        for(int i = 0; i < n; i++){
            arr[i] = pairs[i][0];
        }
    }
}
