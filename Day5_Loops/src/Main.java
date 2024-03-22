import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet pozitīvu skaitli!");
        int x = sc.nextInt();
        if (x < 1) {
            System.out.println("Kļūda! Ievadiet skaitli lielāku par 1!");
            task1();
        }
        int result = 1;
        for(int i = 1; i <= x; i++ ){
            result = result * i;
        }
        System.out.println("Faktoriālis ir " + result);
    }
}