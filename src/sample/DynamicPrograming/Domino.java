package sample.DynamicPrograming;

import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(countWays(n));
    }
    public static int countWays(int n){

        int [] array = new int [n+1];

        array[0] = 1;
        array[1] = 2;

        for (int i = 2; i <= n; i++){
            array[i] = 2*array[i-1] + 4*array[i-2];
        }
        return array[n];
    }
}
