package sample.StackQueue.Stack.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []pomNiza = br.readLine().split(" ");

        System.out.println(calPoints(pomNiza));
    }

    public static int calPoints(String [] ops){
        Stack<Integer> inStack = new Stack<Integer>();
        int sum = 0;


        /*for (int i = 0; i < ops.length;i++){

            if(ops[i].compareTo("C") == 0){
                sum -= inStack.pop();
            }else if( ops[i].compareTo("D") == 0){
                int sumofDouble = inStack.peek() * 2;
                inStack.push(sumofDouble);
                sum += sumofDouble;
            }else if( ops[i].compareTo("+") == 0){
                int top = inStack.pop();
                int newTop = top + inStack.peek();
                inStack.push(top);
                inStack.push(newTop);
                sum+=newTop;
            }else{
                int num = Integer.parseInt(ops[i]);
                inStack.push(num);
                sum += num;
            }
        }*/

        for (String op : ops) {
            if (op.equals("+")) {
                int top = inStack.pop();
                int newTop = top + inStack.peek();
                inStack.push(top);
                inStack.push(newTop);
            } else if (op.equals("C")) {
                inStack.pop();
            } else if (op.equals("D")) {
                inStack.push(2 * inStack.peek());
            } else {
                inStack.push(Integer.valueOf(op));
            }
        }

            for (int score : inStack){
                sum += score;
            }
            return sum;

    }
}
