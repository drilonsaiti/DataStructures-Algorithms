package sample.Hash.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class NutsBolts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nuts = br.readLine();
        String bolts = br.readLine();
        Hashtable<Character,Integer> tableNuts = new Hashtable<>();
        Hashtable<Character,Integer> tableBolts = new Hashtable<>();
        for (int i = 0; i < nuts.length(); i++){
            if (!tableNuts.containsKey(nuts.charAt(i))){
                tableNuts.put(nuts.charAt(i),1);
            }else{
                tableNuts.put(nuts.charAt(i),tableNuts.get(nuts.charAt(i))+1);
            }
        }

        for (int i = 0; i < bolts.length(); i++){
            if (!tableBolts.containsKey(bolts.charAt(i))){
                tableBolts.put(bolts.charAt(i),1);
            }else{
                tableBolts.put(bolts.charAt(i),tableNuts.get(bolts.charAt(i))+1);
            }
        }


        int flag = 0;
        char [] arrayNuts = new char[tableNuts.size()];
        char [] arrayBolts = new char[tableBolts.size()];
        int j = 0;
        int k = 0;
        for (Map.Entry<Character, Integer> c : tableNuts.entrySet()){
            for (Map.Entry<Character, Integer> ch : tableBolts.entrySet()){
                if(c.getKey() == ch.getKey() && c.getKey().compareTo(' ') != 0 && ch.getKey().compareTo(' ') != 0){
                    arrayNuts[j++] = c.getKey();
                    arrayBolts[k++] = ch.getKey();
                    flag = 1;
                }else{
                    flag = 0;
                }
            }
        }
        if (flag == 1)
        {
            Arrays.sort(arrayBolts);
            Arrays.sort(arrayNuts);
            for (int i = 0; i < arrayBolts.length; i++){
                System.out.print(arrayBolts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < arrayNuts.length; i++){
                System.out.print(arrayNuts[i] + " ");
            }
        }else{
            System.out.println("Are Different");
        }
    }

    //another solution
   /* public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nuts = br.readLine().split(" ");
        String[] bolts = br.readLine().split(" ");
        Arrays.sort(nuts);
        Arrays.sort(bolts);
        Hashtable<String, Integer> table = new Hashtable<>();

        for (int i = 0; i < nuts.length; i++) {
            if (!table.containsKey(nuts[i])) {
                table.put(nuts[i], 1);
            } else {
                table.put(nuts[i], table.get(nuts[i]) + 1);
            }
        }
        String different = "";
        int flag = 0;
        if (nuts.length == bolts.length) {
            for (int i = 0; i < bolts.length; i++) {
                if (table.containsKey(bolts[i])){
                    flag = 1;
                }else{
                    flag = 0;
                    different += bolts[i] + " ";
                    break;
                }
            }
        }else{
            System.out.println("Are different because of length");
        }
        Arrays.sort(nuts);
        Arrays.sort(bolts);
        if (flag == 1){
            for (int i = 0; i < nuts.length;i++){
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < bolts.length; i++){
                System.out.print(bolts[i] + " ");
            }
        }else{
            System.out.println("Are different because of this " + different );
        }

    }*/
}
