package sample.DynamicPrograming;

import java.util.Scanner;

public class ReachScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] array = new int[n+1];
        array[0] = 1;

        for (int i = 3; i <= n; i++){
            array[i] += array[i-3];
        }
        for (int i = 5; i <= n; i++){
            array[i] += array[i-5];
        }
        for (int i = 10; i <= n; i++){
            array[i] +=array[i-10];
        }
        System.out.println(array[n]);
    }
}
