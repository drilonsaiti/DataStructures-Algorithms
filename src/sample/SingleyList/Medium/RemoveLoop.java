package sample.SingleyList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveLoop {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        int k = Integer.parseInt(br.readLine());

        System.out.println(remove(sll, k));
    }

    public static int remove(SLL<Integer> list,int x){
        SLLNode<Integer> node = list.getFirst();
        int count = 0;

        while (node != null ){
            if (x != 0){
                if(count >= x){
                    list.delete(node);
                }else{
                    count++;
                }
            }else{
                list.deleteList();
            }
            node = node.succ;
        }

        if(list.length() > 0){
            return 1;
        }else {
            return 0;
        }
    }
}
