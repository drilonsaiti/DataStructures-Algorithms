package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountPairs {
    public static void main(String[] args) throws IOException {
        SLL<Integer> lista1 = new SLL<Integer>();
        SLL<Integer> lista2 = new SLL<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //int n = Integer.parseInt(s);
        String[] array = s.split(" ");
        for (int i = 0; i < 6; i++) {
            lista1.insertLast(Integer.parseInt(array[i]));
        }

        s = br.readLine();
        String[] array2 = s.split(" ");
        for (int i = 0; i < 3; i++) {
            lista2.insertLast(Integer.parseInt(array2[i]));
        }
        s = br.readLine();
        int k = Integer.parseInt(s);
        System.out.println(countPairs(lista1,lista2,k));
    }

    public static int countPairs(SLL<Integer> list1,SLL<Integer> list2,int k){

        SLLNode<Integer> node1 = list1.getFirst();
        SLLNode<Integer> node2 = list2.getFirst();

        int count = 0;
        int sum;
       while (node1 != null && node2 != null){
            while (node1 !=null){

                if((node1.element+node2.element) == k){

                    count++;
                    node1 = node1.succ;
                }else{
                    node1 = node1.succ;
                }
            }
            node2 = node2.succ;
            node1 = list1.getFirst();
        }
        return count;
    }
}
