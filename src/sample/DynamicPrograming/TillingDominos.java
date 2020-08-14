package sample.DynamicPrograming;

import java.util.Scanner;

public class TillingDominos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(countWays(n));
    }

    public static int countWays(int n){
        int [] a = new int[n+1];
        int [] b = new int[n+1];

        a[0] = 1; a[1] = 0;
        b[0] = 0; b[1] = 1;

        for (int i = 2; i <= n; i++){
            a[i] = a[i-2]+2*b[i-1];
            b[i] = a[i-1] + b[n-2];
        }
        return a[n];
    }
}
