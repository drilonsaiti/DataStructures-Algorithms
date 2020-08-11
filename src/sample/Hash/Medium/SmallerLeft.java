package sample.Hash.Medium;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class SmallerLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int N = scanner.nextInt();
        int [] first = new int[N];
        for (int i = 0; i < N; i++){
            first[i] = scanner.nextInt();
                table.put(i,first[i]);
        }
        HashSet<Integer> hashSet = new HashSet<>();
        Hashtable<Integer,Integer> results = new Hashtable<>();
        int count = 0;
        for (int i = 0; i < N; i++){
            int num = table.get(i);
            if(i-1 >= 0) {
                if (table.get(i-1) < table.get(i)) {
                    results.put(count,table.get(i-1));
                } else {
                    results.put(count,-1);
                }
            }else{
                results.put(count,-1);
            }
            count++;
        }
        for (int i = 0; i < results.size(); i++){
            System.out.print(results.get(i) + " ");
        }

    }
}
