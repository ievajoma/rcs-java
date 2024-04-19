package org.example;

public class Main {
    public static void main(String[] args) {
        int[] masivs = {5, 6, 1 ,5 ,0};
//        task1(masivs);
        task2(masivs);
    }

    public static void task1(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void task2(int[] a){
        for (int i = 0; i < a.length; i++){
            int cip = 5;
            if (a[i] == cip){
                System.out.println(i + 1);
            }
        }
    }
}