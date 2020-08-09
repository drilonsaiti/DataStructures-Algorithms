package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModifyLS {
    public static void main(String[] args) throws IOException {

        SLL<Integer> lista1 = new SLL<Integer>();
        SLL<Integer> lista2 = new SLL<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        s = br.readLine();
        String[] array = s.split(" ");
        for (int i = 0; i < n; i++) {
            lista1.insertLast(Integer.parseInt(array[i]));
            lista2.insertLast(Integer.parseInt(array[i]));
        }

        System.out.println( modify(lista1,reverse(lista2)));
    }

    public static SLL<Integer> modify(SLL<Integer> list, SLLNode<Integer> list2){

       SLLNode<Integer> node = list.getFirst();
       SLLNode<Integer> reverse = list2;


        int length = list.length()/2;
        int count = 0;


       while (node != null && reverse != null) {
           if (count < length) {
               list.insertBefore(reverse.element-node.element,node);
               list.delete(node);
               count++;
               node = node.succ;
               reverse = reverse.succ;
           }else{
               list.insertBefore(reverse.element,node);
               list.delete(node);
               reverse = reverse.succ;
               node = node.succ;
           }
        }
       return list;
    }
    public static SLLNode<Integer> reverse(SLL<Integer> list){

        SLLNode<Integer> prev = null;
        SLLNode<Integer> current = list.getFirst();
        SLLNode<Integer> next = null;


        while (current != null) {
            next = current.succ;
            current.succ = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
