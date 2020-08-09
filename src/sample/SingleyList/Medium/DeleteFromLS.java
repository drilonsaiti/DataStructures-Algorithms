package sample.SingleyList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteFromLS {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        int k = Integer.parseInt(br.readLine());
        delete(sll, k);
        System.out.println(sll);
    }

    public static void delete(SLL<Integer> list, int k){
        SLLNode<Integer> node = list.getFirst();
        SLLNode<Integer> tmp = null;
       /* while (node != null){
            if(node.element == k){
                list.delete(node);
            }
            node = node.succ;
        }*/


            tmp = node.succ;
            node.element = tmp.element;
            node.succ = tmp.succ;
            tmp = null;
            //node = node.succ;

    }
}
