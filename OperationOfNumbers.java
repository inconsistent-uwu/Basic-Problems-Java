package src.com.example;

import java.util.*;

public class OperationOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to perform arthematic operations");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] sum = new int[5];
        sum[0] = a + b * c;
        sum[1] = c + a / b;
        sum[2] = a % b + c;
        sum[3] = a * b + c;
        int min = sum[0];
        int max = sum[0];
        for (int i = 1; i <= 3; i++) {
            if (sum[i] < min)
                min = sum[i];
            if (sum[i] > max)
                max = sum[i];

        }
        System.out.println("min value: " + min);
        System.out.println("max value: " + max);
        sc.close();

    }

}
