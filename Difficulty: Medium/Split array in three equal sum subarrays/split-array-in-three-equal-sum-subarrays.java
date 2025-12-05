class Solution {

    public List<Integer> findSplit(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        
        if(sum % 3 != 0) return Arrays.asList(-1, -1);
        
        int prefixSum = 0;
        for(int i=0; i<arr.length; i++) {
            prefixSum += arr[i];
            
            if(prefixSum == sum/3) {
                ans.add(i);
                prefixSum = 0;
                
                if(ans.size() == 2) {
                    return ans;
                } 
            }
        }
        
        return Arrays.asList(-1, -1);
    }
}