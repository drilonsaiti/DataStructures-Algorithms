package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindN {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        System.out.println(findN(sll,2));

    }

    public static int findN(SLL<Integer> list,int k){
        SLLNode<Integer> node = list.getFirst();
        int length = list.length()-k;
        int count = 0;
        int tmp = 0;

        if(length > k) {
            while (node != null) {
                if (count == length) {
                    tmp = node.element;
                    node = node.succ;
                }
                count++;
                node = node.succ;
            }
        }else{
            return -1;
        }
        return tmp;
    }
}
