package p04_Trainingslager;

import java.util.Arrays;

public class BinaerAddition {
    public static void main(String[] args) {
        int [] add;
        int [] dual1 = {1, 1, 0, 1};
        int [] dual2 = {1, 0, 1, 1};
        add = addiereDual(dual1, dual2);
        System.out.println(Arrays.toString(add));
    }

    public static int [] addiereDual(int [] dual1, int [] dual2){
        int buffer = 0;
        int maxIter;
        if (dual1.length >= dual2.length){
            maxIter = dual1.length;
        }
        else {
            maxIter = dual2.length;
        }
        int [] add = new int[maxIter + 1];
        for (int i = maxIter-1; i >= 0; i--){
            int temp = dual1[i] + dual2[i] + buffer;
            if (temp > 1){
                if (temp == 3){
                    add[i+1] = 1;
                }
                else {
                    add[i+1] = 0;
                }
                buffer = 1;
            }
            else {
                buffer = 0;
                add[i+1] = temp;
            }
        }
        if (buffer == 1){
            add[0] = 1;
        }
        return add;
    }
}
