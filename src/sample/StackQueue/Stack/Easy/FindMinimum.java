package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class FindMinimum {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n;i++){
            int s = scan.nextInt();
            stack.push(s);

        }
        System.out.println(findMin(stack));
    }

    public static int findMin(Stack<Integer> stack){
        Stack<Integer> inStack = stack;
        int min = inStack.peek();
        while (!inStack.isEmpty()){
            int num = inStack.pop();
            if(min > num){
                min = num;
            }
        }
        return min;
    }
}
