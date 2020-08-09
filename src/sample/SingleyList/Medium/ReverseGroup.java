package sample.SingleyList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseGroup {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        int k = Integer.parseInt(br.readLine());
        SLLNode<Integer> node = sll.getFirst();
        SLLNode<Integer> finalNode = reverse(node, k);
       while (finalNode != null){
            System.out.print(finalNode.element + " ");
            finalNode = finalNode.succ;
        }



    }

    public static SLLNode<Integer> reverse(SLLNode<Integer> list,int k){
        SLLNode<Integer> node = list;
        SLLNode<Integer> prev = null,next = null;
        int count = 0;

        while (node != null && count < k){
            if(count >= k){

            }
            next = node.succ;
            node.succ = prev;
            prev = node;
            node = next;
            count++;

        }
        if(next != null){
            node.succ = reverse(next,k);
        }
        return prev;
    }

}
