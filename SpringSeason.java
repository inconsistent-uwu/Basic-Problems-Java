package src.com.example;

import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the month and the day:\nMonth: ");
        int m = sc.nextInt();
        System.out.print("Day: ");
        int d = sc.nextInt();

        if (m > 2 && m < 7) {
            if ((m == 3 && d > 20 && d < 32) || (m == 6 && d < 20))
                System.out.println("True");
            else if (d > 0 && d < 32)
                System.out.println("True");
            else
                System.out.println("False");
        }
        sc.close();
    }
}
