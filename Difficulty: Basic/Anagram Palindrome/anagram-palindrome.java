class Sol {
    int isPossible(String S) {
        // your code here
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