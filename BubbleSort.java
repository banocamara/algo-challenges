/**
 * Implémentation de l'algorithme de Tri à Bulles (Bubble Sort).
 * Ce script démontre la capacité à réorganiser un tableau de manière croissante.
 */
public class BubbleSort {

    /**
     * Trie un tableau d'entiers dans un ordre croissant.
     * @param arr Le tableau à trier
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Boucle principale qui passe à travers tout le tableau
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Boucle interne pour comparer les éléments côte à côte
            // Le "- i" permet de ne pas revérifier la fin du tableau déjà triée
            for (int j = 0; j < n - 1 - i; j++) {
                
                // Si l'élément de gauche est plus grand que celui de droite, on permute !
                if (arr[j] > arr[j + 1]) {
                    // Échange (Permutation) des deux éléments avec une variable temporaire
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true; // On signale qu'une modification a eu lieu
                }
            }

            // OPTIMISATION : Si aucun élément n'a été échangé pendant ce tour,
            // cela signifie que le tableau est DÉJÀ trié. On peut s'arrêter tôt !
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Tableau avant le tri :");
        printArray(data);

        // Appel de la méthode de tri
        sort(data);

        System.out.println("\nTableau après le tri à bulles :");
        printArray(data);
    }

    // Petite méthode utilitaire pour afficher proprement le tableau dans le terminal
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}