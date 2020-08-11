package sample.Hash.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            if(!table.containsKey(array[i])){
                table.put(array[i],1);
            }else{
                table.put(array[i],table.get(array[i])+1);
            }
        }

        int j = array.length-1;
        int k = 1;
        int [] results = new int[N];
        for (Map.Entry<Integer, Integer> x : table.entrySet()){
            if(j-1 > 0) {
                if (x.getKey() - array[j - 1] == 1) {
                    results[k++] = x.getKey();
                }
                j--;
            }else{
                if(array[j+1] - array[j] == 1){
                    results[0] = array[j];
                }
            }
        }

        Arrays.sort(results);
        System.out.println(results[results.length-1]);

    }
}
