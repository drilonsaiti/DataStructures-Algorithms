package sample.SingleyList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Split {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        SLLNode<Integer> finalNode = split(sll);
        while (finalNode != null){
            System.out.print(finalNode.element + " ");
            finalNode = finalNode.succ;
        }
    }

    public static SLLNode<Integer> split(SLL<Integer> list){
        SLLNode<Integer> head = list.getFirst();
        SLLNode<Integer> node = new SLLNode<>(0,head);
        SLLNode<Integer> curr = node;

        while (curr != null){
            int sum = 0;
            while (head != null){
                sum += head.element;
                if(sum == 0)
                    curr.succ = head.succ;
                head = head.succ;
            }
            curr = curr.succ;
            if(curr != null){
                head = curr.succ;
            }

        }
        return node.succ;
    }
}
