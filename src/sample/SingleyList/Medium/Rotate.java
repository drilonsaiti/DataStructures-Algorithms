package sample.SingleyList.Medium;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SLL<Integer> list = new SLL<Integer>();
        int n = scanner.nextInt();
        int [] array = new int [n];
        for (int i = 0; i < n; i++){
            list.insertLast(array[i] = scanner.nextInt());
        }
        int x = scanner.nextInt();

        SLLNode<Integer> results;
        results = rotate(list.getFirst(), x);

        while (results != null){
            System.out.print(results.element + " ");
            results = results.succ;
        }
    }
    public static SLLNode<Integer> rotate(SLLNode<Integer> list, int k){
        SLLNode<Integer> current = list;
        SLLNode<Integer> next = null;
        SLLNode<Integer> prev = null;

        int count = 0;

        while (count < k && current != null){
            next = current.succ;
            current.succ = prev;
            prev = current;
            current = next;
            count++;
        }

        if(next != null)
            list.succ = rotate(next,k);
        return prev;
    }

    public static SLLNode<Integer> copy(SLLNode<Integer> list, int x){
        SLLNode<Integer> node = list;
        SLLNode<Integer> tmp;
        SLLNode<Integer> dummy = new SLLNode<Integer>();

        tmp = dummy;

        int count = 0;
        while (node != null && count <= x) {
            tmp.succ = new SLLNode<>(node.element,tmp.succ);
            tmp = tmp.succ;
            node = node.succ;
            count++;
        }
        return dummy.succ;
    }
}
