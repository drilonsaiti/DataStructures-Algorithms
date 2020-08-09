package sample.StackQueue.Queue;

import java.util.Queue;
import java.util.Scanner;

public class MaximumK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
         findMax(array,k);


    }

    public static void findMax(int [] array, int k){
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(array.length);
        int max = 0;
        for (int i = 0; i <= array.length - k; i++){
            max = 0;
            for (int j = i; j < k + i; j++){
                if(max < array[j]){
                    max = array[j];
                }
            }
            arrayQueue.enqueue(max);
        }

        int length = arrayQueue.size();
        for (int i = 0; i < length; i++){
            System.out.print(arrayQueue.dequeue() + " ");
        }

    }
}
