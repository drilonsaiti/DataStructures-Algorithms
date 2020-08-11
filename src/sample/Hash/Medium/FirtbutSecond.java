package sample.Hash.Medium;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class FirtbutSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int N = scanner.nextInt();
        int [] first = new int[N];
        for (int i = 0; i < N; i++){
            first[i] = scanner.nextInt();
            if(!table.containsKey(first[i])){
                table.put(first[i],1);
            }else{
                table.put(first[i],table.get(first[i])+1);
            }
        }
        N = scanner.nextInt();
        int [] second = new int[N];
        for (int i = 0; i < N; i++){
            second[i] = scanner.nextInt();
            if(table.containsKey(second[i])){
                table.put(second[i],table.get(second[i])+1);
            }
        }
        for (Map.Entry<Integer, Integer> x : table.entrySet()){
            if(x.getValue() == 1){
                System.out.println(x.getKey());
            }
        }
    }
}
