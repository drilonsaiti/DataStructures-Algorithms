package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountInLS {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        int x = Integer.parseInt(br.readLine());

        System.out.println( countNumber(sll, x));
    }

    public static int countNumber(SLL<Integer> list,int k){

        SLLNode<Integer> node = list.getFirst();
        int count = 0;

        while (node != null){
            if(node.element.equals(k)){
                count ++;
            }
            node = node.succ;
        }
        return count;
    }
}
