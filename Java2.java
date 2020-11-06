public class Java2 {
    public static void main(String[] args) {
        double s = 0;
        double [] [] x = new double [10] [15];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                x [i] [j] = (int) (Math.random()*9);
                s = s + (Math.cos(x[i][j])*Math.cos(x[i][j])*Math.cos(x[i][j]));
            }
           System.out.println(s);
        }
        System.out.println();
    }
    
}