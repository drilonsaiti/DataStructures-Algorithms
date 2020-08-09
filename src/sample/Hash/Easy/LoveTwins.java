package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Scanner;

public class LoveTwins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [N];
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int count = 0;
        for (int i = 0; i < N; i++){
            if(!table.isEmpty() && table.containsKey(array[i])){
                table.remove(array[i]);
                count += 2;
            }else{
                table.put(array[i],array[i]);
            }
        }
        System.out.println(count);
    }
}
