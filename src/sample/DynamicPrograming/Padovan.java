package sample.DynamicPrograming;

import java.util.Scanner;

public class Padovan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();


        /*for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }*/
        while (t-- > 0) {
            int N = scanner.nextInt();
            int [] array = new int[N+1];
            array[0] = 1;
            array[1] = 1;
            array[2] = 1;
            for (int i = 3; i <= N; i++) {
                array[i] = (array[i - 2] + array[i - 3]) % 1000000007;
            }
            System.out.println(array[N]);
        }
    }
}
