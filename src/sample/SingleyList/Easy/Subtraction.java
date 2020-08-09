package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subtraction {
    public static void main(String[] args) throws IOException {
        SLL<Integer> lista1 = new SLL<Integer>();
        SLL<Integer> lista2 = new SLL<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        /*int n = Integer.parseInt(s);
        s = br.readLine();*/
        String[] array = s.split(" ");
        for (int i = 0; i < 4; i++) {
            lista1.insertLast(Integer.parseInt(array[i]));
        }

        s = br.readLine();
        String[] array2 = s.split(" ");
        for (int i = 0; i < 3; i++) {
            lista2.insertLast(Integer.parseInt(array2[i]));
        }
        System.out.println(substraction(lista1,lista2));
    }

    public static int substraction(SLL<Integer> list1,SLL<Integer> list2){
        SLLNode<Integer> node = list1.getFirst();
        SLLNode<Integer> node2 = list2.getFirst();

        int first = 0;
        int second = 0;
        int length = list1.length() - 1;
        int length2 = list2.length() - 1;
        int number = 0;
        while (node != null){
            first += Math.pow(10,length) * node.element;
            length--;
            node = node.succ;
        }
        while (node2 != null){
            second += Math.pow(10,length2) * node2.element;
            length2--;
            node2 = node2.succ;
        }

        return first-second;
    }
}
