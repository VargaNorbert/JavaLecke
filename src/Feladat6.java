import java.util.Scanner;

public class Feladat6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a dolgozat eredményét!");
        int szam = sc.nextInt();

        if (szam <= 42) {
            System.out.println("Elégtelen");
        }
        else if (szam<=57){
            System.out.println("Elégséges");
        }
        else if (szam<=72){
            System.out.println("Közepes");
        }
        else if (szam<=87){
            System.out.println("Jó");
        }
        else if (szam<=100){
            System.out.println("Jeles");
        }

    }
}
