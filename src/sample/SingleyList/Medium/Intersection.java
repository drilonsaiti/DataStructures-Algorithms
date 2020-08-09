package sample.SingleyList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intersection {
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
        String[] array2 = s.split(" ");
        for (int i = 0; i < 3; i++) {
            lista2.insertLast(Integer.parseInt(array2[i]));
        }
        System.out.println(intersection(lista1,lista2));
    }
    public static int intersection(SLL<Integer> list,SLL<Integer> list2){
        SLLNode<Integer> node1 = list.getFirst();
        SLLNode<Integer> node2 = list2.getFirst();

        while (node1 != null){
            node1.element = -1 * node1.element;
            node1 = node1.succ;
        }
        node1 = node2;
        int ans = -1;
        while (node1 != null){
            if(node1.element<0){
                ans = -node1.element;
                break;
            }
            node1 = node1.succ;
        }
        return ans;
    }
}
