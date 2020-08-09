package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Election {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int N = Integer.parseInt(br.readLine());
        String [] array = br.readLine().split("\\s+");
        String name = "";
        Hashtable<String,Integer> table = new Hashtable<>();
        for (int i = 0; i < N; i++){
            if (table.containsKey(array[i])){
                int c = table.get(array[i]);
                table.put(array[i],c+1);
            }else{
                table.put(array[i],1);
            }

            int value = table.get(array[i]);
            if(value > max){
                max = value;
                name = array[i];
            }
            if(value == max){
                name = name.compareTo(array[i])<0?name:array[i];
            }
        }
        System.out.println(name + " " + max);
    }
}
