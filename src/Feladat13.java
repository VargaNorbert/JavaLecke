import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        System.out.println("Gondoltam egy számra");
        Scanner sc = new Scanner(System.in);

        double gondolt = Math.random() * 100 + 1;
        int gondolt2 = (int) gondolt;
        int szam = sc.nextInt();

        while (gondolt2 != szam) {

            if (szam < gondolt2) {
                System.out.println("Nagyobb");
            } else if (szam > gondolt2) {
                System.out.println("Kisebb");
            }

            szam = sc.nextInt();

        }

        System.out.println("Gratulálok eltaláltad!");


    }
}
