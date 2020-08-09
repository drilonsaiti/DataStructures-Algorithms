package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class SmallestLeft {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();

        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scann.nextInt();
        }
        System.out.println(smallestLeft(array));
    }

    public static String smallestLeft(int [] array){

        StringBuilder sb = new StringBuilder();

        Stack<Integer> inStack = new Stack<Integer>();
        if(array.length == 1){
            sb.append(-1);
        }else {

            for (int i = 0; i < array.length; i++) {
                while (!inStack.isEmpty()){
                    if (inStack.peek() < array[i]){
                        sb.append(inStack.peek() + " ");
                        inStack.push(array[i]);
                        break;
                    }else{
                        inStack.pop();
                    }
                }
                if (inStack.isEmpty()){
                    sb.append(-1 + " ");
                    inStack.push(array[i]);
                }
            }
        }
        return sb.toString();
    }
}
