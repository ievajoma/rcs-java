package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ievadi savu vārdu");
//        String name = sc.nextLine();
//
//        System.out.println("Ievadi savu dzimšanas gadu");
//        int year = sc.nextInt();
//        int age = 2024 - year;
//
//
//        System.out.println("Lietotāju sauc " + name + " un lietotājam ir " + age + " gadi");

        Scanner sc = new Scanner(System.in);

//        System.out.println("Ievadi skaitli");
//        int cipars1 = sc.nextInt();
//
//        System.out.println("Ievadi skaitli");
//        int cipars2 = sc.nextInt();
//        int summa = cipars1 + cipars2;
//        int starp = cipars1 - cipars2;
//
//        System.out.println("Summa ir " + summa + " un starpība ir " + starp);
//
//        if(starp > 0){
//            System.out.println("+");
//        }else if(starp < 0){
//            System.out.println("-");
//        }

        System.out.println("Ievadiet simbolus!");
        String simbol = sc.nextLine();
        int summa = simbol.length();
        if(summa > 5) {
            System.out.println("Programmēt ir forši!");
        }
    }

//    public static void sample2(){
//
//        Scanner sc = new Scanner(System.in);
//

//    }
}