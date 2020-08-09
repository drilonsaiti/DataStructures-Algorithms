package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class ValidAnagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String  S = br.readLine();
        String [] T = br.readLine().split("");

        HashSet<Character> str = stringToSet(S);
        int flag = 0;
        for (String t : T){

            boolean bool = false;
            for (Character c : t.toCharArray()){
                if(str.contains(c)){
                    bool = true;
                }else{
                    bool = false;
                }
            }
            if (bool == true){
                flag = 1;
            }else{
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static HashSet<Character> stringToSet(String str){
        HashSet<Character> hashSet = new HashSet<>();
        for (char c : str.toCharArray()){
            hashSet.add(c);
        }
        return hashSet;
    }
}
