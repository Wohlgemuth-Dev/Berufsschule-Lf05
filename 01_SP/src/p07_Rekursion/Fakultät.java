package p07_Rekursion;

public class Fakultät {
    public static void main(String[] args) {
        int i = 4;
        fakRekursive(1, i);
        fakLoop(i);

    }
    public static int fakRekursive(int prod, int i){
        if (i == 1){
            System.out.println(prod);
            return prod;
        }
        return fakRekursive(prod*i, i-1);
    }
    public static void fakLoop(int i){
        int prod = 1;
        for (int j = 2; j <= i; j++){
            prod = prod*j;
        }
        System.out.println(prod);
    }
}
