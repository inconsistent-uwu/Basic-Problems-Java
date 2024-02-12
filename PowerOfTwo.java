package src.com.example;

import java.util.Scanner;

public class PowerOfTwo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the power of 2:");
        int n = sc.nextInt();
        for (int i = 1; i < 32 && i <= n; i++) {
            System.out.println(Math.pow(2, i));
        }

        sc.close();
    }

}
