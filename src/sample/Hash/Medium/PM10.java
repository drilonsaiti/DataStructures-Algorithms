package sample.Hash.Medium;

import sample.Hash.CBHT;
import sample.Hash.MapEntry;
import sample.Hash.SLLNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class PM10 {
    //bez zabeleska
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<String,Double> table = new Hashtable<>();

        int n = Integer.parseInt(br.readLine());
        String [] nameOfCitys = new String[n];
        for (int i = 0; i < n; i++){
            String [] array = br.readLine().split(" ");
            String city = array[0];
            nameOfCitys[i] = array[0];
            double pm = Double.parseDouble(array[1]);
            if (!table.containsKey(city)){
                table.put(city,pm);
            }else{
                table.put(city,table.get(city)+pm);
            }
        }

        String city = br.readLine();
        int count = 0;
        for (int i = 0; i < nameOfCitys.length; i++){
            if (nameOfCitys[i].equals(city)){
                count++;
            }
        }
        if (count != 0) {
            System.out.printf("%.2f\n",(double) table.get(city) / count);
        }else{
            System.out.println("Nema podatoci");
        }
    }*/
    //so zabeleska na primer : Забелешка: При реализација на задачите не е дозволено да се користат помошни структури како низи или сл. На располагање од структурите имате само една хеш структура

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        CBHT<String,Double> table = new CBHT<>(2*n);
        for (int i = 0; i < n; i++){
            String [] array = br.readLine().split(" ");
            String city = array[0];
            double pm = Double.parseDouble(array[1]);
            table.insert(city,pm);
        }

        String city = br.readLine();
        SLLNode<MapEntry<String,Double>> node = table.search(city);

        if (node != null){
            int count = 0;
            double sum = 0;
            while (node != null){
                if (city.equals(node.getElement().key)) {
                    sum += node.getElement().value;
                    count++;
                }
                node = node.getSucc();
            }
            System.out.printf("%.2f\n",sum/count);
        }else{
            System.out.println("Nema podatoci");
        }

    }
}
