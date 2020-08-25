package sample.StackQueue.Stack.Medium;

import  java.util.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Evaluiton {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] str = br.readLine().split(" ");

        System.out.println(evalution(str));
    }

    public static int evalution(String [] str){
        Stack<Integer> stack = new Stack<>();
        for (String op : str){
            if (isNumeric(op)){
                stack.push(Integer.parseInt(op));
            }else{
                int num1 = stack.pop();
                int num2 = stack.pop();

                if (op.equals("+")){
                    stack.push(num2+num1);
                }else if (op.equals("-")){
                    stack.push(num2-num1);
                }else if (op.equals("*")){
                    stack.push(num2*num1);
                }else if (op.equals("/")){
                    stack.push(num2/num1);
                }
            }
        }
        return stack.pop();
    }
    public static boolean isNumeric(String str)
    {
        return str.matches("^(?:(?:\\-{1})?\\d+(?:\\.{1}\\d+)?)$");
    }
}
