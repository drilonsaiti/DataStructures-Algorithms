package sample.Hash.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class RepeatedDNA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        findDNA(str);
    }

    public static void findDNA(String str){
        Hashtable<String,Integer> table = new Hashtable<>();
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < str.length() - 10; i++){
            String DNA = str.substring(i,i+10);
            if (table.containsKey(DNA) && table.get(DNA) > 0){
                res.add(DNA);
                table.put(DNA,0);
            }else{
                table.put(DNA,table.getOrDefault(DNA,1));
            }
        }
        for (int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
    }
}
