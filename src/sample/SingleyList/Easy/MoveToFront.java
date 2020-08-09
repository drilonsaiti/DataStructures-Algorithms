package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoveToFront {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        System.out.println(sll);
        moveToFront(sll);
        System.out.println(sll);
    }

    public static void moveToFront(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();
        SLLNode<Integer> tmp = node;
        SLLNode<Integer> findLast = null;
        while(tmp.succ != null){
            findLast = tmp;
            tmp = tmp.succ;
        }

        findLast.succ = null;

    }
}
