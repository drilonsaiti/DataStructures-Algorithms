package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(removeOuterParentheses(str));
    }

    public static String removeOuterParentheses(String str){
        Stack<Character> inStak = new Stack<Character>();

        String s = "";
        int start = 0;
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                inStak.push(ch);
            }else if(ch == ')'){
                inStak.pop();
            }

            if(inStak.isEmpty()){
                s += str.substring(start+1,i);
                start = i + 1;
            }
        }
        return s;
    }
}
