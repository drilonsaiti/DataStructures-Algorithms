package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Keyboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Character> row1 = stringToSet("qwertyuiopQWERTYUIOP");
        HashSet<Character> row2 = stringToSet("asdfghjklASDFGHJKL");
        HashSet<Character> row3 = stringToSet("zxcvbnmZXCVBNM");

        String[] word = br.readLine().split(" ");

        String[] res = new String[word.length];
        int k = 0;
        for (String s : word) {
            boolean r1 = false, r2 = false, r3 = false;
            for (Character c : s.toCharArray()) {
                if (row1.contains(c)) {
                    r1 = true;
                } else if (row2.contains(c)) {
                    r2 = true;
                } else if (row3.contains(c)) {
                    r3 = true;
                }
            }
            if ((r1 && r2) || (r1 && r2) || (r2 && r3))
                continue;
            res[k++] = s;
        }

        for (int i = 0; i < res.length; i++) {
            if(res[i] != null) {
                System.out.print(res[i] + " ");
            }
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
