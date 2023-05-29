package sieveOfErast;

import java.util.Arrays;

public class sieveApp {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the maximum integer to check for prime numbers as a command-line argument");
            return;
        }
        
        int n = Integer.parseInt(args[0]);
        sieveOfEratosthenes(n);
    }

    static void sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true); // Assume all numbers are prime
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) { // If prime[p] is not changed, then it is a prime
                for (int i = p * p; i <= n; i += p) { // Update all multiples of p
                    prime[i] = false;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
