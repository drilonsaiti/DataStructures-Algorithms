package sample.SingleyList.Medium;

import java.util.Scanner;

public class PartitionList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SLL<Integer> list = new SLL<Integer>();
        int n = scanner.nextInt();
        int [] array = new int [n];
        for (int i = 0; i < n; i++){
            list.insertLast(array[i] = scanner.nextInt());
        }
        int x = scanner.nextInt();

        partiton(list, x);
        System.out.println(list);
    }
    public static void partiton(SLL<Integer> list, int x){
        SLLNode<Integer> node = list.getFirst();

        while (node != null && node.element <= x) {
            node=node.succ;
        }

        SLLNode<Integer> node2 = node;

        while(node2 != null){
            if(node2.element <= x){
                list.insertBefore(node2.element,node);
                list.delete(node2);
            }
            node2 = node2.succ;
        }
    }
}
