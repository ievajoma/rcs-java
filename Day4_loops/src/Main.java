import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli!");
        String simbol = sc.nextLine();
        int skaitlis = Integer.parseInt(simbol);

        if(skaitlis >= 10 || skaitlis <= 5){
            System.out.println("$$");
        }else if(skaitlis >= 6 && skaitlis <= 9){
            System.out.println("$");
        }

    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet simbolu virkni!");
        String simbol = sc.nextLine();

        int count = simbol.length();

        if(simbol.equals("programmesana")){
            System.out.println("Uzvarēji!");
        }else if(count == 13){
            System.out.println("vienāds simbolu skaits");
        }else{
            System.out.println("zaudēji:(");
        }

    }
}