package sample.Hash.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;

public class MakeFSUnique {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str = br.readLine().split(" ");
        getFolderNames(str);
    }

    public static void getFolderNames(String [] names){
        Hashtable<String,Integer> table = new Hashtable<>();

        int count = 0;

        for (int i = 0; i < names.length; i++){
            String name = names[i];
            if (!table.containsKey(name)){
                table.put(name,1);
                continue;
            }
            int x = table.get(name);
            String newName = name + "(" + x + ")";
            while (table.containsKey(newName)){
                x++;
                newName = name + "(" + x + ")";
            }
            names[i] = newName;
            table.put(name,x+1);
            table.put(newName,1);
        }
        for (Map.Entry<String, Integer> s : table.entrySet()){
            System.out.print(s.getKey() + " ");
        }
    }
}
