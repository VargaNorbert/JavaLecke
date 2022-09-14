public class Feladat17 {

    public static void main(String[] args) {
        double[] tomb1= {1,2,3,4,5};
        double[] tomb2= {5,4,3,2,1};
        double[] tomb3= new double[5];

        for (int i = 0; i < 5; i++) {
            tomb3[i]=tomb1[i]+tomb2[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(tomb3[i]+";");
        }
    }

}
