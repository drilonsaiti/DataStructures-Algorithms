package sample.StackQueue.Stack.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Convert {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        decToBinary(n);
    }
    public static void decToBinary(int n){
        Stack<Integer> stack = new Stack<Integer>();

        while (n != 0){
            stack.push(n % 2);
            System.out.println("Modul " + n%2);
            n/=2;
            System.out.println("N/2 "  + n);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        //System.out.println();
    }
}
