import java.util.Random;
public class Java {
    public static void main(String[] args) {
        Random rand = new Random();
        double [] x = new double [10];
        for (int k = 0; k < x.length; k++){
            x[k] = rand.nextDouble();
        }
        double [] [] y = new double [10] [10];
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++){
                y[i][j] = Math.log10(Math.abs((x[i]*x[j])));
                System.out.print(y[i][j] + "   ");
            }
         System.out.println();   
        }
    }
}
