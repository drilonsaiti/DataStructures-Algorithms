package sample.StackQueue.Queue;

import java.util.Scanner;

public class CardRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        for (int i = 1; i <= n; i++){
            linkedQueue.enqueue(i);
        }
        int [] array = new int[n+1];
        for (int i = 1; i <= n; i++){
            int j = 1;
            while (j++ <= i){
                int tmp = linkedQueue.dequeue();
                linkedQueue.enqueue(tmp);
            }
            array[linkedQueue.peek()] = i;
            linkedQueue.dequeue();
        }
        for (int i =1 ; i <= n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
