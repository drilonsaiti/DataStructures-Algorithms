package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteKth {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        int k = Integer.parseInt(br.readLine());
        deleteKth(sll, k);
        System.out.println(sll);
    }

    public static void deleteKth(SLL<Integer> list, int k){
        SLLNode<Integer> node = list.getFirst();

        int count = 1;


        while(node != null){
            if(count == k){
                list.delete(node);
                count = 1;
                node = node.succ;
            }else {
                count++;
                node = node.succ;
            }
        }
    }
}
