package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1(7);
    }

    public static void task1(int times) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        if(times % 2 ==0){
            for(int i = 0; i < times; i++){
                System.out.println("Ievadiet skaitli!");
                int number = sc.nextInt();
                sum = sum + number;
        } else
            for (int i = 0; (i < sum) < 15; i++) {
                System.out.println("Ievadiet skaitli!");
                int number = sc.nextInt();
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}

