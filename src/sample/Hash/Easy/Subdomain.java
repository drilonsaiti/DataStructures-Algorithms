package sample.Hash.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Subdomain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> counts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String [] cpdomains = new String[N];
        for (int i = 0; i < N; i++){
            cpdomains[i] = br.readLine();
        }

        for (String domain : cpdomains){
            String [] cpinfo = domain.split("\\s+");
            String [] frags = cpinfo[1].split("\\.");
            int count = Integer.valueOf(cpinfo[0]);
            String cur = "";
            for (int i = frags.length -1; i >= 0; --i){
                if(i < frags.length-1){
                    cur = frags[i]+"."+cur;
                }else{
                    cur = frags[i] + "" + cur;
                }
                counts.put(cur,counts.getOrDefault(cur,0) + count);
            }
        }
        for (String dom : counts.keySet()){
            System.out.println("" + counts.get(dom) + " " + dom);
        }
    }
}
