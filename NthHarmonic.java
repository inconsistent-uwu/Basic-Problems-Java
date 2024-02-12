package src.com.example;

import java.util.Scanner;

public class NthHarmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find Nth harmonic number:");

        int n = sc.nextInt();
        double h = 0;
        for (int i = 1; i <= n; i++) {
            h += (double) 1 / i;
        }
        System.out.println(h);
        sc.close();
    }

}
