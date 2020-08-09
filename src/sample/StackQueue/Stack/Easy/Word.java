package sample.StackQueue.Stack.Easy;

import java.util.Scanner;
import java.util.Stack;

public class Word {
    public static void main(String[] args) {
        char [] niza=new char[100];

        Scanner f=new Scanner(System.in);
        String st=f.next();
        niza=st.toCharArray();

        int rez= proveriT(niza);
        System.out.println(rez);
    }

    public static int proveriT(char [] st){
        Stack<Character> inStack = new Stack<Character>();

        int countT = 0;
        int countS = 0;
        for (int i = 0; i < st.length;i++){
            if (st[i] == 'S' && countS%2==0){
                if(!inStack.isEmpty())
                    return 0;
                countS++;
            }else if(st[i] == 'S' && countS%2==1){
                countS++;
            }
            if(st[i] == 'T'){
                if(countS%2==1){
                    inStack.push('T');
                }else {
                    if (inStack.isEmpty())
                        return 0;
                    inStack.pop();
                }
            }
        }
        if(inStack.isEmpty()){
            return 1;
        }else
            return 0;
    }

}
