package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class removeDuplicatesUnSortedLS {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        System.out.println(sll);
        removeDuplicates(sll);
        System.out.println(sll);
    }

    public static void removeDuplicates(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();
        SLLNode<Integer> node2 = list.getFirst();
        SLLNode<Integer> tmp = null;

        while (node != null){
            node2 = node.succ;
            tmp = node;

            while (node2 != null){
                if(!node.element.equals(node2.element)){
                    tmp = node2;
                    node2 = node2.succ;
                }else {
                    node2 = node2.succ;
                    tmp.succ = node2;
                }
            }
            node = node.succ;
        }
    }
}
