package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        classwork2();

//        System.out.println(classwork1());
    }

    public static void classwork2(){
        int[] m = new int[10];
        int summa = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++){
            System.out.println("Ievadiet skaitli!");
            m[i] = (int) sc.nextDouble();
            summa = summa + m[i];
        }
        int videjais = summa / 10;
        System.out.println(videjais);
    }


//    public static boolean classwork1(){
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Ievadiet skaitli!");
//            int number = sc.nextInt();
//            if (number == 28) {
//                return true;
//        }
//    }return false;
//    }
}