package src.com.example;

import java.util.*;

public class EuclDist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinates of the point to find its distance from origin: \nx= ");
        int x = sc.nextInt();
        System.out.print("\ny= ");
        int y = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Distance = " + distance);
        sc.close();
    }

}
