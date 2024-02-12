package src.com.example;

import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find the sum of N natural numbers :");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }

}
