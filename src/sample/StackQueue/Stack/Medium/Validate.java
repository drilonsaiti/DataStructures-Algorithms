package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class Validate {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scann.nextInt();
        }
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            array2[i] = scann.nextInt();
        }
        System.out.println(makeValide(array,array2));
    }

    public static boolean makeValide(int [] pushed,int [] poped){
        Stack<Integer> inStack = new Stack<Integer>();
        int j = 0;

        for (int x : pushed){
            inStack.push(x);
            while (!inStack.isEmpty() && j < pushed.length && inStack.peek() == poped[j]){
                inStack.pop();
                j++;
            }
        }
        return j == pushed.length;
    }
}
