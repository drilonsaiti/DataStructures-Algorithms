package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        Stack<String> inStack = new Stack<String>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()){
            if (c == '(') {
                inStack.push(sb.toString());
                sb = new StringBuilder();
            }else if(c == ')'){
                sb = sb.reverse();
                sb.insert(0,inStack.pop());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
