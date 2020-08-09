package sample.Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Password {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Hashtable<String,String> table = new Hashtable<>();

        for (int i = 1; i <= N; i++){
            String nameAndPass = br.readLine();
            String [] pom = nameAndPass.split(" ");
            String name = pom[0];
            String pass = pom[1];
            table.put(name,pass);
        }
        int count = 0;
        while (count < N){
            String line = br.readLine();
            if(line.equals("KRAJ"))
                break;
            String pom[] = line.split(" ");
            String name = pom[0];
            String pass = pom[1];

            if(table.containsKey(name)){
                if(table.get(name).equals(pass)){
                    System.out.println("Najaven");
                }else{
                    System.out.println("Nenajaven");
                }
            }else{
                System.out.println("Nenajaven");
            }
            count++;
        }
    }
}
