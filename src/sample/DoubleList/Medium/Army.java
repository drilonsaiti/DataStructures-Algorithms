package sample.DoubleList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Army {
    public static void main(String[] args) throws IOException {
        DLL<Integer> dll = new DLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        army(dll);
        System.out.println(dll);
    }

    public static void army(DLL<Integer> list){
        DLLNode<Integer> node = list.getFirst();
        list.deleteList();
        int a = 1;
        int b = 5;
        int c = 6;
        int d = 10;
        while (node != null){
            if(node.element >= a && node.element <= b){
                list.insertLast(node.element);
            }
            if(node.element >= c && node.element <= d){
                list.insertFirst(node.element);
            }
            node = node.succ;
        }
    }
}
