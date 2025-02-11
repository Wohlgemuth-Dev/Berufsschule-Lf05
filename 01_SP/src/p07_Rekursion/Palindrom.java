package p07_Rekursion;

public class Palindrom {
    public static void main(String[] args) {
        String str = "Regallager";
        isPalindromRekursive(str.toLowerCase(), str.length()/2);
        System.out.println(isPalindromLoop(str));
    }
    public static int isPalindromRekursive(String str, int i) {
        if (i == 0) {
            System.out.println(true);
            return 1;
        }
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
            System.out.println(false);
            return -1;
        }
        return isPalindromRekursive(str, i - 1);
    }
    public static boolean isPalindromLoop(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
