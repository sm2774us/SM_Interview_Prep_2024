package com.codility.lessons.SieveOfEratosthenes;

public class CountSemiprimes {
    
    private int[] sieve(int N) {
        int[] prime = new int[N+1];
        for(int i=2; i<=(double)Math.sqrt(N); i++) {
            if(prime[i] == 0) {
                int k = i*i;
                while(k <= N) {
                    if(prime[k] == 0){
                        prime[k] = i;    
                    }                    
                    k += i;
                }               
            }
        }
        return prime;
    }
    
    private int[] semiprime(int[] prime) {
        int semiprime[] = new int[prime.length];
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == 0)
                continue;
            int firstFactor = prime[i];
            if (prime[i / firstFactor] == 0)
                semiprime[i] = 1;
        }
        return semiprime;
    }
    
    /**
     * Solution 1     : Advanced solution
     *
     *                  Main idea:
     *                  Using "sieve of Eratosthenes"
     *                  https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     *
     * Time Complexity: O(N * log(log(N)) + M)
     *
     * @param N
     * @param P
     * @param Q
     * @return
     */
    public int[] solution1(int N, int[] P, int[] Q) {
        int length = P.length;
        int[] prime = sieve(N);
        int[] semiprime = semiprime(prime);
        int[] result = new int[length];
        int[] semiprimesAggreation = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            semiprimesAggreation[i] = semiprime[i];
            semiprimesAggreation[i] += semiprimesAggreation[i - 1];
        }

        for (int i = 0; i < length; i++) {
            result[i] = semiprimesAggreation[Q[i]] - semiprimesAggreation[P[i]] + semiprime[P[i]];
        }
        return result;
    }
    
    private int[] primes(int n) {
        int[] isPrime = new int[n + 1];
        for (int i = 2; i < n + 1; i++) isPrime[i] = 1;
        int i = 2;
        while (i * i <= n) {
            if (isPrime[i] == 1) {
                int j = i * i;
                while (j <= n) {
                    isPrime[j] = 0;
                    j += i;
                }
            }
            i++;
        }
        return isPrime;
    }
    
    private int[] semiprimePrefixCount(int N) {
        int[] isPrime = primes(N / 2);
        int[] prefixCount = new int[N + 1];
        for (int i = 0; i < isPrime.length && i * i <= N; i++) {
            if (isPrime[i] == 1) {
                for (int j = i; j < isPrime.length && i * j <= N; j++) {
                    if (isPrime[j] == 1)
                        prefixCount[i * j] = 1;
                }
            }
        }
        for (int i = 5; i < prefixCount.length; i++) {
            prefixCount[i] += prefixCount[i - 1];
        }
        return prefixCount;
    }
    
    /**
     * Solution 2     : Using prefix count.
     *
     * Time Complexity: O(N * log(log(N)) + M)
     *
     * @param N
     * @param P
     * @param Q
     * @return
     */
    public int[] solution2(int N, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int[] prefixCount = semiprimePrefixCount(N);
        for (int i = 0; i < P.length; i++) {
            result[i] = prefixCount[Q[i]] - prefixCount[P[i] - 1];
        }
        return result;
    }

}
