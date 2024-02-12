package src.com.example;

import java.util.*;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Two number to divide a,b :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Invalid Input!!!");
            System.exit(0);
        }
        System.out.println("Quotient:  " + a / b + "\nRemainder: " + a % b);

        sc.close();

    }

}
