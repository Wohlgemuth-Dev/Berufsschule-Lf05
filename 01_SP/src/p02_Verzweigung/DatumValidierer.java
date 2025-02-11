package p02_Verzweigung;

public class DatumValidierer {
    public static void main(String[] args) {

    }
    public static boolean validiereDatum(int tag, int monat, int jahr){
        if (!validiereJahr(jahr)){
            return false;
        }
        if (!validiereMonat(monat)){
            return false;
        }
        if (!validiereTag(tag, monat, jahr)){
            return false;
        }
        return true;
    }
    public static boolean validiereTag(int tag, int monat, int jahr){
        int[] monatslaenge = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (monat == 2) {
            if (!checkForSchaltjahr(jahr)){
                if (tag > 28 || tag <= 0){
                    return false;
                }
            } else {
                if (tag > 29 || tag <= 0){
                    return false;
                }
            }
        } else {
            if (tag > monatslaenge[monat-1] || tag <= 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkForSchaltjahr(int jahr){
        if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0){
            return true;
        }
        return false;
    }
    public static boolean validiereMonat(int monat){
        if (monat < 1 || monat > 12){
            return false;
        }
        return true;
    }
    public static boolean validiereJahr(int jahr){
        return true;
    }
}
