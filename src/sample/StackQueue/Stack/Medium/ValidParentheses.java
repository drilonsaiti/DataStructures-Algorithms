package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(makeValid(str));
    }

    public static String makeValid(String str){
        Stack<Character> inStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length();i++){

            char ch = str.charAt(i);
            if(!(ch == '(' || ch == ')')){
                sb.append(ch);
            }else if (ch == '('){
                sb.append(ch);
                inStack.push(ch);
            }else if(ch == ')' && !inStack.isEmpty()){
                sb.append(ch);
                inStack.pop();
            }
        }
        int index = sb.length() - 1;
        while (index >= 0 && !inStack.isEmpty()){
            if(sb.charAt(index) == '('){
                sb.delete(index,index+1);
                inStack.pop();
            }
            index--;
        }
        return new String(sb);
    }
}
