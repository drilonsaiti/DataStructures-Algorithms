package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicatesSortedSLL {
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

    public static SLL<Integer> removeDuplicates(SLL<Integer> list){
       SLLNode<Integer> node = list.getFirst();

       while(node.succ != null){
           if(node.element.equals(node.succ.element)){
               node.succ = node.succ.succ;
           }else{
               node = node.succ;
           }
       }
       return list;
    }
}
