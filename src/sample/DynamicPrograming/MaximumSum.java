package sample.DynamicPrograming;

import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] array = new int [n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++){
            array[i] = Math.max(i,array[i/2]+array[i/3]+array[i/4]);
        }
        System.out.println(array[n]);
    }

}
