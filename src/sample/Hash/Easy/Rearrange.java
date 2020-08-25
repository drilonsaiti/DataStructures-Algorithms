package sample.Hash.Easy;

import java.util.Hashtable;
import java.util.Scanner;

public class Rearrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for (int i = 0; i < N;i++){
            table.put(i,i);
        }
        int [] array = new int[N];
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        array = sort(array);
        int [] finallArray = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++){
            if (table.containsKey(array[i])){
                finallArray[table.get(array[i])] = array[i];
                count++;
            }else{
                System.out.println(array[i]);
                finallArray[i] = -1;
            }
            if(finallArray[i] == 0 && i != 0){
                finallArray[i] = -1;
            }
        }
        for (int i = 0; i < finallArray.length;i++){
            System.out.print(finallArray[i] + " ");
        }
    }
    public static int [] sort(int [] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }
}
