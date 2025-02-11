package strategyPattern;

public class InsertionSort implements ISortierAlgorithmus{
    @Override
    public void sortiereAbsteigend(double[] liste) {
        int n = liste.length;

        // InsertionSort-Algorithmus (absteigend)
        for (int i = 1; i < n; i++) {
            double key = liste[i]; // Das aktuelle Element, das eingefügt werden soll
            int j = i - 1;

            // Schiebe alle kleineren Elemente nach rechts, um Platz für key zu schaffen
            while (j >= 0 && liste[j] < key) {
                liste[j + 1] = liste[j];
                j--;
            }

            // Füge das aktuelle Element an der korrekten Position ein
            liste[j + 1] = key;
        }
    }
    @Override
    public void sortiereAufsteigend(double[] liste) {
        int n = liste.length;

        // InsertionSort-Algorithmus
        for (int i = 1; i < n; i++) {
            double key = liste[i]; // Element, das eingefügt werden soll
            int j = i - 1;

            // Schiebe alle größeren Elemente nach rechts, um Platz für key zu machen
            while (j >= 0 && liste[j] > key) {
                liste[j + 1] = liste[j];
                j--;
            }

            // Füge das aktuelle Element an der korrekten Position ein
            liste[j + 1] = key;
        }
    }
}
