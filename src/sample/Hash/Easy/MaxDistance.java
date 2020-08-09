package sample.Hash.Easy;

import java.util.Hashtable;
import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int [] array = new int[N];
        for (int i = 0; i < N;i++){
            array[i] = scanner.nextInt();

        }
        int distance = 0;
        for (int i = 0; i < N; i++){
           if(!table.containsKey(array[i])){
               table.put(array[i],i);
           }else{
               distance = Math.max(distance,i-table.get(array[i]));
           }

        }
        System.out.println(distance);
    }
}
