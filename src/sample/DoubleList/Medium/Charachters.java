package sample.DoubleList.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Charachters {
    public static void main(String[] args) throws IOException {
        DLL<Character> list = new DLL<>();
        Scanner in = new Scanner(System.in);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s = stdin.readLine();

        for (int i = 0; i < s.length(); i++) {
            list.insertLast(s.charAt(i));
        }
        in.close();
        removeDuplicates(list);
    }
    public static boolean samoglaski(Character a) {
        if(a.equals('a')|| a.equals('e')|| a.equals('u')|| a.equals('i')|| a.equals('o')){
            return true;
        }else{
            return false;
        }

    }
    public static void removeDuplicates(DLL<Character> list){
        DLLNode<Character> first = list.getFirst();
        DLLNode<Character> second = first.succ;

        while (first != null && second != null){
            if(first.element == second.element){
                list.delete(first);
            }
            first = first.succ;
            second = second.succ;
        }
        first = list.getFirst();
        second = first.succ;

        while (first != null && second != null){
            if (samoglaski(first.element) == true && samoglaski(second.element) == true){
                list.delete(second);
                second = second.succ;
            }
            first = first.succ;
            second = second.succ;
        }
        System.out.println(list);
    }
}
