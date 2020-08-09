package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RemoveDuplicatesUnsortedSLL {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        System.out.println(sll);
        //removeDuplicates(sll);
        System.out.println(sll);
    }

    public static void removeDupilcates(SLL<Integer> list){

        SLLNode<Integer> node1 = list.getFirst();
        SLLNode<Integer> node2 = list.getFirst();
        SLLNode<Integer> prev = null;

        while(node1 != null){
            node2 = node1.succ;
            prev = node1;
            while(node2 != null){
                if(!node1.element.equals(node2.element)){
                    prev = node2;
                    node2 = node2.succ;
                }else{
                    node2 = node2.succ;
                    prev.succ = node2;

                }
            }
            node1 = node1.succ;
        }

    }
}
