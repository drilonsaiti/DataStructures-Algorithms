package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        System.out.println(sll);
        reverse(sll);
        System.out.println(sll);


    }

    public static void reverse(SLL<Integer> list){

        SLLNode<Integer> node1 = list.getFirst();
        SLLNode<Integer> node2 = list.getFirst();
        SLLNode<Integer> tmp = null;

        while(node1 != null){
            node1 = node1.succ;
            node2.succ = tmp;
            tmp = node2;
            node2 = node1;

        }
        list.setFirst(tmp);

    }

}
