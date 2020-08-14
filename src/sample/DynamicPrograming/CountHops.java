package sample.DynamicPrograming;

import java.util.Scanner;

public class CountHops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] array = new int[50];

        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        for (int i = 3; i < n; i++){
            array[i] = array[i-1]+array[i-2]+array[i-3];
        }
        System.out.println(array[n-1]);
    }
}
