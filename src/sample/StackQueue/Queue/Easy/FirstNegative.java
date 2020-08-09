package sample.StackQueue.Queue.Easy;

import java.util.Scanner;

public class FirstNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        firstNegative(array,k);
    }

    public static void firstNegative(int [] array,int k){
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(array.length);
        int flag = 0;

        for (int i = 0; i <= array.length - k; i++){
            flag = 0;
            for (int j = i; j < i+k;j++){
                if (array[j]<0){
                    arrayQueue.enqueue(array[j]);
                    flag = 1;
                    break;
                }
            }
            if(flag != 1){
                arrayQueue.enqueue(0);
            }
        }
        int len = arrayQueue.size();
        for (int i = 0; i < len; i++){
            System.out.print(arrayQueue.dequeue() + " ");
        }
    }
}
