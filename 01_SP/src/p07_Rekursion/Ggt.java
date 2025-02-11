package p07_Rekursion;

public class Ggt {
    public static void main(String[] args) {
        int a = 26;
        int b = 13;
        ggtRekursive(a, b, 0);
        System.out.println(ggtLoop(a, b));

    }
    public static void ggtRekursive(int a, int b, int h) {
        if (b == 0){
            System.out.println(a);
            return;
        }
        h = a % b;
        a = b;
        b = h;
        ggtRekursive(a, b, h);
    }
    public static int ggtLoop(int a, int b) {
        int h=0;
        while(b!=0){
            h = a % b;
            a = b;
            b = h;
        }
        return a;
    }
}
