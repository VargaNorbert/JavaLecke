import java.util.Scanner;

public class Feladat14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérek egy szót:");

        String szo = sc.nextLine();
        String csinal = "";
        /*do {
            System.out.print("Mit szeretnél csinálni?");
            csinal = sc.nextLine();
            if (csinal == "a") {
                szo = szo.toUpperCase(Locale.ROOT);
                System.out.println(szo);
            } else if (csinal == "b") {
                szo = szo.toLowerCase(Locale.ROOT);
                System.out.println(szo);
            } else if (csinal == "c") {
                System.out.println(szo.length());
            } else if () {
            }
        } while (csinal != "f");*/

        while (!csinal.equals("f")) {

            System.out.print("Mit szeretnél csinálni?\n");
            System.out.println("\ta - Nagy");
            System.out.println("\tb - Kicsi");
            System.out.println("\tc - Hossz");
            System.out.println("\td - Összehasonlít");
            System.out.println("\te - Kiiratás");
            System.out.println("\tf - Kilép");
            csinal = sc.nextLine().toLowerCase();

            switch (csinal) {
                default:
                    System.out.println("Hiba");
                    break;
                case "a":
                    szo = szo.toUpperCase();
                    System.out.println(szo);
                    break;
                case "b":
                    szo = szo.toLowerCase();
                    System.out.println(szo);
                    break;
                case "c":
                    System.out.println("A szöveg hossza: " + szo.length());
                    break;
                case "d":
                    System.out.println("Kérem a másik szót!");

                    String szo2 = sc.nextLine();

                    int osszehasonlit = szo.toUpperCase().compareTo(szo2.toLowerCase());

                    if (osszehasonlit < 0) {
                        System.out.println("Az első van előrébb!");
                    } else if (osszehasonlit > 0) {
                        System.out.println("A második szöveg van előrébb!");
                    } else {
                        System.out.println("A két szöveg megegyezik!");
                    }

                    break;
                case "e":
                    System.out.println("Mettől?");
                    int a = sc.nextInt();
                    System.out.println("Meddig?");
                    int b = sc.nextInt();

                    System.out.println(szo.substring(a - 1, b));
                    break;
                case "f":
                    System.out.println("Kilépés...");
                    break;

            }

        }

    }

}
