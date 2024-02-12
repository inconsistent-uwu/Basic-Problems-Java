package src.com.example;

import java.util.*;

public class PrimeFactorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value to find prime factorisation :");
        int n = sc.nextInt();

        for (int i = 2; i * i < n; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.println(n);
        sc.close();
    }
}
