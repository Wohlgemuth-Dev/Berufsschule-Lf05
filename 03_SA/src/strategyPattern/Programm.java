package strategyPattern;

public class Programm {
    public static void main(String[] args) {
        double[] array = {64, 34, 25, 12, 22, 11, 90};
        ISortierAlgorithmus SortingAlgorithim = new InsertionSort();
        SortingAlgorithim.sortiereAbsteigend(array);
        for (double elem : array){
            System.out.print(elem + ", ");
        }
        System.out.println();
        array = new double[]{64, 34, 25, 12, 22, 11, 90};
        SortingAlgorithim.sortiereAufsteigend(array);
        for (double elem : array){
            System.out.print(elem + ", ");
        }
    }
}
