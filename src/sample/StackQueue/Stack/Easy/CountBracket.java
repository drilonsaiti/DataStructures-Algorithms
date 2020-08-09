package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class CountBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        countBracket(s);
    }

    public static void countBracket(String str){
        Stack<Integer> results = new Stack<Integer>();

        int count = 0;

        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                count++;
                results.push(count);
                System.out.print(results.peek() + " ");
            }else if(ch == ')'){
                System.out.print(results.peek() + " ");
                results.pop();
            }
        }
        System.out.println(" ");
    }
}
