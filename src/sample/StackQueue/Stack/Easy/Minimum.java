package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class Minimum {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n;i++){
            int s = scan.nextInt();
            stack.push(s);

        }
        String rez = min(stack);
        System.out.println(rez);
    }

    public static String min(Stack<Integer> stack){

        Stack<Integer> results = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        Stack<Integer> inStack = reverse(sb.toString());

        int min = inStack.peek();

        while (!inStack.isEmpty()){
            int num1 = inStack.pop();
            if(min > num1){
                min = num1;
            }
            results.push(min);
        }

        sb = new StringBuilder();

        while (!results.isEmpty()){
            sb.append(results.pop() + " ");
        }
        return sb.toString();
    }
    public static Stack reverse(String str){
        Stack<Integer> inStack = new Stack<Integer>();

        for (int i = 0; i < str.length();i++){
            int ch = Integer.parseInt(String.valueOf(str.charAt(i)));
            inStack.push(ch);
        }

        return inStack;
    }
}
