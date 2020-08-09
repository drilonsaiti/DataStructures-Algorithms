package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteMiddle {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        System.out.println(sll);

        System.out.println(deleteMiddle(sll));

    }

    public static SLL<Integer> deleteMiddle(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();
        int number = findMidle(list);

        while (node != null){
            if(node.element == number){
                list.delete(node);
            }
            node = node.succ;
        }
        return list;
    }

    public static int findMidle(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();
        int tmp = 0;
        int count = 0;
        while (count < (list.length()/2) + 1){
            tmp = node.element;
            node = node.succ;
            count++;
        }
        return tmp;
    }
}
