package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = "";
        for (int i = 0; i < n;i++){
             s = scan.next();
        }
        reverse(s);
    }

    public static void reverse(String str){
        Stack<Character> inStack = new Stack<Character>();

        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            inStack.push(ch);
        }

        while (!inStack.isEmpty()){
            System.out.print(inStack.pop() + " ");
        }
    }
}
