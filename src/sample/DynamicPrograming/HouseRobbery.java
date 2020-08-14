package sample.DynamicPrograming;

import java.util.Scanner;

public class HouseRobbery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int [] array = new int [n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(robbery(array));
    }

    public static int robbery(int [] nums){
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return nums[1];
        }

        int [] array = new int [nums.length + 1];
        array[0] = nums[0];
        array[1] = Math.max(nums[0],nums[1] );

        for (int i = 2; i < nums.length; i++){
            array[i] = Math.max(array[i-1],array[i-2] + nums[i] );
        }
        return array[nums.length-1];
    }
}
