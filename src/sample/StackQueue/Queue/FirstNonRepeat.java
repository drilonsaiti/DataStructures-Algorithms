package sample.StackQueue.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FirstNonRepeat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        nonRepeating(S);
    }

    public static void nonRepeating(String str){
        String [] array;
        ArrayQueue<Character> arrayQueue = new ArrayQueue<>(20);
        boolean [] repeated = new boolean[256];
        StringBuilder sb = new StringBuilder();
        arrayQueue.enqueue(' ');
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            char queue = arrayQueue.peek();
                if (ch == queue) {
                    System.out.println("IN");
                    String s = "-1";
                    char c = s.charAt(0);
                    char d = s.charAt(1);
                    arrayQueue.enqueue(c);
                } else {
                    arrayQueue.enqueue(ch);
                }
                System.out.println(arrayQueue.peek() + " ch "+ ch);
        }
        int length = arrayQueue.size();
        for (int i = 0; i < length; i++) {
            System.out.print(arrayQueue.dequeue());
        }
    }
}
