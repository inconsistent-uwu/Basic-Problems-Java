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

        sc.close();
    }

}
