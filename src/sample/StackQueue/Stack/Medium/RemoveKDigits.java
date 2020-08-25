package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;
public class RemoveKDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int k = s.nextInt();

        System.out.println(removeK(str,k));
    }

    public static String removeK(String str,int k){
        Stack<Character> inStack = new Stack<>();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            while (k > 0 && !inStack.isEmpty() && Character.getNumericValue(ch) < Character.getNumericValue(inStack.peek())){
                inStack.pop();
                k--;
            }
            if (!inStack.isEmpty() || ch != '0'){
                inStack.push(ch);
            }
        }

        String res = "";
        while (!inStack.isEmpty()){
            res = inStack.pop() + res;
        }

        if (res.isEmpty())
            return "0";
        res = res.substring(0,res.length() - k);
        if (res.isEmpty())
            return "0";
        return res;

    }
}
