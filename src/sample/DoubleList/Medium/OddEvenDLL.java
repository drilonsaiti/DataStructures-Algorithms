package sample.DoubleList.Medium;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenDLL {
    public static void main(String[] args) throws IOException {
        DLL<Integer> dll = new DLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll.insertLast(Integer.parseInt(pomNiza[i]));
        }
        oddEven(dll);

    }
    public static void oddEven(DLL<Integer> list){
        DLLNode<Integer> node = list.getFirst();
        DLL<Integer> paren = new DLL<Integer>();
        DLL<Integer> neparen = new DLL<>();

        while (node != null){
            if (node.element % 2 == 0){
                paren.insertLast(node.element);
            }else{
                neparen.insertLast(node.element);
            }
            node = node.succ;
        }
        DLLNode<Integer> parenNode = paren.getFirst();
        DLLNode<Integer> neparenNode = neparen.getFirst();

        while (parenNode != null){
            System.out.print(parenNode.element + " ");
            parenNode = parenNode.succ;
        }
        System.out.println();

        while (neparenNode != null){
            System.out.print(neparenNode.element + " ");
            neparenNode = neparenNode.succ;
        }

    }
}
