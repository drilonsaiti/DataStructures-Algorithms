package sample.StackQueue.Queue.Easy;

import java.util.Scanner;

public class MinSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(minSum(array,n));
    }

    public static int minSum(int array[],int n){
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(n);
        int num1 = 0;
        int num2 = 0;
        int len = n;
        len /= 2;
        int count = 0;
        for (int i = 0; i < n; i++){
            if(n % 2 == 0) {
                if (i % 2 == 0) {
                    num1 = num1 * 10 + array[i];
                } else {
                    num2 = num2 * 10 + array[i];
                }
            }else{
                if(count < len){
                    num1 = num1*10+array[i];
                    count++;
                }else{
                    num2 = num2*10+array[i];
                }
            }
        }
        StringBuilder sb1 = new StringBuilder();
        sb1 = sb1.append(num1).reverse();
        StringBuilder sb2 = new StringBuilder();
        sb2 = sb2.append(num2).reverse();
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        arrayQueue.enqueue(Integer.parseInt(s1));
        arrayQueue.enqueue(Integer.parseInt(s2));

        return arrayQueue.dequeue() + arrayQueue.dequeue();
    }
}
