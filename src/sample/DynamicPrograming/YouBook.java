package sample.DynamicPrograming;

import java.util.Scanner;

public class YouBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (array[i] > k){
                sum = 0;
            }else{
                sum += array[i];
            }
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
