package src.com.example;

import java.util.*;

public class OddEvenVowelLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number to find even odd :");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        // question 9..........................................................
        System.out.println("Enter a character");
        char a = sc.next().charAt(0);

        char[] v = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'U', 'O' };
        int vi = 0;
        int f = 0;
        while (vi < v.length) {
            if (v[vi] == a) {
                System.out.println("It is a vowel...");
                f = 1;
            }
            vi++;
        }
        if (f == 0)
            System.out.println("It is a consonant...");

        // question 10.........................................................
        System.out.println("Enter 3 number to find the largest");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x >= y && x >= z) {
            System.out.println(x + " is the largest");
        } else if (x <= y && y >= z) {
            System.out.println(y + " is the largest");
        } else {
            System.out.println(z + " is the largest");
        }

        sc.close();
    }

}
