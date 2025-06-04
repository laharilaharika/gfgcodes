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