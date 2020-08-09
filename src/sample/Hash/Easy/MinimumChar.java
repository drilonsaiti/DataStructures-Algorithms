package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        char [] array = new char[100];
        for (int i = 0; i < patt.length(); i++){

            if(i < str.length()) {
             char ch = str.charAt(i);
                if(Character.isLetter(ch)) {
                    if (table.containsKey(ch)) {
                        array[i] = ch;
                        break;
                    }
                }
            }else{
                break;
            }

        }
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
