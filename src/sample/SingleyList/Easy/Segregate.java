package sample.SingleyList.Easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Segregate {
    public static void main(String[] args) throws IOException {
        SLL<Integer> lista1 = new SLL<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = Integer.parseInt(s);

        s = br.readLine();
        String[] array = s.split(" ");

        for (int i = 0; i < n; i++) {
            lista1.insertLast(Integer.parseInt(array[i]));
        }
        System.out.println(segregate(lista1));
    }

    public static SLL<Integer> segregate(SLL<Integer> list){
        SLLNode<Integer> node = list.getFirst();
        int middle = 0;
        int length = list.length()/2;
        int fullLength = list.length();
        System.out.println("Length " + length);
        if((fullLength % 2 ) == 0){
            middle = length - 1;
        }else{
            middle = length-1;
        }
        System.out.println(middle);
        int count = 0;
        SLL<Integer> results = new SLL<Integer>();
        while (node != null){
            if(count == 0 || count < middle){
                results.insertLast(0);
                count++;
            }else if((count == middle ) && count != 0){
                results.insertLast(1);
                count++;
            }else{
                results.insertLast(2);
                count++;
            }
            node = node.succ;
        }
        return results;
    }
}
