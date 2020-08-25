package sample.Hash.Medium;

import jdk.swing.interop.SwingInterOpUtils;

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

        for (int i = 0; i < array.length; i++) {
            if (table.containsKey(array[i])){
                array[i] = table.get(array[i]);
            }else {
                String ch = array[i];
                String h = array[i];
                char c = ch.charAt(0);
                String ss = "";
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                    h = h.substring(1);
                    String str = String.valueOf(c) + h;
                    if (table.containsKey(str)) {
                        String s = table.get(str).substring(0, 1).toUpperCase();
                        array[i] = s + table.get(str).substring(1);
                    }
                }
                if (array[i].contains(".")) {
                    ss = array[i].substring(0, ch.length() - 1);
                    if (table.containsKey(ss)) {
                        array[i] = table.get(ss)+".";
                    }
                } else if (array[i].contains(",")) {
                    ss = array[i].substring(0, ch.length() - 1);
                    if (table.containsKey(ss)) {
                        array[i] = table.get(ss)+",";
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }


}
