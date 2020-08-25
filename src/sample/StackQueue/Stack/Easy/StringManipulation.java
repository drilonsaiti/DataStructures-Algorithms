package sample.StackQueue.Stack.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class StringManipulation {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String [] str = br.readLine().split(" ");
            System.out.println(manipulation(str));
        }
        public static int manipulation(String [] str){
            Stack<String> inStack = new Stack<String>();

            for (int i = 0; i < str.length; i++){
                if (!inStack.isEmpty() && inStack.peek().equals(str[i])){
                    inStack.pop();
                }else{
                    inStack.push(str[i]);
                }
            }
            return inStack.size();
        }
}
