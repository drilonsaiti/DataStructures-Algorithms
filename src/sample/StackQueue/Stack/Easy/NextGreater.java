package sample.StackQueue.Stack.Easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int [] array2 = new int[m];
        for (int j = 0; j < m; j++) {

            array2[j] = scanner.nextInt();
        }
        System.out.println(findNextGreater(array,array2));
    }

    public static String findNextGreater(int [] num1,int [] num2){
        Stack<Integer> inStack = new Stack<Integer>();
        int count = 0;
        for (int i = 0; i < num1.length; i++){
            for (int j = 0; j < num2.length;j++){
                count++;
                if(num1[i] < num2[j]){
                    inStack.push(num2[j]);
                    count = 0;
                    num2[j] = num2[j+1];
                    break;
                }else{
                    if(count == num2.length) {
                        inStack.push(-1);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!inStack.isEmpty()){
            sb.append(inStack.pop() + " ");
        }
        return sb.toString();
    }
}
