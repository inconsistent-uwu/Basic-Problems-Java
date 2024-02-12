package src.com.example;

import java.util.Scanner;

public class FlipACoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number to flip the coin");
        int n = sc.nextInt();
        int heads = 0, tails = 0;
        while (n > 0) {
            int toss = (int) (Math.random() * 10);
            if (toss < 5)
                heads++;
            else
                tails++;
            n--;
        }

        double hp = ((double) heads / (heads + tails)) * 100;
        double tp = ((double) tails / (heads + tails)) * 100;
        System.out.println("Heads percentage is " + hp + "%\n");
        System.out.println("Tails percentage is " + tp + "%\n");
        sc.close();
    }
}
