package sample.SingleyList.Medium;

import java.util.Scanner;

public class Parovi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SLL<Integer> list = new SLL<Integer>();
        int n = scanner.nextInt();
        int [] array = new int [n];
        for (int i = 0; i < n; i++){
            list.insertLast(array[i] = scanner.nextInt());
        }

        function(list);
    }

    public static void function(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();
        SLLNode<Integer> tmp = null;

        int add = 0;
        int sub = 0;

        while (node != null) {

            tmp = node.succ;

            if (node.element % 2 == 0) {
                while (tmp != null) {
                    if (tmp.element % 2 == 0) {
                        add = node.element + tmp.element;
                        list.insertBefore(add,node);
                        list.delete(node);
                        list.delete(tmp);
                        break;
                    }
                    tmp = tmp.succ;
                }

            }
            node = node.succ;
        }

        node = list.getFirst();

        while (node != null) {

            tmp = node.succ;

            if (node.element % 2 == 1) {
                while (tmp != null) {
                    if (tmp.element % 2 == 1) {
                        sub = node.element - tmp.element;
                        list.insertAfter(sub,node);
                        list.delete(node);
                        list.delete(tmp);
                        break;
                    }
                    tmp = tmp.succ;
                }
            }
            node = node.succ;
        }

        node = list.getFirst();
        while (node != null){
            System.out.print(node.element + " ");
            node = node.succ;
        }
    }
}
