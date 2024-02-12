package src.com.example;

import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers a,b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a: " + a + "\nb: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\na: " + a + "\nb: " + b);
        sc.close();
    }

}
