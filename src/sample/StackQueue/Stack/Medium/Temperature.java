package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class Temperature {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scann.nextInt();
        }
        temperature(array);
    }

    public static void temperature(int [] T){
        int [] result = new int[T.length];
        Stack<Integer> inStack = new Stack<Integer>();
        for (int i = T.length-1; i >= 0; --i){
            while (!inStack.isEmpty() && T[i] > T[inStack.peek()]) {
                inStack.pop();
            }
            if (inStack.isEmpty()) {
                result[i] = 0;
            }else {
                result[i] = inStack.peek() - i;
            }
            inStack.push(i);
        }

        for (int i = 0; i < result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
