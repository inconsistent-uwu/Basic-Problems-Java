package src.com.example;

import java.util.*;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number for quadratic equation : ");
        System.out.println("x^2:");
        int a = sc.nextInt();
        System.out.println("+x:");
        int b = sc.nextInt();
        System.out.println("+c:");
        int c = sc.nextInt();

        int d = b * b - (4 * a * c);

        double r1 = (-b + Math.sqrt(d)) / (2 * a);
        double r2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println("Roots of the equation are: \nr1: " + r1 + "\nr2: " + r2);
        sc.close();

    }

}
