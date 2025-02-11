package p08_Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PQ_Formel_XL {
    public static void main(String[] args) {

    }
    public static double[] berechnePQ(double p, double q){
        double d = pow(p/2, 2)-q;
        if (d > 0){
            double[] ans = new double[2];
            ans[0] = (-(p/2)) - sqrt(d);
            ans[1] = (-(p/2)) + sqrt(d);
            return ans;
        }
        else if(d == 0){
            double[] ans = {-(p/2)};
            return ans;
        }
        else{
            double[] ans = new double[0];
            return ans;
        }
    }
}
