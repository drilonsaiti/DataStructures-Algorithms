package sample.StackQueue.Queue;

import sample.StackQueue.Queue.Easy.Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumRopes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            queue.add(scanner.nextInt());
        }
        System.out.println(minRopes(queue));

    }

    public static int minRopes(PriorityQueue<Integer> queue){
        PriorityQueue<Integer> priorityQueue = queue;

        int cost = 0;

        while (priorityQueue.size() != 1){
            int x = priorityQueue.poll();
            int y = priorityQueue.poll();
            cost += x + y;
            priorityQueue.add(x+y);
        }
        return cost;
    }
}
