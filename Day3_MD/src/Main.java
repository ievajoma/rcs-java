import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet simbolu virkni!");
        String simbol = sc.nextLine();

        int count = simbol.length();

        if(count > 5){
            System.out.println("Programmēt ir forši!");
        }
    }
}