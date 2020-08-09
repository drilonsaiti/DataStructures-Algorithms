package sample.StackQueue.Queue.Easy;

import java.util.Scanner;
import java.util.Stack;

public class QueueWStack {
    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int x = scanner.nextInt();
            s1.push(x);
            int y = scanner.nextInt();
            s2.push(y);
        }
        System.out.println(pop());
    }



    void push(int x){
        s1.push(x);
    }
    static int pop(){
        if(s2.isEmpty()){
            if(s1.isEmpty())
                return -1;
            while (!s1.isEmpty()){
                int elem = s1.pop();
                s2.push(elem);
            }
            int k = s2.pop();
            while (!s2.isEmpty()){
                int elem = s2.pop();
                s1.push(elem);
            }
            return k;
        }
        return -1;
    }

}
