package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class DeleteMidd {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n;i++){
            int s = scan.nextInt();
            stack.push(s);

        }
        deleteMiddle(stack);
    }

    public static void deleteMiddle(Stack<Integer> stack){
        Stack<Integer> inStack = stack;
        Stack<Integer> results = new Stack<>();
        int length = stack.size();
        int middle = length/2;
        int count = 0;
        while (!inStack.isEmpty()){
            if(count == middle){
                inStack.pop();
            }else{
                results.push(inStack.pop());
            }
            count++;
        }

        while (!results.isEmpty()){
            System.out.println(results.pop() + " ");
        }
    }
}
