package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class JewelsStones {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] J = br.readLine().split("");
        String [] S = br.readLine().split("");
        Hashtable<String,Integer> table = new Hashtable<>();

        for (int i = 0; i < J.length; i++){
            table.put(J[i],i);
        }

        int count = 0;

            for (int j = 0; j < S.length;j++) {
                System.out.print("S " + S[j] + " ");
                if (table.containsKey(S[j])) {
                    count++;
                }
        }
        System.out.println(count);

    }

}
