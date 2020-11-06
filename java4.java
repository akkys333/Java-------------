
import java.util.Random;

public class Java4 {
    public static void main(String[] args){
        Random rand = new Random();
        int m = 10;
        int n = 15;
        int s = 0;
        int k = 0;
        double [] [] x = new double [10] [15];
        
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                x [i] [j] = (int) (Math.random()*9);
            }             
    }
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                if (x[i][j]>0){
                    k = k + 1;
                    s = (int) (s + x[i][j]);
                }
                System.out.println("Stolbec" + j + "Sum.poloz" + s + "Kol.poloz" + k);
            }
        }
    }
}