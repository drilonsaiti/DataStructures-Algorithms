package sample.DynamicPrograming;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int count = 0;
        for (int i = 0; i <= N; i++){
            String str = i + "";
            if (str.contains("4")){
                count++;
            }
        }
        System.out.println(count);
    }
}
