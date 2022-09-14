import java.util.Scanner;

public class Feladat7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérek egy hónapot");

        double szam = sc.nextDouble();

        if (szam == 1 || szam == 2 || szam == 12) {
            System.out.println("Tél");

        } else if (szam == 3 || szam == 4 || szam == 5) {
            System.out.println("Tavasz");
        } else if (szam == 6 || szam == 7 || szam == 8) {
            System.out.println("Nyár");
        } else {
            System.out.println("Tavasz");
        }
    }
}
