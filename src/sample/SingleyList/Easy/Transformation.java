package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Transformation {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        int x = Integer.parseInt(br.readLine());
        listTransformation(sll, x);
        System.out.println(sll);

    }

    public static void listTransformation(SLL<Integer> list,int x){

        SLLNode<Integer> node = list.getFirst();


        while (node != null && node.element != x) {
            node=node.succ;
        }
        //System.out.println(node.element);

        SLLNode<Integer> node2 = node;
        while(node2 != null){
            if(node2.element < x){
                list.insertBefore(node2.element,node);
                list.delete(node2);
            }
            node2 = node2.succ;
        }
    }
}
