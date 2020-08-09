package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(validSubstring(str));
    }

    public static int validSubstring(String str){
        Stack<Integer> inStack = new Stack<Integer>();

        inStack.push(-1);
        int max = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                inStack.push(i);
            }else{
                inStack.pop();
                if(!inStack.isEmpty()){
                   max = Math.max(max,i-inStack.peek());
                }else{
                    inStack.push(i);
                }
            }
        }


        return max;
    }
}
