package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddNumberToLS {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        System.out.println(addOne(sll));
    }

    public static SLL<Integer> addOne(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();


        int element;
        while (node != null){
            element = node.element + 1;
            list.insertBefore(element,node);
            list.delete(node);
            node = node.succ;
        }
        return list;
    }
}
