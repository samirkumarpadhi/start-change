package com.go.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimeNumber {

    // @include
    // Given n, return all primes up to and including n.
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        // isPrime.get(p) represents if p is prime or not. Initially, set each
        // to true, excepting 0 and 1. Then use sieving to eliminate nonprimes.
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true));
        isPrime.set(0, false);
        isPrime.set(1, false);
        for (int p = 2; p <= n; ++p) {
            if (isPrime.get(p)) {
                primes.add(p);
                // Sieve p's multiples.
                for (int j = p; j <= n; j += p) {
                    isPrime.set(j, false);
                }
            }
            System.out.println("A = " + primes);
        }
        return primes;
    }

    public static List<Integer> generatePrimes2(int n) {
        final int size = (int)Math.floor(0.5 * (n - 3)) + 1;
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        // isPrime.get(i) represents whether (2i + 3) is prime or not.
        // Initially, set each to true. Then use sieving to eliminate nonprimes.
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(size, true));
        for (int i = 0; i < size; ++i) {
            if (isPrime.get(i)) {
                int p = ((i * 2) + 3);
                primes.add(p);
                // Sieving from p^2, whose value is (4i^2 + 12i + 9). The index of this
                // value in isPrime is (2i^2 + 6i + 3) because isPrime.get(i) represents
                // 2i + 3.
                //
                // Note that we need to use long type for j because p^2 might overflow.
                for (long j = ((i * i) * 2) + 6 * i + 3; j < size; j += p) {
                    isPrime.set((int)j, false);
                }
            }
            System.out.println("A = " + primes);
        }
        return primes;
    }

    public static void main(String[] args) {
       // System.out.println("A = " + generatePrimes(10));
        System.out.println("A = " + generatePrimes2(100));
    }

}

