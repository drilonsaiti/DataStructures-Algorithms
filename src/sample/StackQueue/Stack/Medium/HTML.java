package sample.StackQueue.Stack.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class HTML {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pomNiza = br.readLine();
        makeText(pomNiza);
    }

    public static void makeText(String str){
        Stack<String> inStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] ch = str.split(" ");
        for (int i = 0; i < ch.length; i++){
            inStack.push(ch[i]);
            if(ch[i].equals("\"&amp;") || ch[i].equals("&amp;\"") || ch[i].equals("&amp;")){
                inStack.pop();
                inStack.push("&");
            }else if(ch[i].equals("\"&quot;") || ch[i].equals("&quot;\"") || ch[i].equals("&quot;")){
                inStack.pop();
                inStack.push("\\\"");
            }else if(ch[i].equals("\"&apos;") || ch[i].equals("&apos;\"") || ch[i].equals("&apos;")){
                inStack.pop();
                inStack.push("'");
            }else if(ch[i].equals("\"&gt;") || ch[i].equals("&gt;\"")|| ch[i].equals("&gt;")){
                inStack.pop();
                inStack.push(">");
            }else if(ch[i].equals("\"&al;") || ch[i].equals("&al;\"") || ch[i].equals("&al;")){
                inStack.pop();
                inStack.push("<");
            }else if(ch[i].equals("\"&frasl;") || ch[i].equals("&frasl;\"") || ch[i].equals("&frasl;")){
                inStack.pop();
                inStack.push("/");
            }
        }
        String [] array = new String[inStack.size()];
        int i = 0;
        while (!inStack.isEmpty()){
            array[i] = inStack.pop() + " ";
            i++;
        }

        for (int j = array.length - 1; j >= 0; --j){
            System.out.print(array[j]);
        }

    }
}
