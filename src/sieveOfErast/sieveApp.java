package sieveOfErast;
import java.util.Arrays;
import java.util.Scanner;

public class sieveApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum integer to check for prime numbers: ");
        int n = scanner.nextInt();
        
        sieveOfEratosthenes(n);
        scanner.close();
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
        //making a small change to test if the 
		
		
	}

}
