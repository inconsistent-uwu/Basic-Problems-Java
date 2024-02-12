package src.com.example;

import java.util.*;

public class UnitDisplay {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = sc.nextInt();
        String[] trms = { "1 X ", "10 X ", "100 X ", "1000 X ", "10000 X ", "100000 X ", "1000000 X " };

        int i = 0;
        while (num > 0) {
            int rem = num % 10;

            System.out.println(trms[i] + rem);
            i++;

            num /= 10;

        }

    }
}