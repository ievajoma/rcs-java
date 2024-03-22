import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
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

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli");
        int skaitlis = sc.nextInt();
        System.out.println("Ievadiet skaitli - kāpinātāju");
        int kapinatajs = sc.nextInt();
        int result = skaitlis;
        for(int i = 1; i < kapinatajs; i++){
            result = result * skaitlis;
        }
        System.out.println("Kāpinājums skaitlim " + skaitlis + " ir " + result);
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int result = 0;

        while(!input.equals("jā")){
            System.out.println("Ievadiet skaitli");
            int skaitlis = sc.nextInt();
            result = result + skaitlis;
            System.out.println("Vai beigt darbu?");
            input = sc.nextLine();
        }
        System.out.println(result);

    }
}