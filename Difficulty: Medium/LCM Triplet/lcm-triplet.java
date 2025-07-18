class Solution {
    private long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    private long lcm(long a, long b, long c) {
        return lcm(a, lcm(b, c));
    }

    int lcmTriplets(int n) {
        if (n <= 2) return n;       
        if (n == 3) return 6;       
        
        long maxLCM = 0;
        maxLCM = lcm(n, n - 1, n - 2);
        if (n % 2 == 0) {
            maxLCM = Math.max(maxLCM, lcm(n, n - 1, n - 3));
        }
        if (n % 2 == 0) {
            maxLCM = Math.max(maxLCM, lcm(n - 1, n - 2, n - 3));
        }

        return (int) maxLCM;
    }
}
