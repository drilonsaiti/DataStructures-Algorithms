package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareLS {
    public static void main(String[] args) throws IOException {
        SLL<Integer> lista1 = new SLL<Integer>();
        SLL<Integer> lista2 = new SLL<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
       /* int n = Integer.parseInt(s);
        s = br.readLine();*/
        String[] array = s.split(" ");
        for (int i = 0; i < 4; i++) {
            lista1.insertLast(Integer.parseInt(array[i]));
        }

        s = br.readLine();
        String[] array2 = s.split(" ");
        for (int i = 0; i < 5; i++) {
            lista2.insertLast(Integer.parseInt(array2[i]));
        }
        System.out.println(compare(lista1,lista2));
    }

    public static int compare(SLL<Integer> list1,SLL<Integer> list2){

        SLLNode<Integer> node1 = list1.getFirst();
        SLLNode<Integer> node2 = list2.getFirst();

        int flag = 3;
        while (node1 != null && node2 != null){
            while (node1 != null) {
                if (node1.element == node2.element) {
                    flag = 0;
                    node1 = node1.succ;
                } else {
                    flag = 3;
                    node1 = node1.succ;
                }
            }
            node2 = node2.succ;
            node1 = list1.getFirst();
        }
        if(flag != 0){
            if(list1.length() > list2.length()){
                flag = 1;
            }else{
                flag = -1;
            }
        }
        return flag;
    }
}
