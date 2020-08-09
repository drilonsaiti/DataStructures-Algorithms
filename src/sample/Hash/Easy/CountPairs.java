package sample.Hash.Easy;

import java.util.Hashtable;
import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
            table.put(i,array[i]);
        }
        int k = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++){
                if(table.get(j) == k-array[i]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
