package sample.Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Translator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Hashtable<String,String> table = new Hashtable<>();
        for (int i = 0; i < N; i++){
            String [] array = br.readLine().split(" ");
            String macedonian = array[0];
            String english = array[1];
            table.put(english,macedonian);
        }
        System.out.println();

        while (true){
            String word = "";
            word = br.readLine();
            if(word.equals("KRAJ"))
                break;
            if(table.containsKey(word)){
                System.out.println(table.get(word));
            }else{
                System.out.println("/");
            }
        }
    }

}
