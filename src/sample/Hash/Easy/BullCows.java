package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class BullCows {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String secret = br.readLine();
        String guess = br.readLine();

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < guess.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                countA++;
            }
        }
        Hashtable<String,Integer> table = new Hashtable<>();

        for (int i = 0; i < secret.length(); i++){
            String key = secret.substring(i,i+1);
            if(table.containsKey(key)){
                table.put(key,table.get(key)+1);
            }else{
                table.put(key,1);
            }
        }
        String results = "";
        for (int i = 0; i < guess.length(); i++){
            String key = guess.substring(i,i+1);
            if(table.containsKey(key)){
                table.put(key,table.get(key)-1);
                if(table.get(key) >= 0){
                    countB++;
                }
            }
        }
        results = countA+"A"+(countB-countA)+"B";
        System.out.println(results);
    }
}
