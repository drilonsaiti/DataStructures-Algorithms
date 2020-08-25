package sample.SingleyList.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class findInfo {
    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int broj = scanner.nextInt();
            sll.insertLast(broj);
        }

       find(sll,7);
    }

    public static void find (SLL<Integer> list,int x){
        SLLNode<Integer> node = list.getFirst();
        SLLNode<Integer> tmpNode = list.getFirst();
        int count = 0;
        int getPosition = 1;
        int flag = 0;
        while (node != null){
            count++;
            if (node.element == x){
                flag = 1;
                getPosition = count;
            }
            node = node.succ;
        }

        node = list.getFirst();
        int tmp = 1;
        while (node != null){
            if (getPosition == tmp){
                list.insertBefore(node.element, tmpNode);
                list.delete(node);
            }
            tmp++;
            node = node.succ;
        }


        if (flag == 0){
            System.out.println("-1");
        }else{
            System.out.println("Position: " + getPosition);
            System.out.println(list);
        }
    }
}
