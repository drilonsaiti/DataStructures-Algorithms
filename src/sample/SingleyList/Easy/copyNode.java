package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class copyNode {
    public static void main(String[] args) throws IOException {
        SLL<Integer> lista1 = new SLL<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = Integer.parseInt(s);

        s = br.readLine();
        String[] array = s.split(" ");

        for (int i = 0; i < n; i++) {
            lista1.insertLast(Integer.parseInt(array[i]));
        }
        SLLNode<Integer> node = copy(lista1.getFirst());

        while (node != null){
            System.out.print(node.element + " ");
            node = node.succ;
        }
    }

    public static SLLNode<Integer> copy(SLLNode<Integer> list){
        SLLNode<Integer> node = list;
        SLLNode<Integer> tmp;
        SLLNode<Integer> dummy = new SLLNode<Integer>();

        tmp = dummy;


        while (node != null) {
            tmp.succ = new SLLNode<>(node.element,tmp.succ);
            tmp = tmp.succ;
            node = node.succ;
        }
        return dummy.succ;
    }
}
