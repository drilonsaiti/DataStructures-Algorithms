package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class Operations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n;i++){
            int s = scan.nextInt();
            stack.push(s);
        }
        int x = scan.nextInt();
        //System.out.println(remove(stack,x));
        find(stack,x);
    }

    public static String remove(Stack<Integer> stack,int x){
        Stack<Integer> inStack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            int num = stack.pop();

            if(num == x){
                System.out.println("This number its remove from the stack " + num);
            }else{
                inStack.push(num);
            }
        }
        while (!inStack.isEmpty()){
            sb.append(inStack.pop() + " ");
        }
        return sb.toString();
    }

    public static void find(Stack<Integer> st,int y){

        int flag = 0;
        while (!st.isEmpty()){
            if (st.pop() == y){
                flag = 1;
                break;
            }else{
                flag = 0;

            }
        }
        if(flag == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
