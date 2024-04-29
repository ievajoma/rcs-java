package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] skaitli = new int [3];
        for(int i = 0; i < skaitli.length; i++){
            System.out.println("Ievadiet skaitli:");
            skaitli[i] = sc.nextInt();
        }

        boolean a = Games.quess(skaitli);
        System.out.println(a);


        int saraksts = Tools.generators();
        System.out.println(saraksts);
    }
}