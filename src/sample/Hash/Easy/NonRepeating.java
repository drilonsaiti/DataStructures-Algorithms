package sample.Hash.Easy;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class NonRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] array = new int [N];
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
            if (!table.containsKey(array[i])){
                table.put(array[i],1 );
            }else{
                table.put(array[i],table.get(array[i])+1);
            }
        }

        int min = table.get(array[0]);
        int key = 0;
        for (Map.Entry<Integer, Integer> x : table.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
            if(min >= x.getValue()){
                min = x.getValue();
                key = x.getKey();
                //System.out.println(key);
            }
        }
        System.out.println(key);

    }
}
