package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareChar {
    public static void main(String[] args) throws IOException {
        SLL<Character> lista1 = new SLL<Character>();
        SLL<Character> lista2 = new SLL<Character>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        s = br.readLine();
        String array = String.valueOf(s.split(" "));
        for (int i = 0; i < n; i++) {
            lista1.insertLast(array.charAt(i));
        }
        s = br.readLine();
        int k = Integer.parseInt(s);
        s = br.readLine();
        String array2 = String.valueOf(s.split(" "));
        for (int i = 0; i < k; i++) {
            lista2.insertLast(array2.charAt(i));
        }
        compare(lista1,lista2);
    }
    public static void compare(SLL<Character> list,SLL<Character> list2){
            SLLNode<Character> node1 = list.getFirst();
            SLLNode<Character> node2 = list2.getFirst();

            int flag = 2;

            while(node1 != null && node2 != null){
                while (node1 != null){
                    if(node1.element.equals(node2.element)){
                        flag = 0;
                        node1 = node1.succ;
                    }else{
                        flag = 2;
                        node1 = node1.succ;
                    }
                }
                node2 = node2.succ;
                node1 = list.getFirst();
            }

            if(flag != 0){
                if(list.length() > list2.length()){
                    flag = 1;
                }else {
                    flag = -1;
                }
            }
        System.out.println(flag);
    }
}
