package sample.Hash.Easy;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UniqueOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] array = new int [N];
        Hashtable<Integer,Integer> table = new Hashtable<>();

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
            if (!table.containsKey(array[i])) {
                table.put(array[i], 1);
            } else {
                table.put(array[i], table.get(array[i]) + 1);
            }
        }

            int [] occurrences = new int[table.size()];
            int j = 0;
            for (Map.Entry<Integer, Integer> x : table.entrySet()){
                occurrences[j++] = x.getValue();
            }
            int flag = 1;
            for (int i = 0; i < occurrences.length; i++){
                for (int k = i+1; k < occurrences.length; k++){
                    if(occurrences[i] == occurrences[k]){
                        flag = 0;
                    }
                }
            }
            if(flag == 1)
                System.out.println("true");
            else
                System.out.println("false");
    }
}
