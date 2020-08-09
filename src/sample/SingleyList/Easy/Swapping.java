package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swapping {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        System.out.println(pairSwap(sll));
    }

    public static SLL<Integer> pairSwap(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();

        while (node != null && node.succ != null){
            int x = node.element;
            node.element = node.succ.element;
            node.succ.element = x;
            node = node.succ.succ;
        }
        return list;
    }
}
