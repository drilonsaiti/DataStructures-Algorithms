package sample.Hash.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;

public class SmallestWindows {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nuts = br.readLine();
        Hashtable<Character,Integer> table = new Hashtable<>();

        for (int i = 0; i < nuts.length(); i++){
            if (!table.containsKey(nuts.charAt(i))){
                table.put(nuts.charAt(i),1);
            }else{
                table.put(nuts.charAt(i),table.get(nuts.charAt(i))+1);
            }
        }

        char [] array = new char [30];
        for (Map.Entry<Character, Integer> c : table.entrySet()){
            System.out.print(c.getKey() + " ");
        }
        System.out.println();
        System.out.println(table.size());
    }
}
