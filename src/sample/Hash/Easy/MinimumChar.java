package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class MinimumChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String patt = br.readLine();
        Hashtable<Character,Character> table = new Hashtable<>();
        for (int i = 0; i < patt.length(); i++){
            char ch = patt.charAt(i);
            table.put(ch,ch);
        }

        ArrayList<Character> array = new ArrayList<Character>();
        int k = 0;
        for (int i = 0; i < patt.length(); i++){
            if (i < str.length()){
                char ch = str.charAt(i);
                if (Character.isLetter(ch) && (ch != ' ')) {
                    if (table.containsKey(ch)) {
                        array.add(k,ch);
                        k++;
                        break;
                    }
                }
            }else{
                break;
            }
        }

        if (array.size() != 0) {
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i));
            }
        }else {
            System.out.println("No character present");
        }
    }
}
