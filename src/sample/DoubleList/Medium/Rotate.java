package sample.DoubleList.Medium;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rotate {
    public static void main(String[] args) throws IOException {
        DLL<Integer> dll = new DLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        int x = Integer.parseInt(br.readLine());
        rotate(dll, x);
        System.out.println(dll);
    }

    public static void rotate(DLL<Integer> list,int p){
        DLLNode<Integer> node = list.getFirst();
        int count = 1;
        
        while (count < p && node != null){
            node = node.succ;
            count++;
        }
        DLLNode<Integer> node2 = list.getFirst();

        count = 0;
        while (node2 != null){
            if(count < p){
                int first = node2.element;
                list.insertLast(first);
                list.delete(node2);
                count++;
            }
            node2 = node2.succ;
        }
    }
}
