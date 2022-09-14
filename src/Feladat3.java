import java.util.Scanner;

public class Feladat3 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Kérek egy számot!");
        double szam = Double.parseDouble(sc.next());

        double elol = Math.floor(szam);
        double hatul = Math.ceil(szam);

        double kozelebb;
        if (szam - elol < hatul - szam) {
            kozelebb = elol;
        } else {
            kozelebb = hatul;
        }

        System.out.printf("A megadott szám a %.0f és a %.0f egész számok között van, és ezek közül a %.0f számhoz van közelebb. \n", elol, hatul, kozelebb);

        double tort= szam-elol;
        double egesz=szam-tort;
        System.out.printf("A szám egész része %.0f \n", egesz);
        System.out.printf("A szám törtrésze %.1f \n", tort);



    }
}
