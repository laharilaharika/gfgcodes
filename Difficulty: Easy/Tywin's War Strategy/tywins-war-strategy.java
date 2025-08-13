class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
         int n = arr.length;
     int r = (n+1)/2;
     int ans = 0;
     HashMap<Integer,Integer> map = new HashMap<>();
     
     for(int i=0;i<n;i++){
         int rem = arr[i]%k;
         
         if(rem!=0) rem = Math.abs(k-rem);
         
         if(map.containsKey(rem)) map.put(rem,map.get(rem)+1);
         else map.put(rem,1);
     }
     
    
     for(int i=0;i<k;i++){
         if(map.containsKey(i)&& r>0){
             int val = map.get(i);
             if(i==0) r=r-val;
             else{
                 if(val<r) ans = ans+(val*i);
                 else ans = ans +(r*i);
                 
                 r = r-val;
             }
         }
     }
     
     return ans;
    }
}