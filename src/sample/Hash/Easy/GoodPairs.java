package sample.Hash.Easy;

import java.util.Hashtable;
import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Integer,Integer> table = new Hashtable<>();

        int N = scanner.nextInt();

        int [] array = new int [N];
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++){
            if(table.containsKey(array[i])){
                int value = table.get(array[i]);
                //System.out.println("Value " + table.get(array[i]) + " " + array[i]);
                count += value;
            }
            table.put(array[i],table.getOrDefault(array[i],0)+1);
            //System.out.println("GetOrDeaful " + table.getOrDefault(array[i],0)+1);
        }
        System.out.println(count);

    }
}
