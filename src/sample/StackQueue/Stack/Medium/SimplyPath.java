package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class SimplyPath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(simplyPath(str));
    }

    public static String simplyPath(String str){
        String [] array = str.split("/");
        Stack<String> stack = new Stack<String>();

        for (String s : array){
            if (s.length() == 0 || s.equals(".")) {
                continue;
            }else if(s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }else{
                stack.push(s);
            }
        }

        String res = "";
        while (!stack.isEmpty()){
            res = "/" + stack.pop() + res;
        }

        if (res.length() == 0){
            return "/";
        }else{
            return res;
        }
    }
}
