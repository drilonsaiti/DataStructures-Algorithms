package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] array = new int [N];
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }

        Hashtable<String,Integer> table = new Hashtable<>();
        int sum = 0;
        int flag = 1;
        for (int i = 0; i < array.length; i++){
            sum = array[i];
            for (int j = 1; j < array.length; j++){
                 sum += array[j];
                if(sum == 0 || array[i] == 0 || array[j] == 0){
                    System.out.println("Subarray ");
                    flag = 0;
                    break;
                }
            }
            if (flag == 0)
                break;
        }
    }
}
