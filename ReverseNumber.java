package src.com.example;

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int mun = 0, temp;
        while (num > 0) {
            temp = num % 10;
            mun *= 10;
            mun += temp;
            num /= 10;

        }
        System.out.println(mun);
        sc.close();
    }

}
