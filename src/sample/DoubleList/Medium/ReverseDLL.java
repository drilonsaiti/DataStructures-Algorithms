package sample.DoubleList.Medium;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseDLL {
    public static void main(String[] args) throws IOException {
        DLL<Integer> dll = new DLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        reverse(dll);
        System.out.println(dll);
    }

    public static void reverse(DLL<Integer> list){
        DLLNode<Integer> node = list.getFirst();
        DLLNode<Integer> prev = list.getFirst();
        DLLNode<Integer> tmp = null;

        while (node != null){
            node = node.succ;
            prev.succ = tmp;
            tmp = prev;
            prev = node;

        }
       list.setFirst(tmp);
    }
    public static void printlist(DLL<Integer> node){
        System.out.print(node.getFirst() + " ");
    }
}
