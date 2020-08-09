package sample.StackQueue.Queue.Easy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Comp implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2) return 1;
        else if(i1>i2) return -1;
        return 0;
    }
}
public class Diamonds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int k = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(diamonds(arr,k));
        }
    }

    public static int diamonds(int [] array,int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comp());
        for (int i = 0; i < array.length; i++){
            priorityQueue.add(array[i]);
        }

        int result = 0;
        while (k-- > 0){
            int element = priorityQueue.poll();
            result = result+element;
            priorityQueue.add(element/2);
        }
        return result;
    }
}
