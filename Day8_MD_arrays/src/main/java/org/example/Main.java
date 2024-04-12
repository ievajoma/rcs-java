package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cik daudz izvēles gribēsiet izdarīt? Ievadiet skaitli:");
        int a = sc.nextInt();
        while (a < 2){
            System.out.println("Ievadiet skaitli lielāku par 1!");
            a = sc.nextInt();
        }
        int[] klucis = new int[a];
        int sum = 0;
        for (int i = 0; i < klucis.length; i++){
            System.out.println("Ievadiet " + (i+1) + ". skaitli:");
            klucis[i] = sc.nextInt();
            sum = sum + klucis[i];
        }
        System.out.println("Kopējā summa ir " + sum + ".");
        System.out.println("Lielākais skaitlis ir " + Arrays.stream(klucis).max().getAsInt() + ".");
    }

    public static void task2(){
        double[] kluxic = new double[9];
        for (int i = 0; i < kluxic.length; i++)
            kluxic[i] = Math.floor(Math.random() * 99) + 1;
        System.out.println("Otrā uzdevumā lielākais skaitlis ir " + Arrays.stream(kluxic).max().getAsDouble() + ".");
    }
}