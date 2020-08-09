package sample.DoubleList.Medium;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort {

    public static void main(String[] args) throws IOException {
        DLL<Integer> dll = new DLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        sort(dll);
        System.out.println(dll);
    }

    public static void sort(DLL<Integer> list){
        DLLNode<Integer> node = list.getFirst();
        DLLNode<Integer> index = null;
        int tmp;

        while (node != null){
            index = node.succ;
            while (index != null){
                if(node.element > index.element){
                    tmp = node.element;
                    node.element = index.element;
                    index.element = tmp;
                }
                index = index.succ;
            }
            node = node.succ;
        }
    }
}
