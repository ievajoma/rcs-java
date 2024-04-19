package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        homework1();
    }

    public static void homework1(){
        int[] numbers = new int[10];
        Random r = new Random();
        int[] sum = new int[9];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = r.nextInt(10)+1;
            System.out.print(numbers[i] + "  ");
        }

        for(int i = 0; i < sum.length; i++){
            sum[i] = numbers[i] + numbers[i+1];
            if (max < sum[i]){
                max = sum[i];
            }
        }
        System.out.println();
        System.out.println(max);
    }
}