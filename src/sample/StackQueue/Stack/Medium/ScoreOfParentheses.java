package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(score(str));
    }

    public static int score(String str){
        Stack<Integer> inStack = new Stack<>();
        int count = 0;
        inStack.push(0);
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                inStack.push(0);
            }else{
                int a = inStack.pop();
                int b = inStack.pop();
                System.out.println(Math.max(2*a,1));
                inStack.push(b+Math.max(2*a,1));
            }
        }
        return inStack.pop();
    }
}
