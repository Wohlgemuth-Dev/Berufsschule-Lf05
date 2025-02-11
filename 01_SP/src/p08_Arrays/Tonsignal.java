package p08_Arrays;

public class Tonsignal {
    public static void main(String[] args) {
        int[] sourceSignal = {1,5,4,5,7,6,8,6,5,4,5,4};
        System.out.println("Ursprungssignal");
        for (int i = 0; i < sourceSignal.length; i++) {
            System.out.print(sourceSignal[i] + "\t");
        }
        int[] resultSignal = new int[sourceSignal.length];
        resultSignal[0] = (sourceSignal[0]+sourceSignal[1])/2;
        resultSignal[sourceSignal.length-1] = (sourceSignal[sourceSignal.length-1]+sourceSignal[sourceSignal.length-2])/2;
        for (int i = 1; i < sourceSignal.length-1; i++) {
            resultSignal[i] = (sourceSignal[i-1] + sourceSignal[i] + sourceSignal[i+1])/3;
        }
        System.out.println("\nGeglättetes Signal");
        for (int i = 0; i < resultSignal.length; i++) {
            System.out.print(resultSignal[i] + "\t");
        }
    }
}
