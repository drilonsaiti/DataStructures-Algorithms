package sample.Hash.Medium;

import sample.Hash.CBHT;
import sample.Hash.MapEntry;
import sample.Hash.SLLNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Company {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        Hashtable<String,Integer> managerTable = new Hashtable<>();
        Hashtable<String,Integer> workerTable = new Hashtable<>();
        for(int i=0;i<n;i++) {
            String [] line = in.readLine().split(" ");

            String workers = line[0];
            workerTable.put(workers,i);
            String manager = line[1];
            if (!manager.equals(workers)){
                if (!managerTable.containsKey(manager)){
                    managerTable.put(manager,1);
                }else{
                    managerTable.put(manager,managerTable.get(manager)+1);
                }
            }
        }
        System.out.print("{");
        int length = managerTable.size();
        int count = 1;
        for (Map.Entry<String, Integer> str : managerTable.entrySet()){
            if (workerTable.containsKey(str.getKey())){
                if (count < length) {
                    System.out.print(str.getKey() + "=" + str.getValue() + ", ");
                }else if (count == length){
                    System.out.print(str.getKey() + "=" + str.getValue());
                }
            }
            count++;
        }
        System.out.println("}");
    }
}
