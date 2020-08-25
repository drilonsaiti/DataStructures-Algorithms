package sample.SingleyList.Medium;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountAndDelete {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        countAndDelete(sll);
    }
    public static void countAndDelete(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();
        int count = 0;
        int thisNumber = 1;

        while (node != null){
            if (count == thisNumber){
                list.delete(node);
                thisNumber++;
                count = 0;
            }else{
                count++;
            }
            node = node.succ;

        }
        System.out.println(list);
    }
}
