package sample.SingleyList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        oddeven(sll);
        System.out.println(sll);
    }

    public static void oddeven(SLL<Integer> list){
        SLLNode<Integer> odd = list.getFirst();
        SLLNode<Integer> even = odd.succ;
        SLLNode<Integer> evenHead = even;

        while (even != null && even.succ != null){
            odd.succ = even.succ;
            odd = odd.succ;
            even.succ = odd.succ;
            even = even.succ;
        }
        odd.succ = evenHead;

    }
}
