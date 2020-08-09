package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertBinary {

    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        convert(sll);
    }

    public static void convert(SLL<Integer> lista){
        SLLNode<Integer> node = lista.getFirst();

        int length = lista.length();
        int count = length - 1;

        int sum = 0;
        while (node != null){
            if(node.element == 1){
                sum += Math.pow(2,count);
                count--;
                node = node.succ;
            }else{
                count--;
                node = node.succ;
                sum += 0;
            }
        }
        System.out.println(sum);
    }
}
