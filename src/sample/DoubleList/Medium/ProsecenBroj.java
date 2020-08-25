package sample.DoubleList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProsecenBroj {
    public static void main(String[] args) throws IOException {
        DLL<Integer> dll = new DLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String [] array1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll.insertLast(Integer.parseInt(array1[i]));
        }
        DLL<Integer> dll2 = new DLL<>();
        n = Integer.parseInt(br.readLine());
        String [] array2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dll2.insertLast(Integer.parseInt(array2[i]));
        }

        function(dll,dll2);
        //System.out.println(dll);
    }

    public static void function(DLL<Integer> list1,DLL<Integer> lista2){
        DLLNode<Integer> start = list1.getFirst();
        DLLNode<Integer> end = lista2.getLast();

        float sumOfStart = 0;
        float sumOfEnd = 0;
        while (start != null){
            sumOfStart += start.element;
            start = start.succ;
        }
        while (end != null){
            sumOfEnd += end.element;
            end = end.pred;
        }

        float averageOfStart = sumOfStart / list1.length();
        float averageOfEnd = sumOfEnd / lista2.length();
        float sum = averageOfEnd + averageOfStart;

        start = list1.getFirst();
        end = lista2.getLast();

        DLL<Integer> results = new DLL<>();
        float newSumOfStart = 0;
        while (start != null){
            newSumOfStart += start.element;
            if (newSumOfStart < sum){
                results.insertLast(start.element);
            }
            start = start.succ;
        }
        float newSumOfEnd = 0;
        while (end != null){
            newSumOfEnd += end.element;
            if (newSumOfEnd < sum ){
                results.insertLast(end.element);
            }
            end = end.pred;
        }

        System.out.println(results);
    }
}
