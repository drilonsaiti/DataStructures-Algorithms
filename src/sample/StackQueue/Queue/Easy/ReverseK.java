package sample.StackQueue.Queue.Easy;

import java.util.Queue;
import java.util.Scanner;

public class ReverseK {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        ArrayQueue<Integer> queue = new ArrayQueue<Integer>(n);
        for (int i = 0; i < n; i++){
            int k = scanner.nextInt();
            queue.enqueue(k);
        }
        int k = scanner.nextInt();
        reverseK(queue,k);

    }
    public static void reverseK(ArrayQueue<Integer> queue,int k){
        StringBuilder sbReverse = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        ArrayQueue<Integer> arrayQueue = queue;
        int len = arrayQueue.size();
        for (int i = 0; i < len; i++){
            if(i<k){
                sbReverse.append(arrayQueue.dequeue());
            }else{
                sb.append(arrayQueue.dequeue());
            }
        }
        String str = sbReverse.reverse().toString();
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            arrayQueue.enqueue(Integer.parseInt(String.valueOf(ch)));
        }
        String str2 = sb.toString();
        for (int i = 0; i < str2.length();i++){
            char ch = str2.charAt(i);
            arrayQueue.enqueue(Integer.parseInt(String.valueOf(ch)));
        }
        int length = arrayQueue.size();
        for (int i = 0; i < length; i++){
            System.out.print(arrayQueue.dequeue() + " ");
        }
    }
}
