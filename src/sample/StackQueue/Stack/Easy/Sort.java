package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class Sort {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n;i++){
            int s = scan.nextInt();
            stack.push(s);

        }
      sort(stack);
    }
    public static void sort(Stack<Integer> stack){
        Stack<Integer> inStack = new Stack<Integer>();
        Stack<Integer> index = null;
        int tmp = 0;

        while (!stack.isEmpty()){
            tmp = stack.pop();
            while (!inStack.isEmpty() && tmp < inStack.peek()){
                stack.push(inStack.pop());
            }
            inStack.push(tmp);
        }
        while (!inStack.isEmpty()){
            System.out.print(inStack.pop() + " ");
        }
    }
}
