package p08_Arrays;

public class Zahlensysteme {
    public static void main(String[] args) {
        int dez = 182;
        System.out.println(KonverterDezimal2Dual(dez));

        String dual = "10110110";
        if (checkIfDual(dual)){
            System.out.println(KonverterDual2Dezimal(dual));
        }
    }
    public static String KonverterDezimal2Dual(int dez){
        StringBuilder dual = new StringBuilder();
        while(dez > 0){
            dual.append(String.valueOf(dez % 2));
            dez /= 2;
        }
        return dual.reverse().toString();
    }
    public static int KonverterDual2Dezimal(String dual){
        int dez = 0;
        for (int i = dual.length()-1; i >= 0; i--) {
            dez += (int) (Integer.parseInt(String.valueOf(dual.charAt(i)))*Math.pow(2, dual.length()-1-i));
        }
        return dez;
    }
    public static boolean checkIfDual(String dual){
        for (int i = 0; i < dual.length(); i++) {
            if (dual.charAt(i) != '0' && dual.charAt(i) != '1'){
                System.out.println("Die eingegebene Zahl ist keine Dualzahl.");
                return false;
            }
        }
        return true;
    }
}
