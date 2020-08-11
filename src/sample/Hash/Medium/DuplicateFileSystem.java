package sample.Hash.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateFileSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String> table = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String [] filepath = new String[N];
        for (int i = 0; i < N; i++){
            filepath[i] = br.readLine();
        }

        for (String path : filepath) {
            String [] fsinfo = path.split("\\s+");
            String root = fsinfo[0];
            int ind = 0;

            for (int i = 1; i < fsinfo.length; i++){
                String full = fsinfo[i];
                if(fsinfo[i].contains("root")) {
                    root = fsinfo[i];
                }else {
                    String[] s = fsinfo[i].split("");
                    for (int j = 0; j < s.length; j++) {
                        if (s[j].equals("(")) {
                            ind = j;
                        }
                    }
                }

                String str = full.substring(0,ind);
                String text = full.substring(6,full.length()-1);
                if(str.contains("root/")){
                    str = "";
                    text = "";
                }

                if(!table.containsKey(text)){
                    if(!(text.isEmpty())){
                    String fullName = root+"/"+str;
                        table.put(text, " " + fullName + " ");
                    }
                }else{
                    String fullName = root+"/"+str;
                    table.put(text," " +fullName+table.get(text) + " ");
                }

            }
        }

        for (Map.Entry<String, String> s : table.entrySet()){
            System.out.println(s.getValue());
        }
    }
}
