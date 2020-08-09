package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class Gotham {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scann.nextInt();
        }
        saveGotham(array);
    }

    public static void saveGotham(int [] array){
        Stack<Integer> inStack = new Stack<Integer>();
        int max  = 0,newMax = 0;
        for (int i = 0; i < array.length;i++){
            for (int j = i;j < array.length;j++){
                    if (array[i] < array[j]) {
                        inStack.push(array[j]);
                        break;
                    }
                }
        }
        inStack.push(0);
        int sum = 0;
        while (!inStack.isEmpty()){
            System.out.print(inStack.peek() + " ");
            sum+=inStack.pop();
        }
        System.out.println();
        System.out.println(sum);
    }
}
