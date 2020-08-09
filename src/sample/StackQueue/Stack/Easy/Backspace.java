package sample.StackQueue.Stack.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backspace {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();
        backspaceCompare(S,T);
    }

    public static void backspaceCompare(String S,String T){
        Stack<Character> inStack = new Stack<Character>();


        for (int i = 0; i < S.length();i++){
            char c = S.charAt(i);

            if(c != '#'){
                inStack.push(c);
            }else{
                inStack.pop();
            }
        }

        Stack<Character> inStack2 = new Stack<Character>();

        for (int i = 0; i < T.length();i++){
            char ch = T.charAt(i);
            //System.out.println(ch);
            if(ch != '#'){
                inStack2.push(ch);
            }else{
                inStack2.pop();
            }
        }
        String s = "";
        while (!inStack.isEmpty()){
            s+=inStack.pop();
        }
        String t = "";
        while (!inStack2.isEmpty()){
            t+=inStack2.pop();
        }

        int flag = s.compareTo(t);

        if (flag == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
