package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();

        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scann.nextInt();
        }
        nextGreater(array);
    }

    public static void nextGreater(int [] array){
        java.util.Stack<Integer> inStack = new Stack<Integer>();
        int max  = 0,newMax = 0;
        int flag = 0;
        for (int i = 0; i < array.length;i++){
            for (int j = i;j < array.length;j++){
                    if (array[i] < array[j]) {
                        inStack.push(array[j]);
                        flag = 1;
                        break;
                    }else{
                        flag = 0;
                    }
            }
            if(flag == 0){
                max++;
            }
        }

        while (max != 0){
            inStack.push(-1);
            max--;
        }
        while (!inStack.isEmpty()){
            System.out.print(inStack.pop() + " ");
        }
    }
}
