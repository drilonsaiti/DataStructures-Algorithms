package sample.DoubleList.Medium;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insert {
    public static void main(String[] args) throws IOException {
        DLL<Integer> dll = new DLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        int x = Integer.parseInt(br.readLine());
        insert(dll, x);
        System.out.println(dll);
    }
    public static void insert(DLL<Integer> list,int x){
        DLLNode<Integer> node = list.getFirst();
        int count = 1;

        while (node != null){
             if(node.element < x && count == list.length()){
                list.insertAfter(x,node);
                break;
            }else if(node.element > x){
                list.insertBefore(x,node);
                break;
            }
             count++;
            node = node.succ;
        }
    }
}
