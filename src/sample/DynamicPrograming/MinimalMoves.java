package sample.DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MinimalMoves {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char [] array = str.toCharArray();
        String s = "";
        int count = 0;
        System.out.println(str.length());
        s += array[0];
        for (int i = 0; i < array.length; i++){
            if(i == 0){
                s += array[i];
                count++;
            }
             if(s.length() == str.length()){
                 break;
             }else if (s.length() <= str.length() - s.length()){
                 s+=s;
                 System.out.println("else if " + s);
                 count++;
             }else{
                 System.out.println("lenght of s " + s.length());
                 s+=array[i];
                 System.out.println("else " + s);
                 count++;
             }
            System.out.println(s);

        }
        System.out.println(count);
    }
}
