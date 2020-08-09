package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        char [] niza=new char[100];

        Scanner f=new Scanner(System.in);
        String st=f.next();

        String rez= infixToPostfix(st);
        System.out.println(rez);
    }

    public static String infixToPostfix(String exp){
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < exp.length();i++){
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }else if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() != '('){
                    return "Invalid expression";
                }else{
                    stack.pop();
                }
            }else{
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())){
                    sb.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static int prec(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '^') {
            return 3;
        }else
            return -1;
    }
}
