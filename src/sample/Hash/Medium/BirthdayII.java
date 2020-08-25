package sample.Hash.Medium;

import sample.Hash.CBHT;
import sample.Hash.MapEntry;
import sample.Hash.SLLNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BirthdayII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        CBHT<String,Workers> table = new CBHT<>(2*n);
        for (int i = 0; i < n; i++){
            String [] array = br.readLine().split(" ");
            String [] date = array[2].split("/");
            table.insert(date[0]+date[1],new Workers(array[0],array[1],Integer.parseInt(date[2])));
        }
        String [] date = br.readLine().split("/");
        SLLNode<MapEntry<String,Workers>> node = table.search(date[0]+date[1]);

        if (node != null){
            while (node != null){
                System.out.println(node.getElement().value+" "+ (Integer.parseInt(date[2]) - node.getElement().value.year));
                node = node.getSucc();
            }
        }else{
            System.out.println("Nema");
        }
    }

     static class Workers implements Comparable<Workers>{
        String name;
        String lastname;
        int year;

        public Workers(String name,String lastname,int year){
            this.name = name;
            this.lastname = lastname;
            this.year = year;
        }

        public String toString(){
            return name + " " + lastname;
        }
        @Override
        public int compareTo(Workers o) {
            return 0;
        }
    }
}
