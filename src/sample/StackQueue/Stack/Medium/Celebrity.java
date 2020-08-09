package sample.StackQueue.Stack.Medium;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();

        int [][] array = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                array[i][j] = scann.nextInt();
            }
        }
        System.out.println(celebrity(array,n));
    }

    public static int celebrity(int M[][],int n){
        Stack<Integer> inStack = new Stack<Integer>();

        for (int i = 0; i < n; i++){
            inStack.push(i);
        }
        while (inStack.size() > 1){
            int a =  inStack.pop();
            int b = inStack.pop();

            if(M[a][b] == 1 && M[b][a] == 0){
                inStack.push(b);
            }else if(M[b][a] == 1 && M[a][b] == 0){
                inStack.push(a);
            }
        }

        int index = 0;
        if(!inStack.isEmpty()){
            index = inStack.peek();
        }else{
            return -1;
        }

        for (int i = 0; i < n; i++){
            if(i!=index && M[i][index] != 1 || M[index][i] != 0){
                return -1;
            }
        }
        return index;
    }
}
