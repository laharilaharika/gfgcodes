class Solution {
    static final int MOD = 1_000_000_007;

    public int vowelCount(String s) {
        int[] freq = new int[26]; 
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int uniqueVowels = 0;     
        long selectionChoices = 1; 
        for (char vowel : "aeiou".toCharArray()) {
            int count = freq[vowel - 'a'];
            if (count > 0) {
                uniqueVowels++;               
                selectionChoices = (selectionChoices * count) % MOD;
            }
        }

        if (uniqueVowels == 0) return 0; 
        long permutations = factorial(uniqueVowels);
        long total = (selectionChoices * permutations) % MOD;

        return (int) total;
    }

    private long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = (fact * i) % MOD;
        }
        return fact;
    }
}
