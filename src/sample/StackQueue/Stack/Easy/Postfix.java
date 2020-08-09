package sample.StackQueue.Stack.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();
        char exp[] = expression.toCharArray();

        System.out.println(results(exp));

        br.close();
    }

    public static int results(char [] exp){
        Stack<Integer> inStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < exp.length; i++){
            if(Character.isDigit(exp[i])) {
                if (Character.isDigit(exp[i + 1])) {
                    sb.append(exp[i]);
                    continue;
                } else {
                    sb.append(exp[i]);
                    inStack.push(Integer.parseInt(sb.toString()));
                    sb = new StringBuilder();
                }
            }else if(exp[i] == '+'){
                int num1 = inStack.pop();
                int num2 = inStack.pop();
                inStack.push(num1+num2);
            }else if(exp[i] == '-'){
                int num1 = inStack.pop();
                int num2 = inStack.pop();
                inStack.push(num1-num2);
            }else if(exp[i] == '*'){
                int num1 = inStack.pop();
                int num2 = inStack.pop();
                inStack.push(num1*num2);
            }else if(exp[i] == '/'){
                int num1 = inStack.pop();
                int num2 = inStack.pop();
                inStack.push(num1/num2);
            }
        }
        return inStack.pop();
    }
}
