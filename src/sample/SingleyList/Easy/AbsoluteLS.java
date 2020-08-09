package sample.SingleyList.Easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbsoluteLS {

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
        System.out.println(sortedList(lista1));
    }

    public static SLL<Integer> sortedList(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();
        SLLNode<Integer> index = null;
        int tmp;

        while (node != null){
            index = node.succ;
            while(index != null) {
                if (node.element > index.element) {
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
