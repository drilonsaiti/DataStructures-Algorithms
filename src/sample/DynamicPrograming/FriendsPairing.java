package sample.DynamicPrograming;

import java.util.Scanner;

public class FriendsPairing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long [] array = new long[n+1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i <= n; i++){
            long single = array[i-1] % 1000000007;
            long doublep = array[i-2] % 1000000007 * (i-1)%1000000007;
            array[i] = single + doublep;
        }
        System.out.println(array[n] % 1000000007);
    }
}
