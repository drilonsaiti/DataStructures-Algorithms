package sample.DynamicPrograming;

import java.util.Scanner;

public class AirplaneSeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(nthPerson(n));
    }
    public static double nthPerson(int n ){

        if( n == 1)
        {
            return 1;
        }
        if(n == 2){
            return 0.5;
        }
        double [] array = new double [n+n];
        array[0] = 1;
        array[1] = 0.5;
        double chances = 1.5;
        for (int i = 3; i <= n + 1; i++){
            array[i] = (1.0/i) * chances;
            chances += array[i];
        }
        return array[n];

    }


}
