package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class Stock {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();

        int [] price = new int[n];
        for (int i = 0; i < n; i++){
            price[i] = scann.nextInt();
        }
        stockSpan(price);
    }

    public static void stockSpan(int price []){
        Stack<Integer> inStack = new Stack<Integer>();
        int [] s = new int[price.length];
        s[0] = 1;
        inStack.push(0);
        for (int i = 0; i < price.length;i++){
            while (!inStack.isEmpty() && price[inStack.peek()] <= price[i]){
                inStack.pop();
            }
            if(inStack.isEmpty()){
                s[i] = i + 1;
            }else {
                s[i] = i - inStack.peek();
            }
            inStack.push(i);
        }
        for (int i = 0; i < s.length;i++){
            System.out.printf("%d ",s[i]);
        }
        System.out.println();
    }
}
