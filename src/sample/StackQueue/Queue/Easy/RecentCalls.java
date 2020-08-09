package sample.StackQueue.Queue.Easy;

import java.util.Scanner;
import java.util.Queue;

public class RecentCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int size = 0;
        while (n-- > 0){
            int t = scanner.nextInt();
            size += ping(t);
        }
        System.out.println(size);
    }

    public static int ping(int t){
        LinkedQueue<Integer> aq = new LinkedQueue<>();

        aq.enqueue(t);
        while (aq.peek() < t - 3000){
            aq.dequeue();
        }
        return aq.size();
    }
}
