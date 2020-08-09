package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        char [] niza=new char[100];

        Scanner f=new Scanner(System.in);
        String st=f.next();

        String rez= infixtopostfix(st);
        System.out.println(rez);
    }

    public static String infixtopostfix(String exp){
        Stack<Character> inStack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < exp.length();i++){
            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }else if(ch == '('){
                inStack.push(ch);
            }else if(ch == ')'){
                while (!inStack.isEmpty() && inStack.peek() != '('){
                    sb.append(inStack.pop());
                }
                if(!inStack.isEmpty() && inStack.peek() != '('){
                    System.out.println("Invalid expr");
                }else{
                    inStack.pop();
                }
            }else{
                while (!inStack.isEmpty() && prec(ch) <= prec(inStack.peek())){
                    sb.append(inStack.pop());
                }
                inStack.push(ch);
            }
        }
        return sb.toString();
    }

    public static int prec(char c){

        if(c == '+' || c == '-'){
            return  1;
        }else if(c == '*' || c == '/'){
            return 2;
        }else if(c == '^'){
            return 3;
        }else{
            return -1;
        }
    }
}
