package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;
public class Parenthesis {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0){
            String str = scan.next();
            Stack<Character> inStack = new Stack<Character>();
            for (int i = 0; i < str.length();i++){
                char ch = str.charAt(i);
                if(inStack.isEmpty()){
                    inStack.push(ch);
                }else if(ch == '(' || ch == '{' || ch == '['){
                    inStack.push(ch);
                }else{
                    if(ch == ')' && inStack.peek() == '('){
                        inStack.pop();
                    }else if(ch == ']' && inStack.peek() == '['){
                        inStack.pop();
                    }else if(ch == '}' && inStack.peek() == '{'){
                        inStack.pop();
                    }else {
                        inStack.push(ch);
                    }
                }
            }
            if(inStack.isEmpty())
                System.out.println("balanced");
            else
            System.out.println("not balanced");
        }


    }

}
