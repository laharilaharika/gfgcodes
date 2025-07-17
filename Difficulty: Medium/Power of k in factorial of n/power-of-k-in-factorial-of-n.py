class Solution:
    def maxKPower(self, n, k):
        def prime_factors(x):
            factors = {}
            i = 2
            while i * i <= x:
                count = 0
                while x % i == 0:
                    x //= i
                    count += 1
                if count > 0:
                    factors[i] = count
                i += 1
            if x > 1:
                factors[x] = 1
            return factors

        def count_p_in_factorial(n, p):
            count = 0
            power = p
            while power <= n:
                count += n // power
                power *= p
            return count

        factors = prime_factors(k)
        min_power = float('inf')

        for p, a in factors.items():
            count = count_p_in_factorial(n, p)
            min_power = min(min_power, count // a)

        return min_power
