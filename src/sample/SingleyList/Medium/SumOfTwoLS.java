package sample.SingleyList.Medium;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoLS {
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
        }
        s = br.readLine();
        n = Integer.parseInt(s);
        s = br.readLine();
        String[] array2 = s.split(" ");
        for (int i = 0; i < n; i++) {
            lista2.insertLast(Integer.parseInt(array2[i]));
        }
        System.out.println(addTwo(lista1,lista2));
    }

    public static SLL<Integer> addTwo(SLL<Integer> list1, SLL<Integer> list2){
        SLLNode<Integer> node1 = list1.getFirst();
        SLLNode<Integer> node2 = list2.getFirst();
        SLL<Integer> results = new SLL<Integer>();

        while (node1 != null && node2 != null){
            if (list1.length() == list2.length()) {
                results.insertLast(node1.element + node2.element);
                node1 = node1.succ;
                node2 = node2.succ;
            }

        }
        if(node1 != null){
            while (node1 != null){
                results.insertLast(node1.element);
                node1 = node1.succ;
            }
        }
        if(node2 != null){
            while (node2 != null){
                results.insertLast(node2.element);
                node2 = node2.succ;
            }
        }
        return results;
    }

}
