public class Feladat15 {

    public static void main(String[] args) {
        double[] tomb = new double[25];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i]=Math.random()*200-100;
        }

        for (int i = 1; i < tomb.length; i+=2) {
            System.out.print((tomb[i]*tomb[i]+" "));
        }



    }

}
