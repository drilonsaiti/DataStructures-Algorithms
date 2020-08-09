package sample.SingleyList.Easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SpojList{
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
        System.out.println(join(lista1,lista2));
    }

    public static SLL<Integer> join(SLL<Integer> list1,SLL<Integer> list2){

        SLLNode<Integer> node1 = list1.getFirst();
        SLLNode<Integer> node2 = list2.getFirst();
        SLL<Integer> results = new SLL<>();

        while(node1 != null && node2 != null){
            if(node1.element.compareTo(node2.element)<0){
                results.insertLast(node1.element);
                node1 = node1.succ;
            }else{
                results.insertLast(node2.element);
                node2 = node2.succ;
            }

            if(node1 != null){
                while(node1 != null){
                    results.insertLast(node1.element);
                    node1 = node1.succ;
                }
            }
            if(node2 != null){
                while(node2 != null){
                    results.insertLast(node2.element);
                    node2 = node2.succ;
                }
            }
        }
        return sort(results);
    }
    public static SLL<Integer> sort(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();
        SLLNode<Integer> index = null;
        int tmp;

        while (node != null){
            index = node.succ;
            while(index != null){
                if(node.element > index.element){
                    tmp = node.element;
                    node.element = index.element;
                    index.element = tmp;
                }
                index = index.succ;
            }
            node = node.succ;
        }
        return list;
    }
}
