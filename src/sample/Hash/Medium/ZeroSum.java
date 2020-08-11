package sample.Hash.Medium;

import java.util.Hashtable;
import java.util.Scanner;

public class ZeroSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if(sum == 0){
                count++;
            }
            if(table.containsKey(sum)){
                count += table.get(sum);
                table.put(sum,table.get(sum)+1);
            }else{
                table.put(sum,1);
            }
        }
        System.out.println(count);
    }
}
