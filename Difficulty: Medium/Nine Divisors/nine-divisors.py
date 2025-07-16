import math

class Solution:
    def countNumbers(self, n):
        limit = int(n**0.5) + 1

        is_prime = [True] * (limit)
        is_prime[0] = is_prime[1] = False
        primes = []

        for i in range(2, limit):
            if is_prime[i]:
                primes.append(i)
                for j in range(i*i, limit, i):
                    is_prime[j] = False

        count = 0

        for p in primes:
            if p**8 <= n:
                count += 1
            else:
                break

        for i in range(len(primes)):
            for j in range(i+1, len(primes)):
                p2_q2 = primes[i]**2 * primes[j]**2
                if p2_q2 <= n:
                    count += 1
                else:
                    break

        return count
