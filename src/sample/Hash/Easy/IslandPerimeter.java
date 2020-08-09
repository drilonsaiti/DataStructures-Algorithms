package sample.Hash.Easy;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class IslandPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [][] array = new int [N][M];
        Hashtable<Integer,Integer> table = new Hashtable<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = scanner.nextInt();
                if(!table.containsKey(array[i][j])){
                    table.put(array[i][j],1);
                }else{
                    table.put(array[i][j],table.get(array[i][j])+1);
                }
            }
        }
        int perimeter = 0;
        for (Map.Entry<Integer, Integer> x : table.entrySet()){
           if(x.getKey() == 1){
               perimeter = 2*(x.getValue() + 1);
           }
        }
        System.out.println(perimeter);
    }
}
