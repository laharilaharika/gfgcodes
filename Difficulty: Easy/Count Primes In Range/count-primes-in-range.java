class Solution {
    public int countPrimes(int L, int R) {
        boolean[] isPrime = sieve(R);  // Get all primes up to R
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    private boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
