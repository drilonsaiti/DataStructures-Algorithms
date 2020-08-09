package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word;
        Stack<String> stack = new Stack<String>();
       for (int i = 0; i < n; i++){
           word = scanner.next();
           if(!stack.isEmpty() && word.contains(stack.peek())){
               stack.pop();
           }else{
               stack.push(word);
           }
       }
        System.out.println(stack.size());
    }
}
