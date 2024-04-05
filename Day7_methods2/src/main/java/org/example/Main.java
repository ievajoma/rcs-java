package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1(7);
        int result = sample1();
        System.out.println(result);
    }

    public static int sample1(){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while(a < 1){
                System.out.println("Ievadiet pozitīvu skaitli!");
                a = sc.nextInt();
        }return a;
    }

    public static void task1(int times) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        if(times % 2 ==0){
            for(int i = 0; i < times; i++) {
                System.out.println("Ievadiet skaitli!");
                int number = sc.nextInt();
                sum = sum + number;
            }
        }else{
            while(sum < 15){
                System.out.println("Ievadiet skaitli!");
                int number = sc.nextInt();
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}

