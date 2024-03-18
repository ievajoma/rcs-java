import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int x = sc.nextInt();
        if(x < 1){
            System.out.println("Ievadiet, lūdzu, skaitli lielāku par 1!");
            task1();
        }for(int i = 0; i < x; i++ ) {
            System.out.println("Hello world!");
        }
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for(int i = 0; i < 5; i++ ){
            System.out.println("Ievadiet skaitli!");
            int x = sc.nextInt();
            result = result + x;
        }
        System.out.println(result);
    }
}