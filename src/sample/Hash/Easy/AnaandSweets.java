package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class AnaandSweets {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] array = new int [N];
        Hashtable<Integer,Integer> table = new Hashtable<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
            if(!table.containsKey(array[i])){
                table.put(array[i],1);
            }else{
                table.put(array[i],table.get(array[i])+1);
            }
        }
        int k = scanner.nextInt();
        int ans = 1;
        int max = 0;
        System.out.println(table.entrySet());
       for (Map.Entry<Integer, Integer> x : table.entrySet()){
           System.out.println(x.getValue());
           if (x.getValue() > max){
               max = x.getValue();
           }
       }
       if (max <= 2 * k){
           System.out.println("1");
       }else{
           System.out.println("0");
       }
    }
}
