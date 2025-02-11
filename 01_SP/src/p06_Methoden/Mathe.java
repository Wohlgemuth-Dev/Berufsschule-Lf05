package p06_Methoden;

public class Mathe {
    public static void main(String[] args) {
        System.out.println(runden(1023.82273, 3));
    }
    public static double runden(double n, int nks){
            double d = n * Math.pow(10, nks);
            return Math.round(d) / Math.pow(10, nks);
    }
}
