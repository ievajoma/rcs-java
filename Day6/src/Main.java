import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample1("jgfkla", "kj", "lkjagf");
        task2(-5);
        task3(4);
    }

    public static void sample1(String a, String b, String c){
        String visi = a + b + c;
        System.out.println(visi);
    }

    public static void task2(int a){
        Scanner sc = new Scanner(System.in);
        if(a < 1){
            return;
        }
        int result = 0;
        for(int i = 0; i < a; i++ ){
            System.out.println("Ievadiet skaitli!");
            int x = sc.nextInt();
            result = result + x;
        }
        System.out.println(result);
    }

    public static void task3(int a){
        Scanner sc = new Scanner(System.in);

        int result = 0;
        for(int i = 0; i < a; i++ ){
            System.out.println("Ievadiet skaitli!");
            int x = sc.nextInt();
            if(x % 2 == 0) {
                result = result + x;
            }
        }
        System.out.println(result);
    }
}
