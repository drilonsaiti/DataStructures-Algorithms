package sample.StackQueue.Stack.Easy;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Reversals {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(countReversals(str));

    }

    public static int countReversals(String expr){
        int len = expr.length();

        if (len % 2 == 1)
            return -1;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < len; i++){
            char ch = expr.charAt(i);
            if (ch == '}' && !stack.isEmpty()){
                if(stack.peek() == '{'){
                    stack.pop();

                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        int newLength = stack.size();

        int count = 0;

        while (!stack.isEmpty() && stack.peek() == '{'){
            stack.pop();
            count++;
        }

        return (newLength/2) + (count%2);
    }
}
