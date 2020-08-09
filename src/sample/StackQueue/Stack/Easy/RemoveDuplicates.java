package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str){
        Stack<String> inStack = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        String [] array = str.split("");
        for (int i = 0; i < array.length; i++){
            if (!inStack.isEmpty() && array[i].contains(inStack.peek())){
                inStack.pop();
            }else{
                inStack.push(array[i]);
            }
        }
        while (!inStack.isEmpty()){
           sb.append(inStack.pop());
        }
        return reverse(sb.toString());
    }
    public static String reverse(String str){
        Stack<Character> inStack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            inStack.push(ch);
        }

        while (!inStack.isEmpty()){
           sb.append(inStack.pop());
        }
        return sb.toString();
    }
}
