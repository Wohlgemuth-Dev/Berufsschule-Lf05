package strategyPattern;

public class BubbleSort implements ISortierAlgorithmus{

    @Override
    public void sortiereAufsteigend(double[] liste) {
        int n = liste.length;
        boolean swapped; // Optimierung, um unnötige Durchgänge zu vermeiden

        // Äußere Schleife - für jede Runde (alle Elemente durchlaufen)
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Innere Schleife - prüft jedes Paar in der Runde
            for (int j = 0; j < n - i - 1; j++) {
                // Vergleiche benachbarte Elemente
                if (liste[j] > liste[j + 1]) {
                    // Tausche sie, wenn sie in der falschen Reihenfolge sind
                    double temp = liste[j];
                    liste[j] = liste[j + 1];
                    liste[j + 1] = temp;

                    // Markiere, dass ein Tausch stattgefunden hat
                    swapped = true;
                }
            }

            // Wenn kein Tausch stattfand, ist das Array bereits sortiert
            if (!swapped) {
                break;
            }
        }
    }

    @Override
    public void sortiereAbsteigend(double[] liste) {
        int n = liste.length;
        boolean swapped; // Optimierung, um unnötige Durchgänge zu vermeiden

        // Äußere Schleife - alle Elemente solange durchlaufen
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Innere Schleife - prüft jedes benachbarte Paar
            for (int j = 0; j < n - i - 1; j++) {
                // Vergleiche benachbarte Elemente
                if (liste[j] < liste[j + 1]) {  // Vergleich für aufsteigende Reihenfolge
                    double temp = liste[j];
                    liste[j] = liste[j + 1];
                    liste[j + 1] = temp;

                    // Markiere, dass ein Tausch stattfand
                    swapped = true;
                }
            }

            // Kein Tausch mehr, Liste ist sortiert
            if (!swapped) {
                break;
            }
        }
    }
}
