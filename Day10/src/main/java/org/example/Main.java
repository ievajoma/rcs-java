package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        List<Double> skaitli = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            System.out.println("Ievadiet skaitli:");
            skaitli.add(sc.nextDouble());
            Double videjais = getAvg(skaitli);
            System.out.println(videjais);
        }

    }
    public static double getAvg(List<Double> sk){

        Double avg = 0.0;

        return avg;
    }
}