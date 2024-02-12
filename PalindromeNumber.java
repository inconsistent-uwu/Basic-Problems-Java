package src.com.example;

import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome");
        int n = sc.nextInt();
        int num = n;
        int mun = 0, temp;
        while (num > 0) {
            temp = num % 10;
            mun *= 10;
            mun += temp;
            num /= 10;
        }
        if (n == mun) {
            System.out.println("Palindrome......");
        } else {
            System.out.println("Not a palindrome.....");
        }
        sc.close();
    }

}
