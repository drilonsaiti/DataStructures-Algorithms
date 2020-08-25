package sample.SingleyList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DeleteOddEven {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        deleteOddEven(sll);
    }
    public static void deleteOddEven(SLL<Integer> lista){
        SLLNode<Integer> node = lista.getFirst();

        while (node != null && node.succ != null){
            if (node.element % 2 == 0 && node.succ.element % 2 == 0){
                lista.delete(node);
            }else if (node.element % 2 == 1 && node.succ.element % 2 == 1){
                lista.delete(node);
            }
            node = node.succ;
        }
        System.out.println(lista);
    }
}
