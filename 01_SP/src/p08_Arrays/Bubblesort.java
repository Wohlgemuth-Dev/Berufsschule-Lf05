package p08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        // int[] arr = {5, 2, 3, 100, 28, 4, 2};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();
        double[] arr = new double[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Wert " + (i+1) + " eingeben: ");
            arr[i] = sc.nextDouble();
        }
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
