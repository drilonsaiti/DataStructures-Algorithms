package sample.Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class KumanovoDijalekt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<String,String> table = new Hashtable<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            String [] array = br.readLine().split(" ");
            String kumanovo = array[0];
            String literatura = array[1];
            table.put(kumanovo,literatura);
        }

        String text = br.readLine();
        String [] array = text.split(" ");
        for (int i = 0; i < array.length; i++){
            if (table.containsKey(array[i])){
                array[i] = table.get(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }


}
