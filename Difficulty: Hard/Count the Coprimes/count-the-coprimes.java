import java.util.*;

class Solution {
    static final int MAX = 10000;
    static int[] freq = new int[MAX + 1];
    static int[] mobius = new int[MAX + 1];

    public int cntCoprime(int[] arr) {
        Arrays.fill(freq, 0);
        computeMobius();

        int n = arr.length;
        for (int num : arr) {
            freq[num]++;
        }
        int[] countMultiples = new int[MAX + 1];
        for (int g = 1; g <= MAX; g++) {
            for (int multiple = g; multiple <= MAX; multiple += g) {
                countMultiples[g] += freq[multiple];
            }
        }
        long result = 0;
        for (int g = 1; g <= MAX; g++) {
            if (countMultiples[g] >= 2) {
                long pairs = ((long) countMultiples[g] * (countMultiples[g] - 1)) / 2;
                result += mobius[g] * pairs;
            }
        }

        return (int) result;
    }

    private void computeMobius() {
        Arrays.fill(mobius, 1);
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= MAX; j += i) {
                    mobius[j] *= -1;
                    isPrime[j] = false;
                }
                long sq = (long) i * i;
                if (sq <= MAX) {
                    for (int j = (int)sq; j <= MAX; j += sq) {
                        mobius[j] = 0;
                    }
                }
            }
        }
    }
}
