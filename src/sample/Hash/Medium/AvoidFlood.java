package sample.Hash.Medium;

import java.util.*;

public class AvoidFlood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        avoidFlood(array);
    }

    public static void avoidFlood(int [] rains){
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int [] array = new int[rains.length];
        int k = 0;
        int count = 0;

        for (int i = 0; i < rains.length; i++){
            Set<Integer> h = table.keySet();
            if (h.contains(rains[i]) && table.get(rains[i]) == i - 1){
                System.out.println(table.get(rains[i]));
                array = new int[0];
                Arrays.fill(new int[][]{array},null);
                break;
            }
            if (rains[i] > 0){
                array[k++] = -1;
                table.put(rains[i],count);
                count++;
            }else{
                if (!table.isEmpty()) {
                    for (Map.Entry<Integer, Integer> x : table.entrySet()) {
                        int elem = x.getKey();
                        array[k++] = elem;
                        table.remove(elem);
                        break;
                    }
                }else{
                    array[k++] = 1;
                }

            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
