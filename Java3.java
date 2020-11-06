
import java.util.Random;

public class Java3 {
    public static void main(String[] args){
        Random rand = new Random();
        int m = 15;
        int n = 10;
        double s = 0;
        double [] [] x = new double [10] [15];
        double [] a = new double [10];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                x [i] [j] = (int) (Math.random()*9);
                s = s + (Math.sin(x[i][j])*Math.sin(x[i][j]));
            }
            System.out.println(s);
    }
        for (int l = 0; l < a.length; l++){
            a [l] = s/(Math.pow(Math.E, l+1));
        }
        }
        System.out.println(a [l]);
    }
