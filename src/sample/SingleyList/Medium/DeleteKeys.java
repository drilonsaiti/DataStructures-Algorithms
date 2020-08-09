package sample.SingleyList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DeleteKeys {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        int x = Integer.parseInt(br.readLine());
        deleteOccurances(sll, x);
        System.out.println(sll);
    }

    public static void deleteOccurances(SLL<Integer> list,int k){
        SLLNode<Integer> node = list.getFirst();

        while (node != null){
            if(node.element == k){
                list.delete(node);
            }
            node = node.succ;
        }

    }
}
