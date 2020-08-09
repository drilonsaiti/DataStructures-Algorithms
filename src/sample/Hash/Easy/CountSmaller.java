package sample.Hash.Easy;

import sample.StackQueue.Queue.ArrayQueue;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class CountSmaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int [] array = new int[N];
        for (int i = 0; i < N;i++){
            array[i] = scanner.nextInt();

        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++){
            if(!table.containsKey(array[i])){
                table.put(array[i],i );
            }
        }
        int [] array2 = new int [N];
        for (int i = 0; i < N; i++){
            array2[i] = table.get(array[i]);
        }
        System.out.println(array2.length);
        for (int i = array2.length - 1; i >= 0; i--){
            System.out.print(array2[i] + " ");
        }

    }
}
