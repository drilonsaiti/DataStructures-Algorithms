package sample.SingleyList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoNum {
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
        System.out.println(addTwo(lista1,lista2));
    }

    public static SLL<Integer> addTwo(SLL<Integer> list, SLL<Integer> list2){
        SLLNode<Integer> node1 = list.getFirst();
        SLLNode<Integer> node2 = list2.getFirst();

        int number1 = 0;
        int number2 = 0;
        int length1 = list.length()-1;
        int length2 = list2.length()-1;


        while (node1 != null){
            number1 += (Math.pow(10,length1) * node1.element);
            length1 --;
            node1 = node1.succ;
        }
        while (node2 != null){
            number2 += (Math.pow(10,length2) * node2.element);
            length2--;
            node2 = node2.succ;
        }

        StringBuilder sb = new StringBuilder();
        //for Add Two Numbers
        String s = sb.append(number1+number2).reverse().toString();
        //for Add Two Numbers II (without reverse())
        //String s = sb.append(number1+number2).toString();
        String [] array = s.split("");
        list.deleteList();

        for (int i = 0; i < array.length;i++){
            list.insertLast(Integer.parseInt(array[i]));
        }
        return list;
    }
}

