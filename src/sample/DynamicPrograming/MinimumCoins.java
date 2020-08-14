package sample.DynamicPrograming;

import java.util.Scanner;

public class MinimumCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        int coin = scanner.nextInt();

        for (int i = coins.length -1; i >= 0; i--){
            while (coin - coins[i] >= 0){
                coin -= coins[i];
                System.out.print(coins[i] + " ");
            }
        }
    }
}
