import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2(3);
        task2(9);
    }


    public static void task2(int times) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < times; i++) {
            System.out.println("Ievadiet skaitli!");
            int number = sc.nextInt();
            sum = sum + number;

        }
        System.out.println(sum);
    }
}