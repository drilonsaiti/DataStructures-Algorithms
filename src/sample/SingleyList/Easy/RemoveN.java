package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveN {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        System.out.println(sll);
        removeN(sll,2);
        System.out.println(sll);
    }

    public static void removeN(SLL<Integer> list,int k){
        SLLNode<Integer> node = list.getFirst();
        int length = list.length() - k;
        int count = 0;

        while (node != null){
            if(count == length){
                list.delete(node);
                node = node.succ;
                count++;
            }else{
                node = node.succ;
                count++;
            }
        }
    }
}
