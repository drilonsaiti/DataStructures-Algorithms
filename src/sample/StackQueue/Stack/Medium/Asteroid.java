package sample.StackQueue.Stack.Medium;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class Asteroid {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();

        int [] asteroids = new int[n];
        for (int i = 0; i < n; i++){
            asteroids[i] = scann.nextInt();
        }
        astreoid(asteroids);
    }
    public static void astreoid(int [] asteroids){
        Stack<Integer> stack = new Stack<Integer>();

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < asteroids.length; i++){
            if (stack.isEmpty() || asteroids[i] > 0){
                stack.push(asteroids[i]);
            }else{
                while (true){
                    int peek = stack.peek();
                    if (peek < 0){
                        stack.push(asteroids[i]);
                        break;
                    }else if(-peek == asteroids[i]){
                        stack.pop();
                        break;
                    }else if(peek > -asteroids[i]){
                        break;
                    }else{
                        stack.pop();
                        if (stack.isEmpty()){
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
