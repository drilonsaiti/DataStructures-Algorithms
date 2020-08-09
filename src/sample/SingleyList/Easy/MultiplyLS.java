package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyLS {

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
        System.out.println(multiply(lista1,lista2));
    }

    public static int multiply(SLL<Integer> list1,SLL<Integer> list2){
        SLLNode<Integer> node1 = list1.getFirst();
        SLLNode<Integer> node2 = list2.getFirst();

        int length1 = list1.length()-1;
        int length2 = list2.length()-1;

        int first = 0;
        int second = 0;

        while (node1 != null){
            first += Math.pow(10,length1) * node1.element;
            length1--;
            node1 = node1.succ;
        }
        while (node2 != null){
            second += Math.pow(10,length2) * node2.element;
            length2--;
            node2 = node2.succ;
        }
        return first*second;
    }
}
