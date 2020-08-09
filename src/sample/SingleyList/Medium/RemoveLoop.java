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
        remove(sll, k);
        System.out.println(sll);
    }

    public static void remove(SLL<Integer> list,int x){
        SLLNode<Integer> node = list.getFirst();
        int length = list.length();
        int count = 0;

        int flag = 0;
        while (node != null){
            if (x != 0){
                if(count >= x){
                    list.delete(node);
                    flag = 1;
                }else{
                    count++;
                }
            }else{
                node.succ = null;
                flag = 1;
            }
            node = node.succ;
        }

        if(list.length() > 0){
            flag = 1;
        }else {
            flag = 0;
        }
        System.out.println(flag);
    }
}
