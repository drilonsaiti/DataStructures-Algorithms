package sample.Hash.Medium;


import sample.Hash.CBHT;
import sample.Hash.MapEntry;
import sample.Hash.SLLNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Birthday {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        CBHT<Integer,String> table = new CBHT<>(2*n);
        for (int i = 0; i < n; i++){
            String [] array = br.readLine().split(" ");
            String name = array[0];
            String [] date = array[1].split("\\.");
            table.insert(Integer.parseInt(date[1]),name);
        }
        int month = Integer.parseInt(br.readLine());
        SLLNode<MapEntry<Integer,String>> node = table.search(month);

        if (node != null){
            while (node != null){
                System.out.println(node.getElement().value+"");
                node = node.getSucc();
            }
        }else{
            System.out.println("Nema");
        }

    }
}
