package sample.DoubleList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        DLL<Integer> dll = new DLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String [] array1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll.insertLast(Integer.parseInt(array1[i]));
        }
        function(dll);
    }
    public static void function(DLL<Integer> list){
        DLLNode<Integer> first = list.getFirst();
        DLLNode<Integer> last = list.getLast();

        if (first == last){
            return;
        }
        while (first != last && first.pred != last){
            if (first.element >= last.element){
                list.insertBefore(first.element + last.element,first);

            }else if(first.element < last.element){
                list.insertBefore(first.element + last.element,first);
                list.insertBefore(last.element, first);
                list.delete(first);
            }
            first = first.succ;
            last = last.pred;
        }
        System.out.println(list);
    }
}
