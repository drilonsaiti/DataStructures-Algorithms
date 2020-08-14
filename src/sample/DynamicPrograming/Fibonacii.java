package sample.DynamicPrograming;

import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibo(n);
    }
    public static void fibo(int n){
        int [] array = new int[n+2];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++){
            System.out.print(array[i-1] + " ");
            array[i] = array[i-1] + array[i-2];
        }
        System.out.println(array[n]);
    }
}
