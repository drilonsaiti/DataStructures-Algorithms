package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class MakeParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(makeValid(str));
    }

    public static int makeValid(String str){
        //with STACK
        Stack<Character> inStack = new Stack<Character>();
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                inStack.push(ch);
            }else{
                if(ch == ')' && !inStack.isEmpty() && inStack.peek() == '('){
                    inStack.pop();
                }else{
                    inStack.push(ch);
                }
            }
        }

        return inStack.size();

        //Without STACK

      /*  int balanced = 0;
        int count = 0;
        for (int i = 0; i < str.length();i++){
            if(str.charAt(i) == '('){
                balanced += 1;
            }else {
                balanced += -1;
            }
            if(balanced == -1){
                balanced++;
                count++;
            }
        }

        return balanced+count;*/
    }
}
