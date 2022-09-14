import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tomb = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Kérem a(z) " + (i + 1) + ". számot: ");

            tomb[i] = sc.nextInt();

        }

        for (int i = 0; i < 5; i++) {
            System.out.print(tomb[i] + ";");
        }
        System.out.println(" ");

        for (int i = 4; i > -1; i--) {
            System.out.print(tomb[i] + ";");
        }
        System.out.println(" ");

        for (int i = 1; i<5; i +=2) {
            System.out.print(tomb[i] + ";");
        }
        System.out.println(" ");

        System.out.print("Melyik elemet szeretné megtekinteni? ");
        int a = sc.nextInt();

        System.out.println(tomb[a-1]);
    }
}
