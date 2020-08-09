package sample.DoubleList.Medium;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reorder {
    public static void main(String[] args) throws IOException {
        DLL<Integer> dll = new DLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        reorder(dll);
        System.out.println(dll);
    }

    public static void reorder(DLL<Integer> list){
        DLLNode<Integer> node = list.getFirst();
        DLLNode<Integer> end = list.getFirst();

        while (node.succ != null && node.succ.succ != null){
            while (end.succ.succ != null)
                end = end.succ;

                DLLNode<Integer> tmp = node.succ;
                node.succ = end.succ;
                end.succ = null;
                node = node.succ;
                node.succ = tmp;
                node = node.succ;

                end = node;

        }
    }
}
