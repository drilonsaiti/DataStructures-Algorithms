package sample.Hash.Medium;

import sample.Hash.OBHT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Speluvanje {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        OBHT<String,Integer> table = new OBHT<>(2*n);

        for (int i = 0; i < n; i++){
            String word = br.readLine();
            table.insert(word,i);
        }
        String [] line = br.readLine().split(" ");

        int flag = 0;
        String errors = "";

        for (int i = 0; i < line.length; i++){
            line[i] = line[i].toLowerCase();

            String znaci = "";
            if (line.length == 1){
               errors += "Bravo";
                break;
            }
            if (table.search(line[i]) != -1){
                flag = 1;
            }else if (line[i].contains(".") || line[i].contains(",") || line[i].contains("!") || line[i].contains("?")){
                String word = line[i];
                 znaci = word.substring(word.length()-1);
                line[i] = line[i].substring(0,word.length()-1);
                if (table.search(line[i]) != -1){
                    line[i] = line[i] + znaci;
                }else{
                    errors += line[i] + "\n";
                }
            }else{
                errors += line[i] + znaci + "\n";
            }
        }
        if (errors.isEmpty()){
            System.out.println("Bravo");
        }else {
            System.out.println(errors);
        }
    }
}
