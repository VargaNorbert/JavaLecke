import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Szám?");
        double szam= sc.nextDouble();

        double osszeg=0;

        for (int i = 0; i < szam; i++) {
            if (i%2==1){
                osszeg+=i;
            }
        }

        System.out.println(osszeg);
    }
}

