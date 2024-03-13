import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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